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
		
		System.out.println("Busqueda por QueryTyped");
		Estudiante buscarEstudianteNombre=this.estudianteService.buscarPorNOmbreQueryTyped("Romeo");
		System.out.println(buscarEstudianteNombre);
		
		System.out.println("Busqueda por NamedQuery");
		Estudiante buscarEstudianteNombre2=this.estudianteService.buscarPorNombreNamedQuery("Romeo");
		System.out.println(buscarEstudianteNombre2);
		
		System.out.println("Busqueda por NamedQuery");
		Estudiante buscarEstudianteNombre3=this.estudianteService.buscarPorNombreNamedQueryTyped("Romeo");
		System.out.println(buscarEstudianteNombre3);
		
		/*System.out.println("Busqueda por nombre");
		Estudiante buscarEstudianteNombre4=this.estudianteService.buscarPorNombreNativeQuery("Romeo");
		System.out.println(buscarEstudianteNombre);*/
		
		/*System.out.println("Busqueda por genero");
		Estudiante buscarEstudianteGenero=this.estudianteService.buscarPorGeneroQuery("Masculino");
		System.out.println(buscarEstudianteGenero);
		
		System.out.println("Busqueda por cedula");
		Estudiante buscarEstudianteCedula=this.estudianteService.buscarPorCedulaQuery("1756285381");
		System.out.println(buscarEstudianteCedula);
		
		System.out.println("Busqueda por ciudad");
		Estudiante buscarEstudianteCiudad=this.estudianteService.buscarPorCiudadQuery("Guayaquil");
		System.out.println(buscarEstudianteCiudad);*/
		
		
		
		
	}

}
