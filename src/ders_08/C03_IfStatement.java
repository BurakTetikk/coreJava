package ders_08;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int i = scan.nextInt();

        if (i % 3 == 0){
            System.out.println("The number is multiple of 3.");
        }

        if (i % 5 == 0){
            System.out.println("The number is multiple of 5.");
        }
    }
}
