package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Automovil;
import com.example.demo.uce.repository.IAutomovilRepository;

@Service
public class AutomovilServiceImpl implements IAutomovilService{

	@Autowired
	private IAutomovilRepository automovilRepository;
	
	@Override
	public Automovil buscaPorMarcaQueryTyped(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscaPorMarcaQueryTyped(marca);
	}

	@Override
	public Automovil buscarPorModeloQueryTyped(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorModeloQueryTyped(modelo);
	}

	@Override
	public Automovil buscarPorColorQueryTyped(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorColorQueryTyped(color);
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorPlacaNamedQuery(placa);
	}

	@Override
	public Automovil buscarPorAnioNamedQuery(String anio) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorAnioNamedQuery(anio);
	}

	@Override
	public Automovil buscarPorTransmicionNamedQuery(String transmicion) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorTransmicionNamedQuery(transmicion);
	}

	@Override
	public Automovil buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorPlacaNativeQuery(placa);
	}

	@Override
	public Automovil buscarPorColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorColorNativeQuery(color);
	}

	@Override
	public Automovil buscarPorTransmicionNativeQuery(String transmicion) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorTransmicionNativeQuery(transmicion);
	}

	@Override
	public Automovil buscarPorMarcaNamedQueryNative(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorMarcaNamedQueryNative(marca);
	}

	@Override
	public Automovil buscarPorAnioNamedQueryNative(String anio) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorAnioNamedQueryNative(anio);
	}

	@Override
	public Automovil buscarPorModeloNamedQueryNative(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepository.buscarPorModeloNamedQueryNative(modelo);
	}

	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepository.insertar(automovil);
	}

	

}
