package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {
		
		String s = "Hello";
		String s2 = new String("Hello");
		
		System.out.printf("s : [%s]\n",s);
		System.out.printf("s2 : [%s]\n",s2);
			
		// �ּҺ�
		
		if(s == s2) {
			System.out.println("s == s2");
		} else {
			System.out.println("s != s2");
		}
		
		// ���ڿ� ��
		boolean bool = s.equals(s2);
		if(bool) {
			System.out.println("equals() : ����");
		} else {
			System.out.println("equals() : �ٸ���");
		}
		
		bool = s.equalsIgnoreCase(s2);
		if(bool) {
			System.out.println("equalsIgnoreCare() : ����");
		} else {
			System.out.println("equalsIgnoreCare() : �ٸ���");
		}
		
		String [] names = {"ȫ�浿", "ȫ���" ,"���浿","���浿","ȫ�浿","ȫ����"};
		
		//��ü�̸��� "ȫ�浿"�� �̸��� ���
		
		for(String name : names) {
			if(name.equals("ȫ�浿")){
				System.out.println(name);
			}
			
		}
		System.out.println("------------------");
		for(int i = 0; i < names.length;i++) {
			if(names[i].equals("ȫ�浿")) {
				System.out.println(names[i]);
			}
			
		}
		
		System.out.println("< \"ȫ\"�� ���� ���� �̸��� ���>");
		for(String name : names) {
			if(name.charAt(0) == 'ȫ') {
				System.out.println(name);
			}
		}
		
		System.out.println("<�̸���\"�浿\"�λ���� ���>");
		for(String name : names) {
			if(name.endsWith("�浿")) {
				System.out.println(name);
			}
			
		}
		System.out.println("\"��\" ���Ե� ����� ���>");
		for(String name : names) {
			if(name.contains("��")) {
				System.out.println(name);
			}
		}
		
		System.out.println("------------------");
		for(String name : names) {
			if(name.compareTo("ȫ�浿") == 0) {
				System.out.println(name);
			}
		}
		
		String word = "hello world";
		String word2 = "hello";
		
		int cmp = word.compareTo(word2);
		if(cmp == 0) {
			System.out.printf("%s == %s\n",word,word2);
		} else if(cmp > 0) {
			System.out.printf("%s > %s\n",word,word2);
		} else {
			System.out.printf("%s < %s\n",word,word2);
		}
	}
		
}
