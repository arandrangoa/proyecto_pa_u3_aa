package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IAutomovilService;
import com.example.demo.uce.modelo.Automovil;

@SpringBootApplication
public class DeberPaU3Aa1Application implements CommandLineRunner{
	
	@Autowired
	private IAutomovilService automovilService;

	public static void main(String[] args) {
		SpringApplication.run(DeberPaU3Aa1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Automovil auto1=new Automovil();
		auto1.setAnio("2020");
		auto1.setColor("Negro");
		auto1.setMarca("Chevrolet");
		auto1.setModelo("Camaro");
		auto1.setPlaca("TCX900");
		auto1.setTransmicion("Manual");
		//this.automovilService.agregar(auto1);
		
		System.out.println("Busquedas por TypedQuery");
		Automovil e1 = this.automovilService.buscaPorMarcaQueryTyped("Chevrolet");
		System.out.println(e1);
		Automovil e2 = this.automovilService.buscarPorModeloQueryTyped("Camaro");
		System.out.println(e1);
		Automovil e3 = this.automovilService.buscarPorColorQueryTyped("Negro");
		System.out.println(e1);
		System.out.println("******************************************************");
		
		System.out.println("Busquedas por NamedQuery");
		Automovil e4 = this.automovilService.buscarPorPlacaNamedQuery("TCX900");
		System.out.println(e4);
		Automovil e5 = this.automovilService.buscarPorAnioNamedQuery("2020");
		System.out.println(e5);
		Automovil e6 = this.automovilService.buscarPorTransmicionNamedQuery("Manual");
		System.out.println(e6);
		System.out.println("******************************************************");
		
		System.out.println("Busquedas por NativeQuery");
		Automovil e7 = this.automovilService.buscarPorPlacaNativeQuery("TCX900");
		System.out.println(e7);
		Automovil e8 = this.automovilService.buscarPorColorNativeQuery("Negro");
		System.out.println(e8);
		Automovil e9 = this.automovilService.buscarPorTransmicionNativeQuery("Manual");
		System.out.println(e9);
		System.out.println("******************************************************");
		
		System.out.println("Busquedas por NamedNativeQuery");
		Automovil e10 = this.automovilService.buscarPorMarcaNamedQueryNative("Chevrolet");
		System.out.println(e7);
		Automovil e11 = this.automovilService.buscarPorAnioNamedQueryNative("2020");
		System.out.println(e8);
		Automovil e12 = this.automovilService.buscarPorModeloNamedQueryNative("Camaro");
		System.out.println(e9);
		System.out.println("******************************************************");
		
		
		
	}

}
