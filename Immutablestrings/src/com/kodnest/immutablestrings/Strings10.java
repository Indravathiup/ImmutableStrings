package com.kodnest.immutablestrings;

public class Strings10 {
	public static void main(String[] args) {
		String s1=new String("indhu");
		String s2=new String("INDHU");
		if(s1==s2)
		{
			System.out.println("references comparison using equal to operator");
			System.out.println("references are equal");
		}
		else
		{
			System.out.println("references comparison using equal to operator");
			System.out.println("references are unequal");
		}
		System.out.println("===============================");
		if(s1.equals(s2)) {
			System.out.println("strings comparison using equals method");
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("strings comparison using equals method");
			System.out.println("strings are unequal");
			
		}
		System.out.println("===============================");
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings comaprison using equals ignore case method");
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("Strings comaprison using equals ignore case method");
			System.out.println("strings are unequal");

		}
		
	}

}
