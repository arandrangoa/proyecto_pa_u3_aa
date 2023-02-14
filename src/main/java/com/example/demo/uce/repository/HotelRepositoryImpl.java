package com.example.demo.uce.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepositoryImpl implements IHotelRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		// select * from hotel h join habitacion ha on h.hote_id=ha.habi_id_hotel
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h INNER JOIN h.habitaciones ha WHERE ha.tipo= :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		// Especificar que se quiere consultar bajo demanda
		List<Hotel> listaHoteles = myQuery.getResultList();
		for (Hotel h : listaHoteles) {
			List<Habitacion> listatmp =new ArrayList<>();
			for(Habitacion ha: h.getHabitaciones()) {
				if(ha.getTipo().equals(tipoHabitacion)) {
					listatmp.add(ha);
				}
			}
			h.setHabitaciones(listatmp);
		}
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelleftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub

		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("SELECT h FROM Hotel h LEFT JOIN h.habitaciones ha WHERE ha.tipo= :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);

		// Especificar que se quiere consultar bajo demanda
		List<Hotel> listaHoteles = myQuery.getResultList();
		for (Hotel h : listaHoteles) {
			h.getHabitaciones().size();
		}
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelrightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("SELECT h FROM Hotel h RIGHT JOIN h.habitaciones ha WHERE ha.tipo= :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);

		// Especificar que se quiere consultar bajo demanda
		List<Hotel> listaHoteles = myQuery.getResultList();
		/*for (Hotel h : listaHoteles) {
			h.getHabitaciones().size();
		}*/
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelfullOuterJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelJoinFetch(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
