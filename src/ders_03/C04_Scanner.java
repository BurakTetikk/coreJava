package ders_03;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan ismini, soyismini ve yaşını alıp aşağıdaki formatta yazdırın
        //  John Doe 44 -> J Doe, 44

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter name, surname, and age:");

        String name = scan.next();
        String lastname = scan.next();
        short age = scan.nextShort();

        char ch = name.charAt(0);

        System.out.println(ch + " " + lastname + ", " + age);


    }
}
