package com.kodnest.immutablestrings;

import java.util.Scanner;

public class Replaceall {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.next();
		String s2=s1.replaceAll("indhu", "jesus");
		System.out.println("original string : "+s1);
		System.out.println("replaced string : "+s2);
	}

}
