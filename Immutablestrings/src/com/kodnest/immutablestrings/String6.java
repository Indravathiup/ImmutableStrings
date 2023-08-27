package com.kodnest.immutablestrings;

public class String6 {
	public static void main(String[] args) {
		String s1="RAMA";
		String s2="SITA";
		String s3="RAMA"+"SITA";
		String s4="RAMA"+"SITA";
		if(s3==s4)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("references are not equal");
		}
		if(s3.equals(s4))
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
		
	}

}		
	
