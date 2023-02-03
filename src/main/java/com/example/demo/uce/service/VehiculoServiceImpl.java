package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.repository.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired
	private IVehiculoRepo iVehiculoRepo;

	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.actualizar(vehiculo);
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.buscar(id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.eliminar(id);;
	}

}
