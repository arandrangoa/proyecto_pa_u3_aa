package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_nombre='Alex'
		//select e from Estudiante e where e.nombre= :datoNombre
		Query jpqlQuery=this.entityManager.createQuery("select e from Estudiante e where e.nombre= :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		return (Estudiante) jpqlQuery.getSingleResult(); //Retrona objetos de tipo generico por eso se hace el case del tipo de objeto en este caso estudainte
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		Query jpqlQuery2=this.entityManager.createQuery("select e2 from Estudiante e2 where e2.apellido= :datoApellido");
		jpqlQuery2.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery2.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery3=this.entityManager.createQuery("select e3 from Estudiante e3 where e3.genero= :datoGenero");
		jpqlQuery3.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuery3.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery4=this.entityManager.createQuery("select e4 from Estudiante e4 where e4.cedula= :datoCedula");
		jpqlQuery4.setParameter("datoCedula", cedula);
		return (Estudiante) jpqlQuery4.getSingleResult();

	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		Query jpqlQuery5=this.entityManager.createQuery("select e5 from Estudiante e5 where e5.ciudad= :datoCiudad");
		jpqlQuery5.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuery5.getSingleResult();

	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}
   
	


	

}
