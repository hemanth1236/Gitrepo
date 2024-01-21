package Oops;

public class Employee {

	String name;
	int empid;
	private int salary;

	public void display() {
		System.out.println("Name of employee is :" + this.name);
		System.out.println("Employee id is :" + this.empid);
		System.out.println("Employee salary is :" + salary);
	}

	public void setSalary(int sal) {
		salary = sal;
	}

	public Employee() {
		System.out.println("Inside default constructor");
	}

	public Employee(String name, int empid, int salary) {
		System.out.println("Inside parameterized constructor");
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
}
