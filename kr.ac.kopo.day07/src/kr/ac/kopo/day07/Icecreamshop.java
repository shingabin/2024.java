package kr.ac.kopo.day07;

import java.util.Scanner;

class Icecream {
    String name;
    int price;

    Icecream(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s\t\t%d원", name, price);
    }
}

public class Icecreamshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이스크림 몇개 구입할래? ");
        int numIcecreams = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Icecream[] icecreams = new Icecream[numIcecreams];

        for (int i = 0; i < numIcecreams; i++) {
            System.out.printf("** %d's 아이스크림 구매정보 입력 **%n", i + 1);

            System.out.print("아이스크림명: ");
            String name = scanner.nextLine();

            System.out.print("아이스크림가격: ");
            int price = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            icecreams[i] = new Icecream(name, price);
        }

        System.out.println("<총 " + numIcecreams + "개의 아이스크림 구매정보 출력>");
        System.out.println("-----------------------------------------");
        System.out.println("번호\t\t아이스크림명\t\t아이스크림가격");
        System.out.println("-----------------------------------------");

        int total = 0;
        for (int i = 0; i < numIcecreams; i++) {
            System.out.printf("%d\t\t%s%n", i + 1, icecreams[i]);
            total += icecreams[i].price;
        }

        System.out.println("-----------------------------------------");
        System.out.println("총계: " + total + "원");

        scanner.close();
    }
}