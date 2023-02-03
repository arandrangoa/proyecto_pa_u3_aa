package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_clie")
	@SequenceGenerator(name="seq_clie",sequenceName = "seq_clie", allocationSize = 1)
	@Column(name="clie_id")
	private Integer id;
	
	@Column(name="clie_nombre")
	private String nombre;
	
	@Column(name="clie_apellido")
	private String apellido;
	
	@Column(name="clie_numCedula")
	private String numCedula;
	
	@Column(name="clie_edad")
	private String edad;
	
	@OneToMany(mappedBy = "cliente")
	private List<Renta> rentas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumCedula() {
		return numCedula;
	}

	public void setNumCedula(String numCedula) {
		this.numCedula = numCedula;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}
	
	
	
	
}
