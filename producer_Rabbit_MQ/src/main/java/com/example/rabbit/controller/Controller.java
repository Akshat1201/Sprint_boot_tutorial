package com.example.rabbit.controller;

import java.util.UUID;

import com.example.configuration.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class Controller {
	@Autowired
	public RabbitTemplate rabbitTemplate;
	
	@PostMapping
	public String makeOrder(@RequestBody com.example.dto.order ordar) {
		ordar.setId(UUID.randomUUID().toString());
		rabbitTemplate.convertAndSend(config.EXCHANGE_NAME,config.ROUTING_KEY, ordar);
		return "order placed";
	}
	@GetMapping
	public String test() {
		return "hit success";
	}
}
