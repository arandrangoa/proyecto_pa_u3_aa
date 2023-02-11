package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelRepository {
	
	//Inner Join
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);

}
