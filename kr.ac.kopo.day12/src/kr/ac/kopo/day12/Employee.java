package kr.ac.kopo.day12;

public class Employee {

	private int 	no;		
	private String 	name;
	private int 	salary;
	private String 	grade;
	
	Employee() {
		
	}

	
	
	public Employee(int no, String name, int salary, String grade) {
		super();
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}



	void info() {
		System.out.println("�����ȣ : " + no + ", ����� : " + name 
				+ ", ���� : " + salary + "����, ���� : " + grade);
	}
}
