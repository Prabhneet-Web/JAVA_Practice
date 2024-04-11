import java.util.Scanner;

public class two_d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfRows = sc.nextInt();
        int noOfColumns = sc.nextInt();

        int arrayOfNumbers[][] = new int[noOfRows][noOfColumns];

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                arrayOfNumbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                System.out.print(arrayOfNumbers[i][j] + " ");
            }
            System.out.println();
        }

        int numberToFind;
        System.out.println("Enter the number to find: ");
        numberToFind = sc.nextInt();

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                if (arrayOfNumbers[i][j] == numberToFind) {
                    System.out.println("Number is at :" + i + " Row & " + j + " Column");
                }
            }
        }
    }
}