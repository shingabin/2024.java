package kr.ac.kopo.day12;

public class Manager {

	int 		no;
	String 		name;
	int 		salary;
	String 		grade;
	Employee[] 	empList;	// ������� ���
	
	Manager() {
		
	}
	
	Manager(int no, String name, int salary, String grade,
				Employee[] empList) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	void info() {
		System.out.println("�����ȣ : " + no + ", ����� : " + name 
				+ ", ���� : " + salary + "����, ���� : " + grade);
		System.out.println("------------------------------------------");
		System.out.println("\t< ������� ����Ʈ >");
		System.out.println("------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("------------------------------------------");
	}
}











