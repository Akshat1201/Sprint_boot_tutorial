package com.example.rabbit.consumer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.configuration.config;
import com.example.dto.order;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class user {
	
	@RabbitListener(queues = config.QUEUE_NAME)
	public void consumeMessage(order Order) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER CHOICE");
			int a=Integer.parseInt(br.readLine());
			while(a==1) {
			System.out.println("Order is "+Order);
			}
			System.out.println("order ended");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
