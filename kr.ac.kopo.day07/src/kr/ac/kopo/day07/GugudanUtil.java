package kr.ac.kopo.day07;

import java.util.Scanner;

public class GugudanUtil {
	
	/*
	 * ȣ���ڰ� �Ѱ��� ���� �̿��Ͽ� �������� ����ϴ� ���
	 * 
	 */
	
	void print(int dan) {
		System.out.println("***"+dan+"�� ***");
		for(int i = 1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
		}
	}
	/**
	 * 
	 * Ű����� ���� �Է¹޾� ȣ���ڿ��� �����ϴ� ���
	 */
	int inputDan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� :");
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;
		
	}
}
