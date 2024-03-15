package kr.ac.kopo.day04;

import java.util.Scanner;

public class HwMain01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 10개의 정수를 저장할 배열 생성
        int[] numbers = new int[10];
        
        // 사용자로부터 10개의 정수 입력 받기
        for (int i = 0; i < 10; i++) {
            System.out.print("num" + (i + 1) + " : ");
            numbers[i] = scanner.nextInt();
        }
        
        // 짝수와 홀수를 저장할 배열 생성
        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];
        
        // 짝수와 홀수의 개수를 나타낼 변수 선언
        int evenCount = 0;
        int oddCount = 0;
        
        // 짝수와 홀수를 분리하여 배열에 저장
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenCount] = numbers[i];
                evenCount++;
            } else {
                oddNumbers[oddCount] = numbers[i];
                oddCount++;
            }
        }
        
        // 짝수 출력
        System.out.println("<짝수>");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println("\n짝수의 총합: " + sumArray(evenNumbers, evenCount));
        
        // 홀수 출력
        System.out.println("<홀수>");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println("\n홀수의 총합: " + sumArray(oddNumbers, oddCount));
        
        scanner.close();
    }
    
    // 배열의 합을 계산하는 메소드
    public static int sumArray(int[] arr, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
