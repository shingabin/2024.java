package kr.ac.kopo.day14.abs01;

import java.util.Scanner;

import kr.ac.kopo.day14.abs02.HPPrinter;

public class Menu {
	
	public void process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("V2.����� �����͸� �����ϼ���(1.LG 2.�Ｚ)=>");
		String type = sc.nextLine();
		
		Printer p = null;
		switch(type) {
		case "1" :
			p = new LGPrinter();
			p.print();
			break;
		case "2" :
			p= new SamsungPrinter();
			p.print();
			break;
		
		default:
			System.out.println("�߸������ϼ̽��ϴ�");
		}
		if(p !=null) {
			p.print();
		}
	}
}
