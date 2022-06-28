package com.stringmethods.org;

public class Classtwo {
	public static void main(String[] args) {
		
		String name = "Ajith";
		String name1 = new String("Kumar");
		
		System.out.println(name+name1);
		System.out.println(name.charAt(3));
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareToIgnoreCase(name1));
		System.out.println(name1.concat(name));
		System.out.println(name.contains("p"));
		System.out.println(name1.endsWith("r"));
		System.out.println(name.equals(name1));
		System.out.println(name1.equalsIgnoreCase(name));
		System.out.println(name1.indexOf("a"));
		System.out.println(name.isEmpty());
		System.out.println(name.lastIndexOf('t'));
		System.out.println(name.length());
		System.out.println(name.replace("Ajith", "Anil"));
		System.out.println(name.startsWith("A"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		
	}

}
