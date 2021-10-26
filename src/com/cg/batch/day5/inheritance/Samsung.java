package com.cg.batch.day5.inheritance;

public class Samsung extends Smartphone{
	public static void main(String[] args) {
		Samsung obj1 = new Samsung();
		obj1.call();
		obj1.sms();
		obj1.music();
		obj1.camera();
	}
}
