package com.in18minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
@Aspect
@Configuration
public class UseAccessAspect {
	Logger logger = LoggerFactory.getLogger(BeforeAspect.class);
	@Before("execution(* com.in18minutes.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		//In this case, access to this business layer package is determined at this point
		logger.info(" Check for user access ");
		logger.info(" Allowed execution for {}", joinPoint);
	}
}