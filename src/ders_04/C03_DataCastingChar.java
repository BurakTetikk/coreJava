package ders_04;

import java.util.Scanner;

public class C03_DataCastingChar {
    public static void main(String[] args) {
        int i = 'a' + 'b';
        System.out.println(i); // 97 + 98 = 195

        System.out.println('a' + 'b'); //195

        System.out.println("" + 'a' + 'b'); //ab

        System.out.println("a" + 'b');

        System.out.println('a' + "b");

        // Kullanıcıdan bir char alın ve ascii tablosunda bu karakterden sonra 3 karakteri yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a character.. ");

        char ch = scan.next().charAt(0);

        char ch1 = (char)(ch + 1);
        System.out.println(ch1);

        char ch2 = (char)(ch + 2);
        System.out.println(ch2);

        char ch3 = (char)(ch + 3);
        System.out.println(ch3);
    }
}
