package kr.ac.kopo.day07;

// 실행클래스
public class CarMain {

	public static void main(String[] args) {
		
		Car c = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c.name = "소나타";
		c.price = 3600;
		
		c2.name = "쏘렌토";
		c2.price = 4000;
		
		c3.name = "그랜저";
		c3.price = 4200;
		
		System.out.println("자동차명 : "+c.name+ ", 가격 : "+c.price+"만원");
		System.out.println("자동차명 : "+c2.name+", 가격 : "+c2.price+"만원");
		System.out.println("자동차명 : "+c3.name+", 가격 : "+c3.price+"만원");
	}

}

