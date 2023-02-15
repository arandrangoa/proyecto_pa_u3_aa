package com.example.demo.uce.repository;

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
public class HabitacionRepositoryImpl implements IHabitacionRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public List<Habitacion> buscarHabitacionleftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> myQuery = this.entityManager
				.createQuery("SELECT ha FROM Hotel h LEFT JOIN h.habitaciones ha  ", Habitacion.class);
		List<Habitacion> lista=myQuery.getResultList();
		return lista;
	}

	@Override
	public List<Habitacion> buscarHabitacionrightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> myQuery = this.entityManager
				.createQuery("SELECT ha FROM Hotel h RIGHT JOIN h.habitaciones ha  ", Habitacion.class);
		List<Habitacion> lista=myQuery.getResultList();
		return lista;
	}

	@Override
	public List<Habitacion> buscarHabitacionfullOuterJoin() {
		// TODO Auto-generated method stub
		return null;
	}

}
