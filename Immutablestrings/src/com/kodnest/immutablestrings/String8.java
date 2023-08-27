package com.kodnest.immutablestrings;

public class String8 {
	public static void main(String[] args) {
		String s1="rama";
		String s2=s1;
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

