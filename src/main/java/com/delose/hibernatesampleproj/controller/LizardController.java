package com.delose.hibernatesampleproj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LizardController {

	@RequestMapping("/lizard")
	public String index() {
		return "Greetings from awoken lizard!";
	}
	
}
