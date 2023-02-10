package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil")

@NamedQueries({
	@NamedQuery(name = "Automovil.buscarPorMarca", query = "select e from Automovil e where e.marca = :datoMarca"),
	@NamedQuery(name = "Automovil.buscarPorModelo", query = "select e from Automovil e where e.modelo = :datoModelo"),
	@NamedQuery(name = "Automovil.buscarPorColor", query = "select e from Automovil e where e.color = :datoColor"),
	@NamedQuery(name = "Automovil.buscarPorPlaca", query = "select e from Automovil e where e.placa = :datoPlaca"),
	@NamedQuery(name = "Automovil.buscarPorAnio", query = "select e from Automovil e where e.anio = :datoAnio"),
	@NamedQuery(name = "Automovil.buscarPorTransmicion", query = "select e from Automovil e where e.transmicion = :datoTransmicion")})

@NamedNativeQueries({
	@NamedNativeQuery(name = "Automovil.buscarPorMarcaNative", query = "select *from automovil where vehi_marca = :datoMarca", resultClass = Automovil.class),
	@NamedNativeQuery(name = "Automovil.buscarPorModeloNative", query = "select *from automovil where vehi_modelo = :datoModelo", resultClass = Automovil.class),
	@NamedNativeQuery(name = "Automovil.buscarPorColorNative", query = "select *from automovil where vehi_color = :datoColor", resultClass = Automovil.class),
	@NamedNativeQuery(name = "Automovil.buscarPorPlacaNative", query = "select *from automovil where vehi_placa = :datoPlaca", resultClass = Automovil.class),
	@NamedNativeQuery(name = "Automovil.buscarPorAnioNative", query = "select *from automovil where vehi_anio = :datoAnio", resultClass = Automovil.class),
	@NamedNativeQuery(name = "Automovil.buscarPorTransmicionNative", query = "select *from automovil where vehi_transmicion = :datoTransmicion", resultClass = Automovil.class)})


public class Automovil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_seq")
	@SequenceGenerator(name = "vehi_seq", sequenceName = "vehi_seq", allocationSize = 1)
	@Column(name = "vehi_id")
	private Integer id;
	
	@Column(name = "vehi_marca")
	private String marca;
	
	@Column(name = "vehi_modelo")
	private String modelo;
	
	@Column(name = "vehi_color")
	private String color;
	
	@Column(name = "vehi_placa")
	private String placa;
	
	@Column(name = "vehi_anio")
	private String anio;
	
	@Column(name = "vehi_transmicion")
	private String transmicion;
	
	//GET Y SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getTransmicion() {
		return transmicion;
	}

	public void setTransmicion(String transmicion) {
		this.transmicion = transmicion;
	}

	@Override
	public String toString() {
		return "Automovil [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", placa="
				+ placa + ", anio=" + anio + ", transmicion=" + transmicion + "]";
	}
	
	
	
	

}
