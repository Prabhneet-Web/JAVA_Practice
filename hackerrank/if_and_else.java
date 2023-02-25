package hackerrank;

import java.util.Scanner;

public class if_and_else {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scan.close();

        if(n % 2 != 0){
            System.out.println("Weird");
        }
        else if(n % 2 == 0 && (n>=2 && n<= 5)) {
            System.out.println("Not Weird");
        }
        else if(n % 2 == 0 && (n>=6 && n<=20)){
            System.out.println("Weird");
        }
        else if(n % 2 == 0 && (n > 20)){
            System.out.println("Not Weird");
        }
    }
}
