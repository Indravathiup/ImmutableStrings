package com.kodnest.immutablestrings;

public class StringBasics {
	public static void main(String[] args) {
		String s1="Indhu";
		System.out.println(s1);
		String s2=new String("Jesus");
		System.out.println(s2);
		char []ch=new char[5];
		ch[0]='j';
		ch[1]='e';
		ch[2]='s';
		ch[3]='u';
		ch[4]='s';
		String s3=new String(ch);
		System.out.println(s3);
		char ch1[]= {'j','e','s','u','s'};
		String s4=new String(ch);
		System.out.println(s4);
		
	}

}
