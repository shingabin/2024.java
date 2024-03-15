package kr.ac.kopo.day02;

public class OperationMain02 {

	public static void main(String[] args) {
		int firstNum = 12;
		int secondNum = 3;
		
		boolean result = secondNum != 0 && firstNum % secondNum == 0;
		System.out.println("배수 여부 판단 : "+ (result == true ? "배수다" : "배수가 아니다"));
		System.out.println("배수 여부 판단 : "+ ( result == false ? "배수가 아니다" : "배수다"));
		System.out.println("배수 여부 판단 : "+ ( !result ? "배수가 아니다" : "배수다"));
		
	}

}
