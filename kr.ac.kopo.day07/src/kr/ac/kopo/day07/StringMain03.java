package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {
		
		String s = new String("Hello World!!");
		
		int len = s.length();
		
		System.out.printf("[%s] ���� : %d\n",s,len);
		System.out.printf("7��°�� ��ġ�� ���� : %c\n", s.charAt(7));
		
		String s2 = "Hello";
		System.out.println(s2.charAt(0));
		System.out.println("Hello".charAt(0));
		
		char[] chars = new char[5];
		s.getChars(6, 11, chars, 0);
		System.out.println("chars :"+ Arrays.toString(chars));
		
		

	}

}
