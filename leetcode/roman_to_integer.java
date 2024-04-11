

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class roman_to_integer {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int digit = 0;
        String digitEntered = buffer.readLine();
        for (int i = 0; i < digitEntered.length(); i++) {
            if (digitEntered.charAt(i) == 'I') {
                digit = 1;
                sum += digit;
            }
            if (digitEntered.charAt(i) == 'V') {
                digit = 5;
                if (i > 0 && digitEntered.charAt(i - 1) == 'I')
                    digit = 5 - 2;
                sum += digit;
            }
            if (digitEntered.charAt(i) == 'X') {
                digit = 10;
                if (i > 0 && digitEntered.charAt(i - 1) == 'I')
                    digit = 10 - 2;
                sum += digit;
            }
            if (digitEntered.charAt(i) == 'L') {
                digit = 50;
                if (i > 0 && digitEntered.charAt(i - 1) == 'X')
                    digit = 50 - 20;
                sum += digit;
            }
            if (digitEntered.charAt(i) == 'C') {
                digit = 100;
                if (i > 0 && digitEntered.charAt(i - 1) == 'X')
                    digit = 100 - 20;
                sum += digit;
            }
            if (digitEntered.charAt(i) == 'D') {
                digit = 500;
                if (i > 0 && digitEntered.charAt(i - 1) == 'C')
                    digit = 500 - 200;
                sum += digit;
            }
            if (digitEntered.charAt(i) == 'M') {
                digit = 1000;
                if (i > 0 && digitEntered.charAt(i - 1) == 'C')
                    digit = 1000 - 200;
                sum += digit;
            }
        }
        System.out.println(sum);

    }
}
