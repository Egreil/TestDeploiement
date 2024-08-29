package com.tpdeploiement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPI {
	
	@GetMapping("/")
	public String appelAPi() {
		return "{ \r\n"
				+ "\r\n"
				+ "\"name\":\"Votre nom\", \r\n"
				+ "\r\n"
				+ "\"email\": \"votreMail@campus-eni.fr\", \r\n"
				+ "\r\n"
				+ "\"Date\": \"Date du jour\" \r\n"
				+ "\r\n"
				+ "} ";
	}

}
