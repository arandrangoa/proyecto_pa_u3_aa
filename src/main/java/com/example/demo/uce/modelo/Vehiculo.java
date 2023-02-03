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
@Table(name="vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vehi")
	@SequenceGenerator(name="seq_vehi", sequenceName = "seq_vehi",allocationSize = 1)
	@Column(name="vehi_id")
	private Integer id;
	
	@Column(name="vehi_placa")
	private String placa;
	
	@Column(name="vehi_modelo")
	private String modelo;
	
	@Column(name="vehi_fabricante")
	private String fabricante;
	
	@OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
	private List<Renta> rentas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}
	
	
	

}
