package kr.ac.kopo.day02;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ��� �Է��ϼ��� : ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch >= 'A' && ch <- 'Z') {
			ch = (char)(ch + 32);
		
		} else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - 32);
		}	

		System.out.println("��ȯ�� ���� :" +ch);
	}
}