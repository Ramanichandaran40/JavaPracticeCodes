package com.test;

public class Poly2 extends Poly1{
	public void bike() {
		System.out.println("Yamaha R15 V3");
	}
	public void car() {
		System.out.println("Bugatti Veron");
	}
	public static void main(String[]args) {
		Poly2 p = new Poly2();
		p.bike();
		p.car();
		p.cycle();
	}

}
