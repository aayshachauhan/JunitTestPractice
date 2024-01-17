package com.zee.kansoft;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class KansoftApplicationTests {

	private Calculator c=new Calculator();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	@Disabled
	void testSum() {
		
		//expected result
		int expetedResult =17;
		
		//actual result
		int actualResult = c.doSum(12, 3, 2);
		
		assertThat(actualResult).isEqualTo(expetedResult);
	}
	
	//if we want to remove any test or don't want to test any particular case then just simply use @Disabled annotation and that
	
	@Test
	void testCompareNums() {
		
		//actual Result
		Boolean actualResult = c.compareTwoNums(2, 2);
		
		assertThat(actualResult).isTrue();
		
		
	}

}
