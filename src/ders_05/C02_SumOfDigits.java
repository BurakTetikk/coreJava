package ders_05;

import java.util.Scanner;

public class C02_SumOfDigits {
    public static void main(String[] args) {

        //Kullanıcıdan alınan 3 basamaklı pozitif bir tamsyının rakamlar toplamını bulun

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a 3 digits number");
        int number = scan.nextInt();

        int sum = 0;
        int ones = number % 10;
        sum += ones;
        number /= 10;

        ones = number % 10;
        sum += ones;
        number /= 10;

        ones = number % 10;
        sum += ones;
        number /= 10;

        System.out.println(sum);


    }
}
