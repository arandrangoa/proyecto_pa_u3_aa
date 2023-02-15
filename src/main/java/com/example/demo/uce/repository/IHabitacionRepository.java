package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.modelo.Habitacion;


public interface IHabitacionRepository {
	
	// Left Join
	public List<Habitacion> buscarHabitacionleftJoin();

	// Right Join
	public List<Habitacion> buscarHabitacionrightJoin();

	// Full outer Join
	public List<Habitacion> buscarHabitacionfullOuterJoin();

}
