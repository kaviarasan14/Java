package com.scanner.org;

import java.util.Scanner;

public class Scanner_sample {
	
	public static void main(String[] args) {
		
		Scanner abc = new Scanner(System.in);
		 
		System.out.println("Name");
		
		String name = abc.nextLine();
		
		System.out.println("score");
	
		int age = abc.nextInt();
		
		System.out.println(" ODI Best " + age );
		
		
		
	}

}
