package com.cg.batch3.day5;

public class Thisdemo {
static int num1;
int num2;
static void staticmethod() {
	System.out.println("Thismethod.num1");
	Thisdemo obj=new Thisdemo();
	System.out.println("obj.num2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Thisdemo(int num2) {
		super();
		this.num2 = num2;
	}

}
