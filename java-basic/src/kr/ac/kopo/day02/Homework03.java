package kr.ac.kopo.day02;

import java.util.Scanner;


public class Homework03 {

	public static void main(String[] args) {
		
		final double PI = -3.141592;

		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է� : ");
		double r = sc.nextDouble();
		sc.nextLine();

		System.out.printf("�������� %.0f�϶� ���� ������ %f�Դϴ�.", r, PI * r * r);

	}

}
