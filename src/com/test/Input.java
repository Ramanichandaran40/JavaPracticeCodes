package com.test;

import java.util.Scanner;

public class Input {
	public static void main(String[]args) {
	Scanner s  = new Scanner(System.in);
	System.out.println("Enter the first value");
	int i = s.nextInt();
	System.out.println("Enter the second value");
	int j = s.nextInt();
	int k = i+j;
	System.out.println(k);
	
	}
}
