package forme;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n;
        int sum_fib;
        Scanner s = new Scanner(System.in);
        n = 20;
        for (int i = 0; i < n; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(sum_fib + " ");
        }
    }
}

