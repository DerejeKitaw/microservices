package com.posidex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.posidex.filter.ErrorFilter;
import com.posidex.filter.PostFilter;
import com.posidex.filter.PreFilter;
import com.posidex.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulProxyServerAndRoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulProxyServerAndRoutingApplication.class, args);
	}
	 public PreFilter preFilter() {
	        return new PreFilter();
	    }
	    @Bean
	    public PostFilter postFilter() {
	        return new PostFilter();
	    }
	    @Bean
	    public ErrorFilter errorFilter() {
	        return new ErrorFilter();
	    }
	    @Bean
	    public RouteFilter routeFilter() {
	        return new RouteFilter();
	    }
}
