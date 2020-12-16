package com.example.TDD.IncubyteTDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class IncubyteTddApplicationTests {

	@Test
	void TestCase0() {
		IncubyteTddApplication strCalc=new IncubyteTddApplication();
		int output =strCalc.Add("");
		assertEquals(0, output);
	}
	
	@Test
	void TestCase1()
	{
		IncubyteTddApplication strCalc=new IncubyteTddApplication();
		int output = strCalc.Add("1,2");
		assertEquals(3, output);
	}
	
	@Test
	void TestCase2()
	{
		IncubyteTddApplication strCalc=new IncubyteTddApplication();
		int output = strCalc.Add("1,2,3,4,5,6,7,8,9,10");
		assertEquals(55, output);
	}

}
