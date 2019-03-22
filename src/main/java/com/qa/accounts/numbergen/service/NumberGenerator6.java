package com.qa.accounts.numbergen.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

public class NumberGenerator6 implements GenInterface{
	
	@Value("${path.accountletter}")
	private String letter = "abc";
	
	@Override
	public String numGen() {
		
		char letterPart = letter.charAt(ThreadLocalRandom.current().nextInt(0, letter.length()));
		int numberPart = (int) ThreadLocalRandom.current().nextDouble(Math.pow(10, 5), Math.pow(10, 6));
		return letterPart +""+ numberPart;
	}

}
