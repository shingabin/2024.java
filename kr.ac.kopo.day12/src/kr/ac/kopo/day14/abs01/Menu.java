package kr.ac.kopo.day14.abs01;

import java.util.Scanner;

import kr.ac.kopo.day14.abs02.HPPrinter;

public class Menu {
	
	public void process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("V2.출력할 프린터를 선택하세요(1.LG 2.삼성)=>");
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
			System.out.println("잘못선택하셨습니다");
		}
		if(p !=null) {
			p.print();
		}
	}
}
