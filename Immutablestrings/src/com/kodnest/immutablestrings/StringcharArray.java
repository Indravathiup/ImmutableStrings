package com.kodnest.immutablestrings;

import java.util.Scanner;

public class StringcharArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.next();
		char[]charArray=s1.toCharArray();
		System.out.println("enter character array");
		for(char c:charArray)
		{
			System.out.print(c+" ");
		}
		System.out.println();
	}

}
