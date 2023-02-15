package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.IHotelRepository;

@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	private IHotelRepository hotelRepository;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelInnerJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelleftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelleftJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelrightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelrightJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelfullOuterJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelfullOuterJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelJoinFetch(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelJoinFetch(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelleftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelleftJoin();
	}

	@Override
	public List<Hotel> buscarHotelrightJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelrightJoin();
	}

	@Override
	public List<Hotel> buscarHotelfullOuterJoin() {
		// TODO Auto-generated method stub
		return null;
	}

}
