package general_practice;
import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
