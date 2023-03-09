package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inverted_half_pyramid_with_numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int rowsColumns = Integer.parseInt(buffer.readLine());

        for (int i = 0; i < rowsColumns; i++) {
            for (int j = 1; j <= rowsColumns - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
