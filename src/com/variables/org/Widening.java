package com.variables.org;

public class Widening {

public static void main(String[] args) {
	//widening
	int a = 10;
	long b = a;
	
	
	//narrowing
	long c = 20;
	int d = (int)c;
	
    System.out.println(b);
    System.out.println(d);
}
}
