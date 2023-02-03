package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Renta;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.service.IClienteService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IRentaService;
import com.example.demo.uce.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU3AaApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IRentaService iRentaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setFabricante("Chevrolet");
		vehiculo.setModelo("Camaro");
		vehiculo.setPlaca("TCX900");
		this.iVehiculoService.agregar(vehiculo);
		
		Cliente cliente=new Cliente();
		cliente.setApellido("Andrango");
		cliente.setEdad("24");
		cliente.setNombre("Alex");
		cliente.setNumCedula("1727193847");
		this.clienteService.insertar(cliente);
		
		Renta renta=new Renta();
		renta.setCliente(cliente);
		renta.setVehiculo(vehiculo);
		renta.setNumDias(5);
		renta.setFecha(LocalDateTime.now());
		
		this.iRentaService.insertar(renta, vehiculo.getPlaca(), cliente.getNumCedula());
		
		
		
	}

}
