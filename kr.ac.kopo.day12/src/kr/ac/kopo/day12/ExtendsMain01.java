package kr.ac.kopo.day12;

class One {
	One() {
		System.out.println("One() ������ ȣ��");
	}
}

class Two extends One {
	Two() {
		//super();
		System.out.println("Two() ������ ȣ��");
	}
}

class Three extends Two {
	Three() {
		System.out.println("Three() ������ ȣ��");
	}
}

public class ExtendsMain01 {

	public static void main(String[] args) {

		//new One();
		//new Two();
		new Three();
	}
}

