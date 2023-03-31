package com.tiptostartmycode.restservices.bean;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyExchange {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionRate;
	private String port;

}
