package kr.ac.kopo.day07;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee.employeeTotalInfo();
		
		Employee e = new Employee("ȫ�浿",3_200);
		Employee e2 = new Employee("���浿",3_500);
		
		
		e.info();
		e2.info();
		
		Employee.employeeTotalInfo();
	}

}
