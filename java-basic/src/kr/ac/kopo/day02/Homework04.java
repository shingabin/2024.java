package kr.ac.kopo.day02;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		sc.nextLine();

		System.out.println("���� ���� �Է��ϼ��� : ");
		int b = sc.nextInt();
		sc.nextLine();

		System.out.printf("�� : %d\n", a / b);
		System.out.printf("������ : %d\n", a % b);

	}

}
	