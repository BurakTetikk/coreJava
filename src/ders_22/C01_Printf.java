package ders_22;

import java.util.Scanner;

public class C01_Printf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        System.out.printf("input :%d\n", number);

        System.out.printf("Output: ");

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number ; j++ ) {
                System.out.printf("%4d ", i * j);
            }
            System.out.println();
        }
    }
}
