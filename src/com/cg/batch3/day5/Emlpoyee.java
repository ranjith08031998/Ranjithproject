package com.cg.batch3.day5;

public class Emlpoyee {

	private int eid;
	private String firstName;
	private double salary = 8000; // read-only + writable field

	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emlpoyee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Emlpoyee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
