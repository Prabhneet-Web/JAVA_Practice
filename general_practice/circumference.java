package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class circumference {

    public static double circumferenceOfTheCircle(int radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int radius = Integer.parseInt(buffer.readLine());

        System.out.println("Circumference of the circle: " + circumferenceOfTheCircle(radius));
    }
}
