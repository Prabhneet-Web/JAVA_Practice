package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solid_rectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int rowsColumns = Integer.parseInt(buffer.readLine());
        System.out.println(rowsColumns);
        for (int i = 0; i < rowsColumns; i++) {
            for (int j = 0; j < rowsColumns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
