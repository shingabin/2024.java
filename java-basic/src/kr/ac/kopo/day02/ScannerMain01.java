package kr.ac.kopo.day02;

import java.util.Scanner;

public class ScannerMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է� :");
		char d = sc.nextLine().charAt(0);
		System.out.println("d : "+d);
	
		System.out.println("���� �Է� :");
		//int a = 10;
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("a : " + a);
		
		System.out.println("�Ǽ� �Է� : ");
		double b = sc.nextDouble();
		sc.nextLine();
		System.out.println("b : " + b);
		
		System.out.println("���ڿ��� �Է� :");
		//String c = sc.next(); //�ܾ���� �Է�
		String c = sc.nextLine(); // ���� ���� �Է�
		System.out.println("c :"+c);
		
	}

}