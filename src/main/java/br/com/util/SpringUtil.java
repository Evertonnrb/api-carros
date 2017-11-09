package br.com.util;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {

	private static SpringUtil instance;
	protected AbstractXmlApplicationContext ctx;

	private SpringUtil() {
		try {
			ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		} catch (BeansException e) {
			e.printStackTrace();

			throw e;
		}
	}

	public static SpringUtil getInstance() {

		if (instance == null) {
			instance = new SpringUtil();
		}
		return instance;
	}

	
	@SuppressWarnings("rawtypes")
	public Object getBean(Class c) {
		if(ctx == null) {
			return null;
		}
		String[] beanNameForType = ctx.getBeanNamesForType(c);
		if(beanNameForType == null || beanNameForType.length == 0) {
			return null;
		}
		String name = beanNameForType[0];
		Object bean = getBean(name);
		return bean;
	}
	
	public Object getBean(String nome) {
		if(ctx == null) {
			return null;
		}
		Object bean = ctx.getBean(nome);
		return bean;
	}
	
	
	
	
	
	
	
	
	
	
}
