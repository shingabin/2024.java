package kr.ac.kopo.day02;

import java.util.Scanner;

public class Homework09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϰ� �ִ� å �Ǽ� �Է� : " );
		int book = sc.nextInt();
		sc.nextLine();
		
		if(book == 0) {
			System.out.println("�����ϰ� �ִ� å ����");
		}else if(book<0) {
			System.out.println("�߸��Է��߽��ϴ�");
		}
		else if(book == 1) {
			System.out.println(book + " book");
		}else {
			System.out.println(book + " books");
			
		}
	}	
}