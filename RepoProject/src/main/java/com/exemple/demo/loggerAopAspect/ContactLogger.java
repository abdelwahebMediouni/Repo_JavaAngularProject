package com.exemple.demo.loggerAopAspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ContactLogger {
	
	 private static final org.slf4j.Logger LOGGER =  LoggerFactory.getLogger(ContactLogger.class);
	    @Before("execution(* com.exemple.demo.services.impl.ContactService.*(..))")
	    public void beforeSampleCreation() {
	        LOGGER.info("A request was send to contacts ");
	    }
	    
	    @After("execution(* com.exemple.demo.services.impl.ContactService.*(..))")
	    public void afterSampleCreation() {
	        LOGGER.info("A request has been sent to contacts ");
	    }
}
