package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3AaApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Busqueda por apellido");
		Estudiante buscarEstudianteApellido=this.estudianteService.buscarPorApellido("Mendoza");
		System.out.println(buscarEstudianteApellido);
		
		System.out.println("Busqueda por genero");
		Estudiante buscarEstudianteGenero=this.estudianteService.buscarPorGenero("Masculino");
		System.out.println(buscarEstudianteGenero);
		
		System.out.println("Busqueda por cedula");
		Estudiante buscarEstudianteCedula=this.estudianteService.buscarPorCedula("1756285381");
		System.out.println(buscarEstudianteCedula);
		
		System.out.println("Busqueda por ciudad");
		Estudiante buscarEstudianteCiudad=this.estudianteService.buscarPorCiudad("Guayaquil");
		System.out.println(buscarEstudianteCiudad);
		
		
		
		
	}

}
