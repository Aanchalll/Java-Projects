package com.Aanchal.OOPSconcept;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainApp {
 public static void main( String[] args)
 {
	 final String input= ReadInput.read();
	 Queue <String> operations;
	 Queue <String> numbers;
	 
	 String numbersArr[] = input.split("[-+*/]"); //will contain all the numbers present in the input
	 String operArr[]=input.split("[0-9]"); // will contain all the operators
	 
	 numbers= new LinkedList<String>(Arrays.asList(numbersArr));
	 operations = new LinkedList<String>(Arrays.asList(operArr));
	 
	 Double res= Double.parseDouble(numbers.poll()); // poll() to take one  uppermost value
	  
	 while(!numbers.isEmpty())
	 {
		 String opr=operations.poll();
		 //
		 Operate operate;
		 switch(opr)
		 {
		 case "+":
			 operate=new Add();
			 break;
		 case "-":
			 operate=new Subtract();
			 break;
		 case "*":
			 operate=new Multiply();
			 break;
		 case "/":
			 operate=new Divide();
			 break;
		default:
			continue;
		 }
		 Double num = Double.parseDouble(numbers.poll());
		 res=operate.getResult(res,num);
	 }
	 System.out.println(res);
		 
	 }
 }
	
	
