package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);
        int max = 0;
        int min = 10000;
        int counter = 0;
        int sum = 0;
        for (int element : array) {
            if (element > max)
                max = element;
            if (element < min)
                min = element;
            if (element % 10 == 0)
                counter++;
            if (element % 10 == 0)
                sum += element;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);
        System.out.println(counter + " ");
        System.out.println(sum);
    }
}
