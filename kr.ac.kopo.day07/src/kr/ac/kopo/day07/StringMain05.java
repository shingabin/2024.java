package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain05 {

	public static void main(String[] args) {
		
		String str = "hello world";
		char search = 'o';
		
		int idx = str.indexOf(search);
		System.out.println("indexof() :" +search + "������ ��ġ : "+idx);
		
		idx = str.lastIndexOf(search);
		System.out.println("lastIndexof() : "+ search + "������ ��ġ : "+idx);
		
		search = 'p';
		idx = str.indexOf(search);
		System.out.println("indexof() :"+ search + "������ ��ġ :"+idx);
	
		search = 'l';
		System.out.println(" <["+ str+"]����" + search + "���� ��ġ >");
		idx = str.indexOf(search);
		while(idx !=-1) {
			System.out.println("ã�� ��ġ :"+idx);
			idx = str.indexOf(search , idx+1);
			
		System.out.println("----------------");
		
		idx = -1;
		while((idx = str.indexOf(search, idx+1)) != -1) {
			System.out.println("ã�� ��ġ :"+idx);
			}
		System.out.println("-------------------");
		}
		idx = -1;
		while(true) {
			idx = str.indexOf(search , idx+1);
			if(idx == -1) {
				break;
			}
			System.out.println("ã�� ��ġ :"+idx);
		}
		
		str = "hello world!!";
		
		String sub = str.substring(6, 11);
		System.out.println("str :"+ str);
		System.out.println("substr(6, 11) :"+ str);
		sub = str.substring(6);
		System.out.println("substr(6) :"+ sub);
		
		str = "hello";
		String str2 = "world";
		
		//String str3 = str + str2;
		String str3 = str.concat(str2);
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : "+ str3);
	
		str =  "         hello world        ";
		System.out.printf("[%s] ���� : %d\n", str, str.length());
		
		String trimStr =  str.trim();
		System.out.printf("trim() => [%s] ���� : %d\n", trimStr, trimStr.length());
		
		str = new String("Hello world!!!");
		System.out.println("str :"+ str);
		System.out.println("�빮�� :"+ str.toUpperCase());
		System.out.println("�ҹ��� :"+ str.toLowerCase());
		
		String date = "2024-03-18";
		
		String[] dateArr = date.split("-");   // "2024","03","18"
		System.out.println(Arrays.toString(dateArr));
		
		str = "172.31.9.164";
		String [] ipArr = str.split(".");
		System.out.println(Arrays.toString(ipArr));
		
		
	}
}	