package kr.ac.kopo.day07;

public class Member {
	String name;
	int age;
	String bloodType;
	
	public Member() {
		this("�˼�����");
	}
	
	Member(String name){
		this(name,-1);
		
	}
	
	Member(String name, int age){
		this(name,age,"�˼�����");
		System.out.println("Member(name,age) ->");
		
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	void info() {
		System.out.println("�̸� :" +name + ",���� :"+age +",������ :"+bloodType);
	}

}
