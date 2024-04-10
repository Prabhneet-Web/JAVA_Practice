package general_practice;

import java.util.Scanner;

public class name_two_dimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] names = new String[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the names: ");
                names[i][j] = sc.next();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    