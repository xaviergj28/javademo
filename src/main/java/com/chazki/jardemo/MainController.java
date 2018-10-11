package com.chazki.jardemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MainController {

	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String createProducts() {
		return "Hi 5!!!";
	}
}
