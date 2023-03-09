package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class space_solid_rhombus {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int rowsColumns = Integer.parseInt(buffer.readLine());

        for (int i = 0; i < rowsColumns; i++) {
            for (int j = 0; j < rowsColumns - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < rowsColumns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
