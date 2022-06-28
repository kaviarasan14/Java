package com.methodoverload.org;

public class Classone {
	
	private void apple(int a) {
		
		System.out.println(a);
	
	}
	
	private void apple(int a, int b) {
		
		System.out.println(a + "" + b);

	}
	public static void main(String[] args) {
		
		Classone obj = new Classone();
		obj.apple(10);
		obj.apple(20, 30);
		
		
	}
	

}
