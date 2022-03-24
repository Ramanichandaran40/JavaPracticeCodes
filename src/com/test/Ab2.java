package com.test;

public class Ab2 extends Ab1 {
	public void car() {
		System.out.println("McLaren");
	}
	public void boat() {
		System.out.println("Cruize");
	}
public static void main(String[]args) {
	Ab2 ab = new Ab2();
	ab.bike();
	ab.car();
	ab.boat();
}
}
