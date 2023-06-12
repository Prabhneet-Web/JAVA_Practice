package general_practice;

import java.util.Scanner;

public class number_search_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be found: ");
        int numberToFind = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (numberToFind == numbers[i]) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
