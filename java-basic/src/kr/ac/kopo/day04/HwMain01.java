package kr.ac.kopo.day04;

import java.util.Scanner;

public class HwMain01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 10���� ������ ������ �迭 ����
        int[] numbers = new int[10];
        
        // ����ڷκ��� 10���� ���� �Է� �ޱ�
        for (int i = 0; i < 10; i++) {
            System.out.print("num" + (i + 1) + " : ");
            numbers[i] = scanner.nextInt();
        }
        
        // ¦���� Ȧ���� ������ �迭 ����
        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];
        
        // ¦���� Ȧ���� ������ ��Ÿ�� ���� ����
        int evenCount = 0;
        int oddCount = 0;
        
        // ¦���� Ȧ���� �и��Ͽ� �迭�� ����
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenCount] = numbers[i];
                evenCount++;
            } else {
                oddNumbers[oddCount] = numbers[i];
                oddCount++;
            }
        }
        
        // ¦�� ���
        System.out.println("<¦��>");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println("\n¦���� ����: " + sumArray(evenNumbers, evenCount));
        
        // Ȧ�� ���
        System.out.println("<Ȧ��>");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println("\nȦ���� ����: " + sumArray(oddNumbers, oddCount));
        
        scanner.close();
    }
    
    // �迭�� ���� ����ϴ� �޼ҵ�
    public static int sumArray(int[] arr, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
