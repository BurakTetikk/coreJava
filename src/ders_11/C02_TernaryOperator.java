package ders_11;

import java.util.Scanner;

public class C02_TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a character.");

        char ch = scan.next().charAt(0);

        System.out.println((char) ((96 < ch && ch < 123) ? ch - 32 : ch));

    }
}
