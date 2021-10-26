package com.cg.batch3.day5;

public class Accessdemo {
	public static int publicMember = 10;
	protected static int protectedMember = 20;
	static int packageMember = 30;
	private static int privateMember = 40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Accessdemo.publicMember);
		System.out.println(Accessdemo.protectedMember);
		System.out.println(Accessdemo.packageMember);
		System.out.println(Accessdemo.privateMember);

	}

}
