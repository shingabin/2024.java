package kr.ac.kopo.day12;

public class Manager03 extends Employee {

	Employee[] 	empList;	// ������� ���
	
	Manager03() {
		super();
	}
	
	Manager03(int no, String name, int salary, String grade,
				Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}
	
	void info() {
		super.info();
		System.out.println("------------------------------------------");
		System.out.println("\t< ������� ����Ʈ >");
		System.out.println("------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("------------------------------------------");
	}
}
