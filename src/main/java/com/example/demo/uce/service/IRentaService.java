package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Renta;

public interface IRentaService {
	
	public void insertar(Renta renta, String cedula, String placa);
	
	public void actualziar(Renta renta);
	
	public Renta buscar(Integer id);
	
	public void elimnar(Integer id);

}
