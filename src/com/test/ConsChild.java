package com.test;

public class ConsChild extends ConsParent{
	public ConsChild () {
		super(123,"ramani");
		System.out.println("Defauly constructor");
	}
	public ConsChild (String name,int n) {
		System.out.println("String and Integer");
	}
	public ConsChild (int n, long j) {
		System.out.println("String and Integer");
	}
	
public static void main(String[]args) {
	ConsChild c = new ConsChild();
}
}
