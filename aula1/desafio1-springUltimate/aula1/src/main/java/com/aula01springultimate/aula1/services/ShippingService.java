package com.aula01springultimate.aula1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula01springultimate.aula1.entities.Order;

@Service
public class ShippingService {

	@Autowired
	private OrderService orderService;
	
	public double shipment(Order order) {
		if(orderService.total(order) < 100) {
			return orderService.total(order) + 20;
		}
		if(orderService.total(order) >= 100 && orderService.total(order) < 200) {
			return orderService.total(order) + 12;
		}
		if(orderService.total(order) >= 200) {
			return orderService.total(order);
		}
		return 0;
	}
}
