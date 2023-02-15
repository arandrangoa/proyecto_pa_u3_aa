package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelService {
	
	//Inner Join
		public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
		
		//Left Join
		public List<Hotel> buscarHotelleftJoin(String tipoHabitacion);
		
		//Right Join
		public List<Hotel> buscarHotelrightJoin(String tipoHabitacion);
		
		//Full outer Join
		public List<Hotel> buscarHotelfullOuterJoin(String tipoHabitacion);
		
		//Fetch Join
		public List<Hotel> buscarHotelJoinFetch(String tipoHabitacion);
		
		
		// Left Join
		public List<Hotel> buscarHotelleftJoin();

		// Right Join
		public List<Hotel> buscarHotelrightJoin();

		// Full outer Join
		public List<Hotel> buscarHotelfullOuterJoin();
		

}
