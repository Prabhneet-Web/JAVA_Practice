package hackerrank;

import java.util.Scanner;

class java_stdin_and_stdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstInt = scan.nextInt();
        int secondInt = scan.nextInt();
        int thirdInt = scan.nextInt();

        scan.close();

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
    }
}