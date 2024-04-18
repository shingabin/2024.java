package kr.ac.kopo.day12;

class One {
	One() {
		System.out.println("One() 생성자 호출");
	}
}

class Two extends One {
	Two() {
		//super();
		System.out.println("Two() 생성자 호출");
	}
}

class Three extends Two {
	Three() {
		System.out.println("Three() 생성자 호출");
	}
}

public class ExtendsMain01 {

	public static void main(String[] args) {

		//new One();
		//new Two();
		new Three();
	}
}

