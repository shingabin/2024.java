package kr.ac.kopo.day02;

import java.util.Scanner;


public class Homework08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] Exchange = {1000, 500, 100, 50, 10};
		int[] numOfEx = new int[5];
		int cost;
		int pay;
		int leftover;
		
		System.out.print("���ǰ��� �Է� : ");
		cost = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ ���� �׼� : ");
		pay = sc.nextInt();
		sc.nextLine();
	
		if(pay > cost)
			leftover = pay - cost;
		else {
			sc.close();
			return;
		}
		
		System.out.println("�Ž����� : " + leftover);
		
		int tmpLeftover = leftover;
		for(int i = 0; i < Exchange.length; i++)
		{
			numOfEx[i] = tmpLeftover / Exchange[i];
			System.out.printf("%d �� : %d ��\n", Exchange[i], numOfEx[i]);
			tmpLeftover %= Exchange[i];
		}
		
		sc.close();
	}

}
