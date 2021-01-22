package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int number = s.nextInt();
        if (1 <= number && number <= 4) {
            System.out.println("Малоэтажный дом");
        }
        if (5 <= number && number <= 8) {
            System.out.println("Среднеэтажный дом");
        }
        if (0 > number) {
            System.out.println("Ошибка ввода");
        }
        else {System.out.println("Многоэтажный дом");}
    }
}
