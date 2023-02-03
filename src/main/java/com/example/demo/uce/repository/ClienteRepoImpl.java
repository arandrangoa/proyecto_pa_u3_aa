package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		Cliente cliente=this.buscar(id);
		this.entityManager.remove(cliente);
	}

}
