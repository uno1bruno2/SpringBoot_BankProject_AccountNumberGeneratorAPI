package com.qa.accounts;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.accounts.controller.GenEndpoints;
import com.qa.accounts.numbergen.service.AppConfig;
import com.qa.accounts.numbergen.service.NumberGenerator10;
import com.qa.accounts.numbergen.service.NumberGenerator6;
import com.qa.accounts.numbergen.service.NumberGenerator8;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAccountsApplication {
	
	
	
	AppConfig generate = new AppConfig();
	NumberGenerator6 numgen6 = new NumberGenerator6();
	NumberGenerator8 numgen8 = new NumberGenerator8();
	NumberGenerator10 numgen10 = new NumberGenerator10();
	
	@InjectMocks
	private GenEndpoints controller;
	
	@Mock
	NumberGenerator6 service = new NumberGenerator6();

	private static final String MOCK_VALUE = "a123456";
	
	
	
//	@Test
//	public void smokeTest() {
//		assertThat(controller).isNotNull();
//	}
	
	@Test
	public void notEqualsSomething() {
		assertNotEquals("d123345", generate.accountNumberGenerator());
	}
	
	@Test
	public void notEqualsSomething6() {
		assertNotEquals("d123345", numgen6.numGen());
	}
	
	@Test
	public void notEqualsSomething8() {
		assertNotEquals("d12345345", numgen8.numGen());
	}
	
	@Test
	public void notEqualsSomething10() {
		assertNotEquals("d1234545345", numgen10.numGen());
	}
	
	@Test
	public void endpointsTest() {
		Mockito.when(service.numGen()).thenReturn(MOCK_VALUE);
		assertEquals(MOCK_VALUE, controller.getAccountNumber());
	}
	
	

}
