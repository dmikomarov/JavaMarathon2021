package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        if (a >= b || a < 0) {
            System.out.println("Некорректный ввод");
        }
        int c = 0;

        while (c < b) {
            if (c % 5 == 0)
                if (c % 10 != 0) {
                    System.out.println(c + " ");
                }
            c = c + 1;
        }


    }
}
