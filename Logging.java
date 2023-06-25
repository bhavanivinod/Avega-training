package com.avega.jdbc.aop;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

	private Logger logger=LoggerFactory.getLogger(getClass().getName());
	@Before("execution(* com.avega.jdbc.serviceimpl.*.edit*(..))")
	public void beforeAdvice(JoinPoint theJointPoint)
	{
		 String theMethod = theJointPoint.getSignature().toShortString();
		logger.info("Before calling method!!!"+theMethod);
		
	}
	
	
	
	@After("execution(* com.avega.jdbc.serviceimpl.*.edit*(..))")
	public void AfterAdvice(JoinPoint theJointPoint)
	{
		 String theMethod = theJointPoint.getSignature().toShortString();
		logger.info("After calling method!!!"+theMethod);
		
	}
}
