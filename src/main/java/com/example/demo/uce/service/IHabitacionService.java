package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.modelo.Habitacion;

public interface IHabitacionService {
	
	// Left Join
	public List<Habitacion> buscarHabitacionleftJoin();

	// Right Join
	public List<Habitacion> buscarHabitacionrightJoin();

	// Full outer Join
	public List<Habitacion> buscarHabitacionfullOuterJoin();

}
