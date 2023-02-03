package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Renta;
import com.example.demo.uce.repository.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService{
	
	@Autowired
	private IRentaRepo iRentaRepo;

	@Override
	public void insertar(Renta renta, String cedula, String placa) {
		// TODO Auto-generated method stub
		this.iRentaRepo.insertar(renta, cedula, placa);
	}

	@Override
	public void actualziar(Renta renta) {
		// TODO Auto-generated method stub
		this.iRentaRepo.actualziar(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iRentaRepo.buscar(id);
	}

	@Override
	public void elimnar(Integer id) {
		// TODO Auto-generated method stub
		this.iRentaRepo.eliminar(id);
	}

}
