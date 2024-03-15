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
        return String.format("%s\t\t%d��", name, price);
    }
}

public class Icecreamshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("���̽�ũ�� � �����ҷ�? ");
        int numIcecreams = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Icecream[] icecreams = new Icecream[numIcecreams];

        for (int i = 0; i < numIcecreams; i++) {
            System.out.printf("** %d's ���̽�ũ�� �������� �Է� **%n", i + 1);

            System.out.print("���̽�ũ����: ");
            String name = scanner.nextLine();

            System.out.print("���̽�ũ������: ");
            int price = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            icecreams[i] = new Icecream(name, price);
        }

        System.out.println("<�� " + numIcecreams + "���� ���̽�ũ�� �������� ���>");
        System.out.println("-----------------------------------------");
        System.out.println("��ȣ\t\t���̽�ũ����\t\t���̽�ũ������");
        System.out.println("-----------------------------------------");

        int total = 0;
        for (int i = 0; i < numIcecreams; i++) {
            System.out.printf("%d\t\t%s%n", i + 1, icecreams[i]);
            total += icecreams[i].price;
        }

        System.out.println("-----------------------------------------");
        System.out.println("�Ѱ�: " + total + "��");

        scanner.close();
    }
}