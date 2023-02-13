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
		auto1.setColor("Vino");
		auto1.setMarca("Toyota");
		auto1.setModelo("Yaris");
		auto1.setPlaca("TPA1530");
		auto1.setTransmicion("Manual");
		//this.automovilService.agregar(auto1);
		
		System.out.println("Eliminacion");
		int a1=this.automovilService.eliminarPorPlaca("TCX900");
		System.out.println(a1);
		
		int a2=this.automovilService.eliminarPorPlaca("TPA1530");
		System.out.println(a2);
		
		System.out.println("**********************************************************");
		System.out.println("Actualizacion");
		
		int a3=this.automovilService.actualizarPorPlaca("GPQ865", "Plomo");
		System.out.println(a3);
		
		int a4=this.automovilService.actualizarPorPlaca("PCA865", "Vino");
		System.out.println(a4);
		
	}

}
