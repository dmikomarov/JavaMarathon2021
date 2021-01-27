package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Random random = new Random();
        int[] y = new int[x];
        int bolshevosmi = 0;
        int ravnoedinice = 0;
        int chentie = 0;
        int nechetnie = 0;
        int sum = 0;
        for (int i = 0; i < y.length; i++) {
            y[i] = random.nextInt(11);
            if (y[i] > 8)
                bolshevosmi++;
            if (y[i] == 1)
                ravnoedinice++;
            if (y[i] % 2 == 0)
                chentie++;
            else
                nechetnie++;
            sum += y[i];
        }
        System.out.println(Arrays.toString(y));
        System.out.println("Больше восьми" + " " + bolshevosmi);
        System.out.println("Равно единице" + " " + ravnoedinice);
        System.out.println("Четные числа" + " " + chentie);
        System.out.println("Нечетные числа" + " " + nechetnie);
        System.out.println("Сумма" + " " + sum);


    }
}
