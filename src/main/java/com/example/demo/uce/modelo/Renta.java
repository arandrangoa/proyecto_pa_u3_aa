package com.example.demo.uce.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="renta")
public class Renta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rent_seq") 
	@SequenceGenerator(name="rent_seq", sequenceName = "rent_seq", allocationSize = 1)
	@Column(name="rent_id")
	private Integer id;
	
	@Column(name="rent_fecha")
	private LocalDateTime fecha;
	
	@Column(name="rent_numDiaz")
	private Integer numDias;
	
	@ManyToOne
	@JoinColumn(name="rent_id_vehiculo")
	private Vehiculo vehiculo;
	
	@ManyToOne
	@JoinColumn(name="rent_id_cliente")
	private Cliente cliente;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Integer getNumDias() {
		return numDias;
	}

	public void setNumDias(Integer numDias) {
		this.numDias = numDias;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

}
