package ders_03;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime isteyip, kelimenin ilk harfini yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word..");

        String word = scan.next();

        char ch = word.charAt(0);

        System.out.println("First character : " + ch);

    }
}
