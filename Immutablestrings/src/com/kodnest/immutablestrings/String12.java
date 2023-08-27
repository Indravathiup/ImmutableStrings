package com.kodnest.immutablestrings;



public class String12 {
	public static void main(String[] args) {
		String s1="sachin";
		String s2="saurav";
		if(s1.compareTo(s2)>0)
		{
			System.out.println("string s1 is greater than s2");
		}
		else if(s1.compareTo(s2)<0)
		{
			System.out.println("string s2 is greater than s1");
		}
		else
		{
			System.out.println("strings are equal");
		}
	}

}
