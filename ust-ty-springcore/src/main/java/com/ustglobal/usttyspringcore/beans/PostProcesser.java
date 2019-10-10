package com.ustglobal.usttyspringcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcesser implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		if (beanName.equals("object")) {
			System.out.println("Hello World before init");
		} else if(beanName.equals("dog")) {
			System.out.println("Dog before init");
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean name : "+beanName);
		return bean;
	}

}
