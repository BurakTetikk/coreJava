package ders_04;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {

        // Kullanıcıdan iki tam sayı alın ve bunları birbirine bölün. Sonucu double olarak yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter divided number:");
        int divided = scan.nextInt();

        System.out.println("Please enter dividing number:");
        int dividing = scan.nextInt();

        double result = ((double)divided) / dividing;

        System.out.println(result);

    }
}
