package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hollow_rectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int rowsColumns = Integer.parseInt(buffer.readLine());

        for (int i = 1; i <= rowsColumns; i++) {
            for (int j = 1; j <= rowsColumns; j++) {
                if (i == 1 || i == rowsColumns || j == 1 || j == rowsColumns)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
