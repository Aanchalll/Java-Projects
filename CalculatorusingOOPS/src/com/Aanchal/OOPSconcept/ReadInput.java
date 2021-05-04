package com.Aanchal.OOPSconcept;

import java.util.Scanner;

public class ReadInput {
public static String read() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input expressions (for eg: 4*3/2) - ");
String input=sc.nextLine();
sc.close();
return input;
}
}

