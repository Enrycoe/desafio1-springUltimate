package com.aula01springultimate.aula1;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aula01springultimate.aula1.entities.Order;
import com.aula01springultimate.aula1.services.OrderService;

@SpringBootApplication
public class Aula1Application implements CommandLineRunner{
	Scanner sc = new Scanner(System.in);
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Aula1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Digite o código do pedido: ");
		int cod = sc.nextInt();
		System.out.print("Digite o valor do pedido: ");
		double valor = sc.nextDouble();
		System.out.print("Digite o desconto do pedido: ");
		double desconto = sc.nextDouble();
		
		Order o1 = new Order(cod, valor, desconto);
		
		System.out.print("O código do pedido é: " + o1.getCode());
		System.out.println();
		System.out.print("O valor total do pedido é: R$" + String.format("%.2f", orderService.total(o1)));
		
				
		 
	}

}
