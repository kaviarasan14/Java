package com.variables.org;

public class Class {
	
	static int a = 10;  //Static variable
	
	int c = 30;
	
	private static void methodone() {
		
		float d = 40.5f;
		System.out.println(d);

	}
	
	public static void main(String[] args) {
		
      int b = 20;
      
      System.out.println(a);
      System.out.println(b);
      
      Class abc = new Class();
      System.out.println(abc.c);
      methodone();
      	
	}
	

}
