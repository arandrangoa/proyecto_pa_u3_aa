package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.dto.EstudianteDTO;

public interface IEstudianteRepo {
	
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorCiudadQuery(String ciudad);
	
	
	public Estudiante buscarPorNombreQueryTyped(String nombre);
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	
	//NATIVE QUERY
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	//MEZCLA CON TYPED Y NATIVE
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
	
	
	
	public List <Estudiante> buscarPorNombreQueryList(String nombre);
	/*public List <Estudiante> buscarPorNombreNamedQueryList(String nombre);
	public List <Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);*/
	
	public Estudiante buscarPorNombreQueryList0(String nombre);
	
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre);
	
	
	public Estudiante buscarPorNombreQueryCriteria(String nombre);
	
	
	
	public List<Estudiante> buscarPorNombreQueryCriteriaAndOr(String nombre, String apellido, String bandera);
	
}
