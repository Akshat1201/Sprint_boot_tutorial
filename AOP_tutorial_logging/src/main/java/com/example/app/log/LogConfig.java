package com.example.app.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.app.Controller.controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LogConfig {
	
	Logger log =LoggerFactory.getLogger(LogConfig.class);
	
	@Pointcut("execution(* com.example.app.*.*.*(..) )")
	public void mypontCut() {
		
	}
	
	@Around("mypontCut()")
	public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
		ObjectMapper mapper=new ObjectMapper();
		String method=pjp.getSignature().getName();
		String classname=pjp.getTarget().toString();
		Object[] arrays=pjp.getArgs();
		
		try {
			log.info("method "+method+" class "+classname +" args "+mapper.writeValueAsString(arrays));
		} catch (JsonProcessingException e) {
			log.info("method "+method+" class "+classname +"no args");
			//e.printStackTrace();
		}
		
		Object obj=pjp.proceed();
		
		try {
			log.info("method "+method+" class "+classname +" args "+mapper.writeValueAsString(obj));
		} catch (JsonProcessingException e) {
			log.info("method "+method+" class "+classname +"no response");
			//e.printStackTrace();
		}
		return obj;
	}
	


}
