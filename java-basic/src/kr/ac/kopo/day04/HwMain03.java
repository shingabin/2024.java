package kr.ac.kopo.day04;

import java.util.Scanner;

public class HwMain03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int errorCount = 0;
        int totalScore = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "'s 성적 : ");
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
        System.out.println("번호   성적   학점");
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
        System.out.println("5회 입력 중 [" + errorCount + "]회 에러발생");
        System.out.println("총점 : " + totalScore + "점 평균 : " + (totalScore / 5.0) + "점");
    }
}
