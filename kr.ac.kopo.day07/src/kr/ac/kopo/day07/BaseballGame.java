package kr.ac.kopo.day07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

    public static void main(String[] args) {
       
    	Scanner sc = new Scanner(System.in);
    	Random random = new Random();
    	
    	//숫자 생성
    	ArrayList<Integer>answer = new ArrayList<>();
    	while(answer.size()<3) {
    		int num = random.nextInt(10);
    		if(!answer.contains(num)) {
    			answer.add(num);
    		}
    	}
    	//게임 시작
    	int tries = 0;
    	while(true) {
    		tries++;
    		
    		//시용자 입력
    		System.out.print("숫자 3개를 입력하세요(예: 123):");
    		String inputStr = sc.nextLine();
    		
    		ArrayList<Integer>input = new ArrayList<>();
    		for(char c : inputStr.toCharArray()) {
    			input.add(Character.getNumericValue(c));
    		}
    		
    		//결과 계산
    		int strike = 0;
    		int ball = 0;
    		
    		for(int i=0; i<3; i++) {    		
    			if(input.get(i) == answer.get(i)) {
    				strike++;
    			}else if(answer.contains(input.get(i))) {
    				ball++;
    			}
    		}
    		
    		//게임 진행 상황 출력
    		System.out.printf("%d회차: %s,%d 스트라이크, %d 볼\n", tries,input,strike,ball);
    		
    		//게임 종료
    		if(strike == 3) {
    			System.out.printf("%회차 만에 정답을 맞췄습니다\n", tries);
    			break;
    		}
    	}
    }
} 