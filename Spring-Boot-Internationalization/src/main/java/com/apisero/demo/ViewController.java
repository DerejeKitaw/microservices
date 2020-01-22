package com.apisero.demo;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

	@Autowired
	MessageSource messageSource;

	@RequestMapping("/locale")
	public String locale(Locale locale) {
		System.out.print(locale.getLanguage());
		return messageSource.getMessage("error.notfound", null, locale);
	}

	@Scheduled(fixedRate = 1000)
	public void test() {
		System.out.println("Hello this tes scheduler");
	}
}
