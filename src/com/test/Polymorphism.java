package com.test;

public class Polymorphism {
	public void Polymorphism (String name,int m) {
		System.out.println("Ramani");
	}
	public void Polymorphism (int m, long i) {
		System.out.println("Hari");
	}
	public void Polymorphism (long i,String name) {
		System.out.println("Mani");
	}
	public static void main(String[]args) {
		Polymorphism p = new Polymorphism();
		p.Polymorphism(234,9003735054l);
		p.Polymorphism(9003735054l, "hari");
	}
}
