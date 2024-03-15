package kr.ac.kopo.day07;

import java.util.Scanner;

public class GugudanUtil {
	
	/*
	 * 호출자가 넘겨준 단을 이용하여 구구단을 출력하는 기능
	 * 
	 */
	
	void print(int dan) {
		System.out.println("***"+dan+"단 ***");
		for(int i = 1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
		}
	}
	/**
	 * 
	 * 키보드로 단을 입력받아 호출자에게 전달하는 기능
	 */
	int inputDan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력 :");
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;
		
	}
}
