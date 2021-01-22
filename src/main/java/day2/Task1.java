package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (1 <= number && number <= 4) {
            System.out.println("Малоэтажный дом");
        }
        else if (5 <= number && number <= 8) {
            System.out.println("Среднеэтажный дом");
        }
        else if (0 > number) {
            System.out.println("Ошибка ввода");
        }
        else {System.out.println("Многоэтажный дом");}
    }
}
