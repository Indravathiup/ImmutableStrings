package com.kodnest.immutablestrings;

public class String11 {
	public static void main(String[] args) {
		String name=new String("Raja Ram Mohan Roy");
		System.out.println(name);
		System.out.println("===========================================");
		System.out.println(name.toUpperCase());
		System.out.println("===========================================");
		System.out.println(name.toLowerCase());
		System.out.println("=============================================");
		System.out.println(name.charAt(3));
		System.out.println("==============================================");
		System.out.println(name.indexOf('a'));
		System.out.println("===============================================");
		System.out.println(name.contains("Ram"));
		System.out.println("===============================================");
		System.out.println(name.contains("amm"));
		System.out.println("===============================================");
		System.out.println(name.substring(9));
		System.out.println("================================================");
		System.out.println(name.substring(9,14));
		System.out.println("================================================");
		
		
	}

}
