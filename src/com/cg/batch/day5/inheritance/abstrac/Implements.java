package com.cg.batch.day5.inheritance.abstrac;
//abstract and concrete 

//interface 

//abstract method - 
//has the keyword abstract 
//has only method signature 
//does not have method body 
//can be defined in abstract class 
//can not be defined in concrete class 

//abstract class 
//has the keyword abstract 
//object can not be created 
//can contain zero or more abstract methods 
//can contain zero or more concrete methods 
//can also contain both 

interface FinanceMinistry {

	public abstract void payInterestOnDeposits();

}

interface StateGovt {

	public abstract void paySalaryToEmployees();

}

abstract class Cbi {

	public abstract void doKyc(); // Aadhaar, PAN, Passport, ...

	void openAccount() {
		System.out.println("Open account");
	}

	void payLoans() {
		System.out.println("pay loans");
	}
}

class Axis extends Cbi implements FinanceMinistry, StateGovt {

	@Override
	public void paySalaryToEmployees() {
		// TODO Auto-generated method stub
		System.out.println("Adhar");
	}

	@Override
	public void payInterestOnDeposits() {
		// TODO Auto-generated method stub
		System.out.println("Salary");
	}

	@Override
	public void doKyc() {
		// TODO Auto-generated method stub
		System.out.println("intrest");
	}

	

}

class SbiBank extends Cbi {

	@Override
	public void doKyc() {
		// TODO Auto-generated method stub
System.out.println("dokyc");		
	}

	
}
public class Implements {
	public static void main(String[] args) {

		Axis obj = new Axis();
		obj.doKyc();
		obj.openAccount();
		obj.payLoans();
		SbiBank obj2 = new SbiBank();
		obj2.doKyc();

//		Rbi obj3 = new Rbi();
	}
}
