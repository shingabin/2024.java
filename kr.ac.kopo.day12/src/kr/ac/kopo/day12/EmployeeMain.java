package kr.ac.kopo.day12;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e = new Employee(1, "ȫ�浿", 3_200, "���");
		Employee e2 = new Employee(2, "���浿", 3_500, "���");
		Employee e3 = new Employee(3, "��浿", 4_000, "�븮");
		Employee e4 = new Employee(4, "���浿", 5_000, "����");
		
		e.info();
		e2.info();
		e3.info();
		e4.info();
		
		Employee[] empList = {e, e2, e4};
//		Manager m = new Manager(1000, "���ְ�", 9_000, "����", empList);
//		Manager02 m = new Manager02(1000, "���ְ�", 9_000, "����", empList);
		Manager03 m = new Manager03(1000, "���ְ�", 9_000, "����", empList);
		m.info();
	}
}


