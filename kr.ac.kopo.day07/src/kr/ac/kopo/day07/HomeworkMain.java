package kr.ac.kopo.day07;

import java.util.Random;

public class HomeworkMain {

	public static void main(String[] args) {
		//20~120ªÁ¿Ã¿« ¡§ºˆ √ﬂ√‚
		Random r = new Random();
		int number = r.nextInt(101)+20; // 0+20 ~ 100+20
		
		System.out.println("<1~"+number+"369∞‘¿”>");
		for(int i = 1;i<=number;i++) {
			System.out.print(i+"\t");
			
			int n1 = i % 10;
			int n10 = i % 100 /10;
			
			if(n1 == 3 || n1 == 6 || n1 == 9);{
				System.out.print("¬¶");
			}
			if(n10 !=0 && n10 % 3 ==0) {
				System.out.print("¬¶");
			}
			if(1 % 10 == 0) {
				n10 = 1/10;
				while(n10-->0)
					System.out.print("ª«");
				System.out.print("ºı");
			}
			
			System.out.println();
		}

	}

}
