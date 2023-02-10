package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutomovilRepositoryImpl implements IAutomovilRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Automovil buscaPorMarcaQueryTyped(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery= this.entityManager.createQuery("select e from Automovil e where e.marca = :datoMarca", Automovil.class);
		myTypedQuery.setParameter("datoMarca", marca);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorModeloQueryTyped(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery= this.entityManager.createQuery("select e from Automovil e where e.modelo = :datoModelo", Automovil.class);
		myTypedQuery.setParameter("datoModelo", modelo);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorColorQueryTyped(String color) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery= this.entityManager.createQuery("select e from Automovil e where e.color = :datoColor", Automovil.class);
		myTypedQuery.setParameter("datoColor", color);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorPlaca");
		myQuery.setParameter("datoPlaca", placa);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorAnioNamedQuery(String anio) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorAnio");
		myQuery.setParameter("datoAnio", anio);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorTransmicionNamedQuery(String transmicion) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorTransmicion");
		myQuery.setParameter("datoTransmicion", transmicion);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select *from automovil where vehi_placa = :datoPlaca", Automovil.class);
		myQuery.setParameter("datoPlaca", placa);
		
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select *from automovil where vehi_color = :datoColor", Automovil.class);
		myQuery.setParameter("datoColor", color);
		
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorTransmicionNativeQuery(String transmicion) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select *from automovil where vehi_transmicion = :datoTransmicion", Automovil.class);
		myQuery.setParameter("datoTransmicion", transmicion);
		
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorMarcaNamedQueryNative(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorMarcaNative", Automovil.class);
		myQuery.setParameter("datoMarca", marca);
		return myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorAnioNamedQueryNative(String anio) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorAnioNative", Automovil.class);
		myQuery.setParameter("datoAnio", anio);
		return myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorModeloNamedQueryNative(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorModeloNative", Automovil.class);
		myQuery.setParameter("datoModelo", modelo);
		return myQuery.getSingleResult();
	}

	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}

}
