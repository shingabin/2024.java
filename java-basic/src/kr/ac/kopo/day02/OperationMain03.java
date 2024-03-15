package kr.ac.kopo.day02;

import java.util.Scanner;
/*
 *  두 개의 정수를 입력받아 첫번째 입력값이 두번쨰 입력값의 배수여부를 판단하는 프로그램 작성
 * 
 *  첫번째 정수 : 12
 *  두번쨰 정수 : 4
 *  12는 4의 배수 여부 판단 : true
 *  ---------------------------
 *  
 *  첫번째 정수 : 18
 *  두번쨰 정수 : 4
 *  18은 4의 배수 여부 판단 : false
 *  
 */
public class OperationMain03 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쨰 정수 :");
		int firstNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수 :");
		int secondNum = sc.nextInt();
		sc.nextLine();
		
		//배수여부 판단
		boolean result = secondNum!= 0 && firstNum % secondNum ==0;
		
		System.out.printf("%d는 %d의 배수여부 판단 : %b\n" , firstNum , secondNum, result);
		
		// 18은 4의 배수 여부 판단: false
		System.out.println(firstNum + "은" + secondNum + "의 배수 여부 판단 : "+ result);
		
		
		
	}
		
}
