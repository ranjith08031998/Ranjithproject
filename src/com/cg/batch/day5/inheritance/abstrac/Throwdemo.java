package com.cg.batch.day5.inheritance.abstrac;

public class Throwdemo {

	static void checkEligibilty(int age) {

		if (age < 18) {
			throw new CanNotVoteException("Can not vote.");
		} else {
			System.out.println("Vote for India.");
		}
	}

	public static void main(String args[]) {

		System.out.println("Election...");

		try {
			Throwdemo.checkEligibilty(15);
		} catch (CanNotVoteException cnve) {
			System.out.println(cnve.getMessage());
		}
		System.out.println("end");
	}
}
