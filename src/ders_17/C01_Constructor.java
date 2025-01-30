package ders_17;

public class C01_Constructor {
    public static void main(String[] args) {

        C02_Teacher teacher;
        //System.out.println(teacher.name);

        //teacher = null; -> NullPointerException

        //System.out.println(teacher.name);

        teacher = new C02_Teacher("Burcu");

        //teacher.name = "Burak";

        System.out.println(teacher.name);


    }
}
