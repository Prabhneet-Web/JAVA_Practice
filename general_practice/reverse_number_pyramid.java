package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverse_number_pyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int rowsColumns = Integer.parseInt(buffer.readLine());

        for (int i = 1; i <= rowsColumns; i++) {

            for (int j = 1; j <= rowsColumns - i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            if (i >= 2) {
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }

    }
}
