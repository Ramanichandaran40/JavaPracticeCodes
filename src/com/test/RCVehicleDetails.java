package com.test;
import com.sample.*;

public class RCVehicleDetails extends Test {
	public void bike() {
		System.out.println("Yamaha FZ16");
	}
	public void car() {
		System.out.println("Ertiga");
	}
	public static void main(String[]args) {
		RCVehicleDetails r = new RCVehicleDetails();
		r.bike();
		r.car();
		r.studentName();
	}
}

