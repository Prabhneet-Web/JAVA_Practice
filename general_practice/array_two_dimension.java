package general_practice;

import java.util.Scanner;

public class array_two_dimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the Marks: ");
                marks[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

    }
}
