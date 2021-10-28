package com.cg.batch.day8.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 10.6));
		empList.add(new Employee(102, "Monu", 20.6));
		empList.add(new Employee(103, "Tonu", 40.6));
		empList.add(new Employee(104, "Ponu", 30.6));

		System.out.println("Before sort");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}

		Collections.sort(empList);

		System.out.println("After sort");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}

	}

}
