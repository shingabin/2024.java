package kr.ac.kopo.day07;

public class Member {
	String name;
	int age;
	String bloodType;
	
	public Member() {
		name = "알수없음";
		age = -1;
		bloodType = "알수없음";
	}
	
	Member(String name){
		this.name = name;
		this.age = -1;
		this.bloodType ="알수없음";
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		this.bloodType = "알수없음";
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	void info() {
		System.out.println("이름 :" +name + ",나이 :"+age +",혈액형 :"+bloodType);
	}

}
