package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 	�����ϰ� �ִ� å�Ǽ� �Է� : 1
 	1 book
 	
 	�����ϰ� �ִ� å�Ǽ� �Է� : 4
 	4 books
 */
 public class IFMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϰ� �ִ� å �Ǽ� �Է�:");
		int book = sc.nextInt();
		
		if(book == 1) {
			System.out.println(book + " books");
			
		}

	}

}
