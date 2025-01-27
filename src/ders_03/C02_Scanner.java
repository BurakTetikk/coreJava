package ders_03;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan dairenin yarıçapını alıp, alanını hesaplayın ve yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle");

        double radius = scan.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of circle : " + area);


    }
}
