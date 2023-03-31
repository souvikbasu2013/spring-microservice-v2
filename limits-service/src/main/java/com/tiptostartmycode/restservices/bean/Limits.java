package com.tiptostartmycode.restservices.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Limits {
	private int minimum;
	private int maximum;
}
