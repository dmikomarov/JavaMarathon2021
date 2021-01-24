package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;

        while (c < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            c++;
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);

        }

    }
}

