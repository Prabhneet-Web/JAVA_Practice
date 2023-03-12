package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum_of_odd_numbers {

    public static int sumOfOddNumbers(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0)
                sum += i;
            else
                continue;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int limit = Integer.parseInt(buffer.readLine());

        System.out.println("Sum of all odd numbers till " + limit + " is: " + sumOfOddNumbers(limit));

    }
}
