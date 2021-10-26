package com.cg.batch.day5.inheritance.abstrac;

public class Multithreding extends Thread {
	public void myLoop() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		this.myLoop();
	}

	public static void main(String[] args) {

		 Multithreding obj = new  Multithreding();
//		obj.myLoop();
		obj.start();
		 Multithreding obj2 = new Multithreding();
//		obj2.myLoop();
		obj2.start();

	}

}
