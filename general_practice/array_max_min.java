package general_practice;

import java.util.Scanner;

public class array_max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];

            if (min > numbers[i])
                min = numbers[i];
        }
        System.out.println("Max Number: " + max);
        System.out.println("Min Number: " + min);
    }
}
