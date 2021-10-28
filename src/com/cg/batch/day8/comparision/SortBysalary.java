package com.cg.batch.day8.comparision;
import java.util.Comparator;
public class SortBysalary  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("compare");
		return (int) (o1.salary - o2.salary);
	}
}
