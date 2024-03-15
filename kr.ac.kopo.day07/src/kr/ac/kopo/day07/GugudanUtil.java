package kr.ac.kopo.day07;

import java.util.Scanner;

public class GugudanUtil {
	
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 *  호출자가 남겨준 두 정수(시작단, 종료단) 사이의 구구단을 출력하는 기능
	 *  @param startDan 시작단
	 *  @param endDan   종료단
	 */
	 
	void print(int startDan, int endDan) {
		for(int dan = startDan;dan<= endDan; dan++) {
			print(dan);
		}
	}
	
	/**
	 * 
	 * 2~9단까지의 구구단을 출력하는 기능
	 */
	
	void print() {
		print(2,9);
	}
	
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
		
		System.out.println("단을 입력:");
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;
		
	}
	
	int inputDan(String msg) {
		
		System.out.print(msg);
		int dan = Integer.parseInt(sc.nextLine());
		
		return dan;
	}
}
