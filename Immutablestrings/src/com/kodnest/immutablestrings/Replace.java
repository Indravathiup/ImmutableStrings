package com.kodnest.immutablestrings;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.next();
		String s2=s1.replace("world","java");
		System.out.println("original string "+s1);
		System.out.println("replaced string "+s2);
	}

}
