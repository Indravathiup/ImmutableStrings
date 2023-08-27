package com.kodnest.immutablestrings;

import java.util.Scanner;

public class Indexof {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.next();
		int indexOfFirstSpace=s1.indexOf(' ');
		int indexOfComma=s1.indexOf(',');
		int indexOfWorld=s1.indexOf("world");
		int indexOfHelloFromIndex=s1.indexOf("hello",10);
		System.out.println("string"+s1);
		System.out.println("index of first space "+indexOfFirstSpace);
		System.out.println("index of comma "+indexOfComma);
		System.out.println("index of world "+indexOfWorld);
		System.out.println("index of hello from index "+indexOfHelloFromIndex);
		
	}

}
