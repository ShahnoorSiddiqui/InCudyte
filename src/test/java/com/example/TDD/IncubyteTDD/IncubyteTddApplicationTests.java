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

	@Test
	void TestCase3()
	{
		IncubyteTddApplication strCalc=new IncubyteTddApplication();
		int output = strCalc.Add("1\n2,3");
		assertEquals(6, output);
	}
	
	@Test
	void TestCase4()
	{
		IncubyteTddApplication strCalc=new IncubyteTddApplication();
		int output = strCalc.Add("//;\n1;2");
		assertEquals(3, output);
	}
	
	@Test
	public void TestCase5(){
		
		IncubyteTddApplication strCalc=new IncubyteTddApplication();
    	try {
    		strCalc.Add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			strCalc.Add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
    }
	
	@Test
	void TestCase6()
	{
		IncubyteTddApplication strCalc=new IncubyteTddApplication();
		int output = strCalc.Add("2,1002");
		assertEquals(2, output);
	}
	
	
}
