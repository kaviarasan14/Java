package com.stringmethods.org;

public class Stringbuffersample {
	
	public static void main(String[] args) {
		
		StringBuffer abc = new StringBuffer("Ajith");
		
		 System.out.println(abc);
		 System.out.println(abc.append("Kumar"));
		 System.out.println(abc.insert(3, "e"));
		 System.out.println(abc.replace(0, 1, "ak"));
		 System.out.println(abc.delete(0, 2));
		 System.out.println(abc.reverse());
		 System.out.println(abc.capacity());
		 
	}

}
