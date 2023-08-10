package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	@GetMapping("/display")
	public String disply() {
		return "Hi";
	}
	@GetMapping("/getAddress")
	public String getAddress() {
		return "Kolkata";
	}

}
