package com.test;

public class ConsParent {
	public ConsParent () {
		this("ramani");
		System.out.println("Default Parent Constructor");
	}
	public ConsParent (int n, String name) {
		System.out.println("String and Integer Parent Constructor");
	}
	public ConsParent (String name) {
		System.out.println("String Parent Constructor");
	}
	

}
