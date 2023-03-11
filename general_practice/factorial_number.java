package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial_number {

    public static int factorial(int num) {
        int count = num;
        if (num == 0)
            return 1;
        else {
            for (int i = 1; i < num; i++) {
                count *= i;
            }
            return count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(buffer.readLine());
        System.out.println("Factorial of the " + num + " is: " + factorial(num));
    }
}
