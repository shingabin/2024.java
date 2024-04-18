package kr.ac.kopo.day07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

    public static void main(String[] args) {
       
    	Scanner sc = new Scanner(System.in);
    	Random random = new Random();
    	
    	//���� ����
    	ArrayList<Integer>answer = new ArrayList<>();
    	while(answer.size()<3) {
    		int num = random.nextInt(10);
    		if(!answer.contains(num)) {
    			answer.add(num);
    		}
    	}
    	//���� ����
    	int tries = 0;
    	while(true) {
    		tries++;
    		
    		//�ÿ��� �Է�
    		System.out.print("���� 3���� �Է��ϼ���(��: 123):");
    		String inputStr = sc.nextLine();
    		
    		ArrayList<Integer>input = new ArrayList<>();
    		for(char c : inputStr.toCharArray()) {
    			input.add(Character.getNumericValue(c));
    		}
    		
    		//��� ���
    		int strike = 0;
    		int ball = 0;
    		
    		for(int i=0; i<3; i++) {    		
    			if(input.get(i) == answer.get(i)) {
    				strike++;
    			}else if(answer.contains(input.get(i))) {
    				ball++;
    			}
    		}
    		
    		//���� ���� ��Ȳ ���
    		System.out.printf("%dȸ��: %s,%d ��Ʈ����ũ, %d ��\n", tries,input,strike,ball);
    		
    		//���� ����
    		if(strike == 3) {
    			System.out.printf("%ȸ�� ���� ������ ������ϴ�\n", tries);
    			break;
    		}
    	}
    }
} 