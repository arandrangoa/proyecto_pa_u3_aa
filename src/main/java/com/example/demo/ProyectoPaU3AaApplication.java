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
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.dto.EstudianteDTO;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3AaApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;

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
		
	/*	List<Hotel> listaInner=this.hotelService.buscarHotelInnerJoin("VIP");
		for(Hotel h: listaInner) {
			System.out.println(h.getNombre());
			for(Habitacion ha: h.getHabitaciones()){
				System.out.println("Las habitaciones es: "+ha.getNumero());
			}
			System.out.println();
		}*/
		System.out.println("JOIN FETCH");
		List<Hotel> lista2=this.hotelService.buscarHotelJoinFetch("VIP");
		for(Hotel h: lista2) {
			System.out.println(h.getNombre());
			for(Habitacion ha: h.getHabitaciones()){
				System.out.println("Las habitaciones es: "+ha.getNumero());
			}
			System.out.println();
		}
		
		System.out.println("********************************************");
		
		System.out.println("LEFT JOIN HOTEL");
		//LEFT HOTEL
		List<Hotel> lista3=this.hotelService.buscarHotelleftJoin();
		for(Hotel h: lista3) {
			System.out.println(h.getNombre());
//			for(Habitacion ha: h.getHabitaciones()){
//				System.out.println("Las habitaciones son: "+ha.getNumero());
//			}
		}
		
		System.out.println("********************************************");
		System.out.println("LEFT JOIN HABITACION");
		//LEFT HABITACION
		List<Habitacion> listaH=this.habitacionService.buscarHabitacionleftJoin();
		for(Habitacion ha: listaH) {
			System.out.println(ha!=null? ha.getNumero():null);
		}
		System.out.println("********************************************");
		System.out.println("RIGHT JOIN HOTEL");
		//RIGHT HOTEL
		List<Hotel> listaR=this.hotelService.buscarHotelrightJoin();
		for(Hotel h: listaR) {
			System.out.println(h!=null? h.getNombre():null);
//			for(Habitacion ha: h.getHabitaciones()){
//				System.out.println("Las habitaciones son: "+ha.getNumero());
//			
		}
		System.out.println("********************************************");
		System.out.println("RIGHT JOIN HABITACION");
		//RIGHT HABITACION
		List<Habitacion> listaHR=this.habitacionService.buscarHabitacionrightJoin();
		for(Habitacion ha: listaHR) {
			System.out.println(ha!=null? ha.getNumero():null);
			System.out.println(ha.getHotel());
		}
		
	}

}
