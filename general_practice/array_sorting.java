package general_practice;

import java.util.Scanner;

public class array_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        Boolean temp = true;
        for (int i = 0; i < (numbers.length - 1); i++) {
            if (numbers[i] > numbers[i + 1]) {
                temp = false;
                break;
            }
        }
        System.out.println(temp);

    }
}
