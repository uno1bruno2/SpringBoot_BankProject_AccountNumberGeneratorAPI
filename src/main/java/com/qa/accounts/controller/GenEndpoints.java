package com.qa.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.accounts.numbergen.service.GenInterface;


@RestController
public class GenEndpoints {
	
	private GenInterface service;

	public GenEndpoints(GenInterface service) {
		this.service = service;
	}

	@ResponseBody
	@GetMapping("/genNumber")
	public String getAccountNumber() {
		return this.service.numGen();
	}
	
	
	

}
