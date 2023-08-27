package com.kodnest.immutablestrings;

import java.util.Scanner;

public class Split {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.next();
		String[]s2=s1.split(",");
		System.out.println("original string "+s1);
		System.out.println("words in strings are");
		for(String x:s2)
		{
			System.out.println(x+" ");
		}
	}

}
