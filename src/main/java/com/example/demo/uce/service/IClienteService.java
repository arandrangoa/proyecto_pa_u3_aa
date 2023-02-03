package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Cliente;

public interface IClienteService {
	
	public void insertar(Cliente cliente);
	
	public void actualizar(Cliente cliente);
	
	public Cliente buscar(Integer id);
	
	public void elminar(Integer id);

}
