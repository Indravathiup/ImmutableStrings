package com.kodnest.immutablestrings;

public class String5 {
	public static void main(String[] args) {
		String s1="RAMA";
		String s2=new String("RAMA");
		if(s1==s2)
		{
			System.out.println("references are equal");
		}
		else
		{
			System.out.println("references are not equal");
		}
		if(s1.equals(s2))
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
		
	}
}


