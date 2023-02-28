package hackerrank;

import java.util.Scanner;

public class java_output_formatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            System.out.print(s1);
            for (int j = s1.length(); j < 15; j++) {
                System.out.print(" ");
            }
            if (x < 100 && x > 9)
                System.out.println("0" + x);
            else if (x < 10 && x >= 0)
                System.out.println("00" + x);
            else
                System.out.println(x);
        }
        sc.close();
        System.out.println("================================");

    }
}
