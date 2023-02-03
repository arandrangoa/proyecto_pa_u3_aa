package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Renta;

public interface IRentaRepo {
	
	public void insertar(Renta renta,String cedula, String placa);
	
	public void actualziar(Renta renta);
	
	public Renta buscar(Integer id);
	
	public void eliminar(Integer id);
	

}
