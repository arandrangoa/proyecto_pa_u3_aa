package com.example.demo.uce.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional 
public class EstudianteRepoImpl implements IEstudianteRepo{

	@PersistenceContext 
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		//select *from estudiante where estu_nombre = 'Edison'
		//select e from Estudiante e where e.nombre = :datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);//1er campo variable a setear segundo parametro con que se va a setear
		return (Estudiante) jpqlQuery.getSingleResult();//devuelve obejtos genericos por lo que se hace un cast a Estudiante
		
	}
	
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		// TODO Auto-generated method stub
		//select *from estudiante where estu_nombre = 'Edison'
		//select e from Estudiante e where e.nombre = :datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);//1er campo variable a setear segundo parametro con que se va a setear
		return jpqlQuery.getResultList();//devuelve obejtos genericos por lo que se hace un cast a Estudiante
		
	}
	
	public Estudiante buscarPorNombreQueryList0(String nombre) {
		// TODO Auto-generated method stub
		//select *from estudiante where estu_nombre = 'Edison'
		//select e from Estudiante e where e.nombre = :datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);//1er campo variable a setear segundo parametro con que se va a setear
		return (Estudiante) jpqlQuery.getResultList().get(0);//devuelve obejtos genericos por lo que se hace un cast a Estudiante
		
	}
	
	

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuery.getSingleResult();
	
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Estudiante) jpqlQuery.getSingleResult();
	
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		
		return myTypedQuery.getSingleResult();
	}

	//REUTILIZACION
	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNom");
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}
	//Podemos hacer una combinacion

	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	
	//NATIVE QUERY
	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select *from estudiante where estu_nombre = :datoNombre", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
	// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteDTO> myTypedQuery = this.entityManager
				.createQuery("select NEW com.example.demo.uce.modelo.dto.EstudianteDTO (e.nombre, e.apellido, e.cedula, e.genero )from Estudiante e where e.nombre = :datoNombre", EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreQueryCriteria(String nombre) {
		// TODO Auto-generated method stub
		
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		
		//Especificamos el tipo de retorno de mi Query
		CriteriaQuery<Estudiante> myQuery=myBuilder.createQuery(Estudiante.class);
		
		//Aqui empezamos a crear el SQL 
		//Definiendo el FROM-Root
		//Me dice que especifique mi tipo de tabla
		Root<Estudiante> miTableFrom= myQuery.from(Estudiante.class); //FROM Estudiante
		
		//Las condiciones WHERE se conocen en Critrial API Query como predicados
		//e.nombre = :datoNombre
		Predicate condicion1=myBuilder.equal(miTableFrom.get("nombre"), nombre);
		myQuery.select(miTableFrom).where(condicion1);
		//Declarado mi Query
		
		//La ejecucion del Query lo realizamos con cualquier tipo ya conocido: TypedQuery(Recomendacion)
		TypedQuery<Estudiante> mySQL=this.entityManager.createQuery(myQuery);
		
		return mySQL.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreQueryCriteriaAndOr(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		
		//Especificamos el tipo de retorno de mi Query
		CriteriaQuery<Estudiante> myQuery=myBuilder.createQuery(Estudiante.class);
		
		//Aqui empezamos a crear el SQL 
		//Definiendo el FROM-Root
		//Me dice que especifique mi tipo de tabla
		Root<Estudiante> miTableFrom= myQuery.from(Estudiante.class); //FROM Estudiante
		
		
		//M: e.nombre= AND e.apellido=
		//F: e.nombre= OR e.apllido=
		//Creamos los predicados
		//Predicado del nombre
		Predicate p1=myBuilder.equal(miTableFrom.get("nombre"), nombre);
		//Predicado del apellido
		Predicate p2=myBuilder.equal(miTableFrom.get("apellido"), apellido);
		
		
		Predicate predicadoFinal=null;		
		if(genero.equals("M")) {
			//Predicado de AND
			predicadoFinal=myBuilder.and(p1,p2);
		}else {
			//Predicado de AND
			predicadoFinal=myBuilder.or(p1,p2);
		}
		
		myQuery.select(miTableFrom).where(predicadoFinal);
		
		//La ejecucion del Query lo realizamos con cualquier tipo ya conocido: TypedQuery(Recomendacion)
		TypedQuery<Estudiante> mySQL=this.entityManager.createQuery(myQuery);
				
		return mySQL.getResultList();
		
		
	}

	
	
	
	
}