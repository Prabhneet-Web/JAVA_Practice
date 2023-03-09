package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class plus_one {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[5];
        int outputNumber = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = buffer.read();
        }
        for (int i = 0; i < numbers.length; i++) {
            outputNumber *= 10;
            outputNumber += numbers[i];
        }
        System.out.println(outputNumber);
    }
}
