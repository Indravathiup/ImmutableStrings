package com.kodnest.immutablestrings;

import java.util.Scanner;

public class Trim {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		String s2=s1.trim();
		System.out.println("orginal string : "+s1);
		System.out.println("trimmed string : "+s2);
		
	}

}
