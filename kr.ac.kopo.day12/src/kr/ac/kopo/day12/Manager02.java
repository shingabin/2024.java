package kr.ac.kopo.day12;

public class Manager02 extends Employee {

	Employee[] 	empList;	// ������� ���
	
	Manager02() {
		super();
	}
	
	Manager02(int no, String name, int salary, String grade,
				Employee[] empList) {
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








