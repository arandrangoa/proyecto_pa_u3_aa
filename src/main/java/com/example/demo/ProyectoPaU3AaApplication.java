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
import com.example.demo.uce.modelo.dto.EstudianteDTO;
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
		
		
		
		/*System.out.println("NAMED QUERY TYPED");
		Estudiante buscar1 = this.estudianteService.buscarPorNombreNamedQueryTyped("Alejandra");
		System.out.println(buscar1);*/
		
		/*System.out.println("Busqueda con Criteria API Query And");
		List<Estudiante> buscar3=this.estudianteService.buscarPorNombreQueryCriteriaAndOr("Alejandra", "Mendoza", "M");
		System.out.println(buscar3);
		
		System.out.println("******************************************");
		
		System.out.println("Busqueda con Criteria API Query Or");
		List<Estudiante> buscar4=this.estudianteService.buscarPorNombreQueryCriteriaAndOr("Alejandra", "Mendoza", "F");
		System.out.println(buscar4);*/
		
		/*System.out.println("Elminar por apellido");
		int e1 = this.estudianteService.eliminarPorApellido("Lucano");
		System.out.println(e1);
		System.out.println("***********************************");
		
		System.out.println("Actualizar por apellido");
		int e2= this.estudianteService.actualizarPorApellido("Mendoza", "Darleen");
		System.out.println(e2);*/
		
	}

}
