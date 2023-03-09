package general_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch_case {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int button = Integer.parseInt(buffer.readLine().trim());

        switch (button) {
            case 1:
                System.out.println("Button 1 pressed");
                break;
            case 2:
                System.out.println("Button 2 pressed");
                break;
            case 3:
                System.out.println("Button 3 pressed");
                break;
            default:
                System.out.println("E");
        }
    }
}
