package ders_16;

public class C02_Methods {
    public static void main(String[] args) {
        String name = "asdfg";
        String lastname = "asdfg";

        String fullName = convertName(name, lastname);
        System.out.println(fullName);
    }

    private static String convertName(String name, String lastname) {
        String s = "";

        s = name.toLowerCase();
        name = name.substring(0, 1).toUpperCase();
        name += s;

        s = lastname.toLowerCase();
        lastname = lastname.substring(0, 1).toUpperCase();
        lastname += s;


        return name + " " + lastname;
    }
}
