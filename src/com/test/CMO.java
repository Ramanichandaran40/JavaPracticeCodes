package com.test;
import com.sample.*;
public class CMO {
	public void studentName() {
		System.out.println("Ramani");
	}

	public void studentID() {
		System.out.println("1023496");
	}
	public void studentAddress() {
		System.out.println("Salem");
	}
	public static void main (String[]args) {
		CMO method = new CMO();
		method.studentName();
		method.studentID();
		method.studentAddress();
		Test t = new Test();
		t.studentName();
		t.studentID();
		t.studentAddress();
	}
}
