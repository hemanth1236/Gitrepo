package Oops;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		emp.name = "Ganesha";
		emp.empid = 123;
		emp.setSalary(50000);

		Employee emp1 = new Employee();
		emp1.name = "Vinayaka";
		emp1.empid = 2034;
		emp1.setSalary(75000);

		Employee emp2 = new Employee("Hemanth", 52, 90000);

		emp.display();
		emp1.display();
		emp2.display();
		IcciBank obj = new IcciBank(852, 856);
		obj.bankDisplay();
	}

}
