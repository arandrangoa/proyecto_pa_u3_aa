package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void agregar(Vehiculo vehiculo);
	
	public void actualizar(Vehiculo vehiculo);
	
	public Vehiculo buscar(Integer id);
	
	public void elminar(Integer id);

}
