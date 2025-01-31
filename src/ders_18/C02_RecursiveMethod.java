package ders_18;

public class C02_RecursiveMethod {
    public static void main(String[] args) {
        String str = "ey edip adanada pide ye";

        boolean palindrome = isPalindrome(str);

        System.out.println(palindrome);
    }

    private static boolean isPalindrome(String str) {

        if (str.isEmpty() || str.length() == 1) {
            return true;
        } else {
            if (str.substring(0, 1).equalsIgnoreCase(str.substring(str.length() - 1))) {
                return isPalindrome(str.substring(1, str.length() - 1));
            } else {
                return false;
            }
        }

    }
}
