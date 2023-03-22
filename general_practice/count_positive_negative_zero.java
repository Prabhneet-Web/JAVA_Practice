package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class count_positive_negative_zero {

    public static int positiveNumber(int number) {
        int count = 0;
        if (number > 0)
            return ++count;
        return count;
    }

    public static int negativeNumber(int number) {
        int count = 0;
        if (number < 0)
            return ++count;
        return count;
    }

    public static int zeros(int number) {
        int count = 0;
        if (number == 0)
            return ++count;
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean trueOrFalse = true;
        do {
            int number = Integer.parseInt(buffer.readLine());

            System.out.println("Would you like to enter more numbers? (y/n)");
            char answer = (char) buffer.read();
            if (answer == 'y') {
                trueOrFalse = true;
                System.out.println(trueOrFalse);
            } else {
                trueOrFalse = false;
                System.out.println(trueOrFalse);
                System.out.println("Total positive numbers: " + positiveNumber(number));
                System.out.println("Total negative numbers: " + negativeNumber(number));
                System.out.println("Total zero numbers: " + zeros(number));
            }
        } while (trueOrFalse);
    }
}
