package com.tiptostartmycode.restservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiptostartmycode.restservices.bean.Limits;
import com.tiptostartmycode.restservices.config.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	Configuration config;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(config.getMinimum(), config.getMaximum());
	}

}
