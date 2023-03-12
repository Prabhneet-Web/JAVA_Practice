package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class finding_average {

    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(buffer.readLine());
        int b = Integer.parseInt(buffer.readLine());
        int c = Integer.parseInt(buffer.readLine());

        System.out.println("Average of " + a + ", " + b + ", " + c + ", is: " + average(a, b, c));

    }
}
