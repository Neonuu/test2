package com.zp.test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class ControllerAspect {

	@Pointcut("within(com.zp.test.controller..*)")
	public void mypoint(){}
	
	@Before("mypoint()")
	public void mybefore(){
		System.out.println("����Controller����");
	}
	
}
