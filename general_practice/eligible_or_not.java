package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eligible_or_not {

    public static Boolean eligible(int age) {
        if (age > 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int age = Integer.parseInt(buffer.readLine());

        System.out.println("Is person eligible for voting? " + eligible(age));

    }
}
