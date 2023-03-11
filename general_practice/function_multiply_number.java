package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class function_multiply_number {

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(buffer.readLine());
        int b = Integer.parseInt(buffer.readLine());

        System.out.println("Product of numbers: " + multiplyNumbers(a, b));
    }
}
