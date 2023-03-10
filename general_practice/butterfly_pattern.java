package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class butterfly_pattern {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int rowsColumns = Integer.parseInt(buffer.readLine());

        for (int i = 1; i <= rowsColumns; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <= (2 * rowsColumns) - (2 * i) - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= rowsColumns; i++) {
            for (int j = 1; j <= rowsColumns - i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= rowsColumns - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
