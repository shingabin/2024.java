package naver;

import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class NaverMain {
	public static void main(String[]args)throws AuthenException{
		
		Scanner sc = new Scanner(System.in);
		Naver ob = new Naver();
		
		int ch;
		
		while(true) {
			
			do{
				
				System.out.println("1.입력 2.수정 3.탈퇴 4.회원전체출력 5.아이디검색 6.종료");
				System.out.println("\n--------------------------\n");
				ch = sc.nextInt();
			} while(ch<1 || ch>6);
			
			System.out.println();
			
			switch(ch) {
			
			case 1:
				ob.insert();
				System.out.println();
				break;
			case 2:
				ob.update();
				System.out.println();
				break;
			case 3:
				ob.delete();
				System.out.println();
				break;
			case 4:
				ob.selectAll();
				System.out.println();
				break;
			case 5:
				ob.searchId();
				System.out.println();
				break;
			case 6:
				ConnectionFactory DBConn = new ConnectionFactory();
				System.exit(0);
			
			}
		}
	}

}
