package com.posidex.component;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.posidex.service.ProductServiceInterceptor;

@Component
public class ProductServiceInterceptorAppConfig extends WebMvcConfigurerAdapter{
	
	
	@Autowired 
	ProductServiceInterceptor productServiceInterseptor;
	@Override
	public void addInterceptors(InterceptorRegistry registory) {
		registory.addInterceptor(productServiceInterseptor);
	}
	
}
