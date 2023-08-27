package com.kodnest.immutablestrings;

public class Stringendswith {
	public static void main(String[] args) {
		String s1="hello world!";
		boolean endsWithWorld=s1.endsWith("world!");
		boolean endsWithExclamnation=s1.endsWith("!");
		System.out.println("string ends with world! : "+endsWithWorld);
		System.out.println("string ends with world '!' : "+endsWithExclamnation);
		
	}

}
