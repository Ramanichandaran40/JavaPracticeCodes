package com.test;

public class T1 implements Test1{
	public void bike() {
		System.out.println("Ninja Z900");
	}
	public void car() {
		System.out.println("Venom GT");
	}
	public void boat() {
		System.out.println("cruize");
	}
	
public static void main(String[]args) {
	T1 t = new T1();
	t.bike();
	t.car();
	t.boat();
}
}
