package ders_03;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan ismini alıp sonra da yazdıralım

        // 1.adım : Scanner objesi oluştur

        Scanner scan = new Scanner(System.in);

        // 2.adım : Kullanıcıya ne istediğimizi söyleyelim

        System.out.println("Please type your name..");

        // 3.adım : scan objesini kullanarak kullanıcıdan bilgiyi alıp
        //          oluşturacağımız uygun bir variable'a kaydedelim


        String userName = scan.nextLine();
        // next() sadece ilk space'e kadar olan metni alır
        // nextLine() tüm satırı alır

        System.out.println("Given user name : " + userName);
    }
}
