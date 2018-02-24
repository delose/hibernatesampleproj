package com.delose.hibernatesampleproj.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LizardController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from awoken lizard!";
	}
	
}
