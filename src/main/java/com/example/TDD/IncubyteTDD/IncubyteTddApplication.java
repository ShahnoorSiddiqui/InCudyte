package com.example.TDD.IncubyteTDD;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IncubyteTddApplication {

	public static void main(String[] args) {
		//Add("-1,2");
	}
	
	public int Add(String numbers)
	{
	  int sum=0;
	  String Delimiter=",";
	  String[] number = null;
	  
	  if(numbers.isBlank())
		{
			return sum;
		}
	  
	  if(numbers.startsWith("//"))
		{
              if(numbers.matches("//(.*)\n(.*)")){
			  Delimiter = Character.toString(numbers.charAt(2));
			  numbers = numbers.substring(4);
			}
		}
 
	  number=splitNumbers(numbers, Delimiter + "|\n");
	  for(String strnumber:number)
		{
		  if(Integer.parseInt(strnumber) < 0)
			  displayException(number);
		  
			sum=sum+Integer.parseInt(strnumber);
		}
	  
	  return sum;
	}

	private void displayException(String[] number) {
		String display="";
		 for(String strnumber:number)
		 {
			 if(Integer.parseInt(strnumber) <0)
			 {
				 if(display.equals(""))
					 display=strnumber;
				 else
			         display=display+","+strnumber;
			 }
		 }
		 throw new IllegalArgumentException("Negatives not allowed: " + display);
		
	}

	private String[] splitNumbers(String numbers, String Delimiter) {
		
		return numbers.split(Delimiter);
	}

}
