package kr.ac.kopo.day04;

import java.util.Scanner;

public class HwMain03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int errorCount = 0;
        int totalScore = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "'s ���� : ");
            try {
                scores[i] = scanner.nextInt();
                if (scores[i] < 0 || scores[i] > 100) {
                    System.out.println("ERROR!!!");
                    errorCount++;
                } else {
                    totalScore += scores[i];
                }
            } catch (Exception e) {
                System.out.println("ERROR!!!");
                scanner.next();
                errorCount++;
            }
        }

        System.out.println("-------------------------");
        System.out.println("��ȣ   ����   ����");
        System.out.println("-------------------------");
        for (int i = 0; i < 5; i++) {
            String grade;
            if (scores[i] < 0 || scores[i] > 100) {
                grade = "ERROR!!!";
            } else if (scores[i] >= 90) {
                grade = "A";
            } else if (scores[i] >= 80) {
                grade = "B";
            } else if (scores[i] >= 70) {
                grade = "C";
            } else if (scores[i] >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println((i + 1) + "\t" + scores[i] + "\t" + grade);
        }
        System.out.println("-------------------------");
        System.out.println("5ȸ �Է� �� [" + errorCount + "]ȸ �����߻�");
        System.out.println("���� : " + totalScore + "�� ��� : " + (totalScore / 5.0) + "��");
    }
}
