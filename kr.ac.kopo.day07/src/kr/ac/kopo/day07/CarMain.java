package kr.ac.kopo.day07;

// ����Ŭ����
public class CarMain {

	public static void main(String[] args) {
		
		Car c = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c.name = "�ҳ�Ÿ";
		c.price = 3600;
		
		c2.name = "���";
		c2.price = 4000;
		
		c3.name = "�׷���";
		c3.price = 4200;
		
		System.out.println("�ڵ����� : "+c.name+ ", ���� : "+c.price+"����");
		System.out.println("�ڵ����� : "+c2.name+", ���� : "+c2.price+"����");
		System.out.println("�ڵ����� : "+c3.name+", ���� : "+c3.price+"����");
	}

}

