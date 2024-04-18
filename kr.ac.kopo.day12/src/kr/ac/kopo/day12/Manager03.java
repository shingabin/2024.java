package kr.ac.kopo.day12;

public class Manager03 extends Employee {

	Employee[] 	empList;	// 관리사원 목록
	
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
		System.out.println("\t< 관리사원 리스트 >");
		System.out.println("------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("------------------------------------------");
	}
}
