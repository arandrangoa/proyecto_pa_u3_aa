package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.repository.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertar(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizar(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscar(id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.elminar(id);
	}

}
