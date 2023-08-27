package com.kodnest.immutablestrings;

public class Stringstartswith {
	public static void main(String[] args) {
		String s1="hello kodnest";
		boolean startsWithHi=s1.startsWith("hello");
		boolean startsWithKod=s1.startsWith("kod");
		System.out.println("string starts with hello :"+startsWithHi);
		System.out.println("string starts with kod : "+startsWithKod);
	}

}
