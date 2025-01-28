package ders_09;

public class C02_IfStatements {
    public static void main(String[] args) {
        double not = 80;

        if (not >= 85) {
            System.out.println("AA");
        } else if (not >= 65) {
            System.out.println("BB");
        } else if (not >= 50) {
            System.out.println("CC");
        }else {
            System.out.println("DD");
        }
    }
}
