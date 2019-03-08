package com.exemple.demo.loggerAopAspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AddressLogger {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(AddressLogger.class);

	@Before("execution(* com.exemple.demo.services.impl.AddressService.*(..))")
	public void beforeSampleCreation() {
		LOGGER.info("A request was send to address ");
	}

	@After("execution(* com.exemple.demo.services.impl.AddressService.*(..))")
	public void afterSampleCreation() {
		LOGGER.info("A request has been sent to address ");
	}
}
