package com.cg.batch3.day5;

public class Finaldemo {
	private static final int num = 10;
	private static int num2 = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Finaldemo.num);
		System.out.println(Finaldemo.num2);
//		FinalDemo.num = 15; // CE
		Finaldemo.num2 = 25;

		System.out.println(Finaldemo.num);
		System.out.println(Finaldemo.num2);
	}

}
