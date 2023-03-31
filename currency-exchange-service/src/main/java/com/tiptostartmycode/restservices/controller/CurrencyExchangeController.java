package com.tiptostartmycode.restservices.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tiptostartmycode.restservices.bean.CurrencyExchange;

@RestController
public class CurrencyExchangeController {
	
	@Value("${server.port}")
	String port;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange getExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		return new CurrencyExchange(1000L, "USD", "INR", BigDecimal.valueOf(80.0),port);
		
	}

}
