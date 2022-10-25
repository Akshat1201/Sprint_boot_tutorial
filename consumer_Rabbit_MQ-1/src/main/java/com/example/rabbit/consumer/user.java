package com.example.rabbit.consumer;

import com.example.configuration.config;
import com.example.dto.order;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class user {
	
	@RabbitListener(queues = config.QUEUE_NAME)
	public void consumeMessage(order Order) {
		System.out.println("Order is "+Order);
	}

}
