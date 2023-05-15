package com.aula01springultimate.aula1.services;

import org.springframework.stereotype.Service;

import com.aula01springultimate.aula1.entities.Order;

@Service
public class ShippingService {


	
	public double shipment (Order order) {
		if(order.getBasic() < 100) {
			return 20;
		}
		if(order.getBasic() >= 100 && order.getBasic()< 200) {
			return 12;
		}
		if(order.getBasic() >= 200) {
			return 0;
		}
		
		return 0;
	}
}
