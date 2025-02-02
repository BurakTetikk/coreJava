package ders_20;

public class C01_StaticClass {
    public static void main(String[] args) {
        System.out.println(C02_StaticClass.str);
        C01_StaticClass aClass = new C01_StaticClass();
        aClass.hi();
    }

    public String hi(){
        System.out.println(C02_StaticClass.str);
        return "";
    }
}
