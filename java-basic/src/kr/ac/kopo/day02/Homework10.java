package kr.ac.kopo.day02;

import java.util.Scanner;


public class Homework10 {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("ù��° ���� : ");
			int firstNum = sc.nextInt();
			sc.nextLine();
			System.out.print("�ι�° ���� : ");
			int secondNum = sc.nextInt();
			sc.nextLine();
			System.out.print("����° ���� : ");
			int thirdNum = sc.nextInt();
			sc.nextLine();
			
			int max1 = (firstNum>secondNum) ? firstNum : secondNum;  
			int max2 = (max1 > thirdNum) ? max1 : thirdNum;		 
			int min1 = (firstNum<secondNum) ? firstNum : secondNum;		
			int min2 = (min1 < thirdNum) ? min1 : thirdNum;		
			int mid1 = (firstNum>secondNum) ? secondNum : firstNum;
			int mid2 = (mid1 > thirdNum)? mid1 : thirdNum; 
			
			System.out.println(max2 + "  " + mid2 + "  " + min2 + "  ");
			
				}
			}
