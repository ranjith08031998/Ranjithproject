package com.cg.batch.day8.comparable;

public class Employee implements Comparable<Employee> {

	int eid;
	String eName;
	double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String eName, double salary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", eName=" + eName + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (salary == o.salary)
			return 0;
		else if (salary > o.salary)
			return 1;
		else
			return -1;
	}
}
