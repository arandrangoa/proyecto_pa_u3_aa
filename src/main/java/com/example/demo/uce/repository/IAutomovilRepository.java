package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Automovil;

public interface IAutomovilRepository {
	
	public void insertar(Automovil automovil);
	
	public Automovil buscaPorMarcaQueryTyped(String marca);
	public Automovil buscarPorModeloQueryTyped(String modelo);
	public Automovil buscarPorColorQueryTyped(String color);
	
	public Automovil buscarPorPlacaNamedQuery(String placa);
	public Automovil buscarPorAnioNamedQuery(String anio);
	public Automovil buscarPorTransmicionNamedQuery(String transmicion);
	
	public Automovil buscarPorPlacaNativeQuery(String placa);
	public Automovil buscarPorColorNativeQuery(String color);
	public Automovil buscarPorTransmicionNativeQuery(String transmicion);
	
	public Automovil buscarPorMarcaNamedQueryNative(String marca);
	public Automovil buscarPorAnioNamedQueryNative(String anio);
	public Automovil buscarPorModeloNamedQueryNative(String modelo);
	
	

}
