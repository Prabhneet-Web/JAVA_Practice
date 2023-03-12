package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greater_number {

    public static int greaterNumber(int a, int b) {
        if (a > b)
            return a;
        else if (a < b)
            return b;
        else
            return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buffer.readLine());
        int b = Integer.parseInt(buffer.readLine());
        System.out.println("Greatest number is: " + greaterNumber(a, b));
    }
}
