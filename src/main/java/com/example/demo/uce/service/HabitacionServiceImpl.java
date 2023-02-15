package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.repository.IHabitacionRepository;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
	
	@Autowired
	private IHabitacionRepository habitacionRepository;

	@Override
	public List<Habitacion> buscarHabitacionleftJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepository.buscarHabitacionleftJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionrightJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepository.buscarHabitacionrightJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionfullOuterJoin() {
		// TODO Auto-generated method stub
		return null;
	}

}
