package com.exemple.demo.loggerAopAspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OfficeLogger {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OfficeLogger.class);

	@Before("execution(* com.exemple.demo.services.impl.OfficeService.*(..))")
	public void beforeSampleCreation() {
		LOGGER.info("A request was send to office ");
	}

	@After("execution(* com.exemple.demo.services.impl.OfficeService.*(..))")
	public void afterSampleCreation() {
		LOGGER.info("A request has been sent to office ");
	}
}
