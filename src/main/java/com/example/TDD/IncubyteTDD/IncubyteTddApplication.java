package com.example.TDD.IncubyteTDD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IncubyteTddApplication {

	public static void main(String[] args) {
		
	}
	
	public int Add(String numbers)
	{
	  int sum=0;
	  
	  if(numbers.isBlank())
		{
			return sum;
		}
	  
	  String delimiter=",";
	  String[] number =numbers.split(delimiter);
	  
	  for(String strnumber:number)
		{

			sum=sum+Integer.parseInt(strnumber);
		}
	  
	  return sum;
	}

}
