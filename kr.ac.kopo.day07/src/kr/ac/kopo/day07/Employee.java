package kr.ac.kopo.day07;

public class Employee {
	String name;
	int salary;
	static int empTotal;
	
	Employee(){
		Employee.empTotal++;
		
	}
	
	Employee(String name ,int salary){
		this.name = name;
		this.salary = salary;
		Employee.empTotal++;
	}
	
	void info() {
		System.out.println("����� :"+ name +",���� : "+ salary +"����");
	}
	
	static void employeeTotalInfo() {
		System.out.println("�� ����� :"+ Employee.empTotal + "��");
	}
}
