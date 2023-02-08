package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
		
		/*System.out.println("Busqueda por QueryTyped");
		Estudiante buscarEstudianteNombre=this.estudianteService.buscarPorNombreNamedQuery("Romeo");
		System.out.println(buscarEstudianteNombre);
		
		System.out.println("Busqueda por NamedQuery");
		Estudiante buscarEstudianteNombre2=this.estudianteService.buscarPorNombreNamedQuery("Romeo");
		System.out.println(buscarEstudianteNombre2);
		
		System.out.println("Busqueda por NamedQueryTyped");
		Estudiante buscarEstudianteNombre3=this.estudianteService.buscarPorNombreNamedQueryTyped("Romeo");
		System.out.println(buscarEstudianteNombre3);
		
		System.out.println("Busqueda por NativeQuery");
		Estudiante buscarEstudianteNombre4=this.estudianteService.buscarPorNombreNativeQuery("Romeo");
		System.out.println(buscarEstudianteNombre4);*/
		
		
		/*System.out.println("Busqueda por TYPED Y NATIVE");
		Estudiante buscarEstudianteNombre5 = this.estudianteService.buscarPorNombreNativeQueryTypedNamed("Romeo");
		System.out.println(buscarEstudianteNombre5);*/
		
		/*System.out.println("Busqueda por QueryTyped");
		Estudiante buscarEstudianteNombre=this.estudianteService.buscarPorNombreNamedQuery("Romeo");
		System.out.println(buscarEstudianteNombre);*/
		
		
		
		/*List <Estudiante> estudiantes= this.estudianteService.buscarPorNombreQueryList("Romeo");
		for(Estudiante e: estudiantes) {
			System.out.println(e);
		}*/
		
		/*Estudiante buscar1=this.estudianteService.buscarPorNombreQueryList0("Romeo");
		System.out.println(buscar1);*/
		
		System.out.println("NAMED QUERY TYPED");
		Estudiante buscar1 = this.estudianteService.buscarPorNombreNamedQueryTyped("Bryan");
		System.out.println(buscar1);

		
		
	}

}
