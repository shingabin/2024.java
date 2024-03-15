package kr.ac.kopo.day07;

import java.util.Scanner;

public class GugudanUtil {
	
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 *  ȣ���ڰ� ������ �� ����(���۴�, �����) ������ �������� ����ϴ� ���
	 *  @param startDan ���۴�
	 *  @param endDan   �����
	 */
	 
	void print(int startDan, int endDan) {
		for(int dan = startDan;dan<= endDan; dan++) {
			print(dan);
		}
	}
	
	/**
	 * 
	 * 2~9�ܱ����� �������� ����ϴ� ���
	 */
	
	void print() {
		print(2,9);
	}
	
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
		
		System.out.println("���� �Է�:");
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
