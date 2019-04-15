package com.posidex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping(value = "/")
	   public String hello() {
	      return "Hello World";
	   }
}
