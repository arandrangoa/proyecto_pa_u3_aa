package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {
	
	public void insertar(Estudiante estudiante);
	
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorCiudadQuery(String ciudad);
	
	public Estudiante buscarPorNOmbreQueryTyped(String nombre);

	public Estudiante buscarPorNombreNamedQuery(String nombre);
	
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);

	public Estudiante buscarPorNombreNativeQuery(String nombre);
	
	public Estudiante buscarPorNombreNativeTypedNamed(String nombre);
}
