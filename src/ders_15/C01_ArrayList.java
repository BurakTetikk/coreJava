package ders_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Burak");
        //names.add(5);

        List<Object> objects = new ArrayList<>();
        objects.add("String");
        objects.add(56);
        objects.add(true);

        System.out.println(objects); //[String, 56, true]

        objects.forEach(System.out::print); //String56true

        System.out.println();

        System.out.println("-----------");

        String[] strArray = {"a", "b", "c"};
        List<String> letters = Arrays.asList(strArray);
        /*
            1-Bu method ile oluşturulan ArrayList'ler array'in negative tarafı olan sabit uzunluk
            kuralına tabi olurlar yani bu listelere ekleme veya silme yapamazsınız

            2-Her ne kadar kaynak olarak kullandığımız strArray ve oluşturduğumuz letters list farklı
            objeler olsa da Java bunları tek bir yapı gibi görür ve birinde yaptığımız değişikliği otomatik
            diğerine de işler

        */
        strArray[0] = "Ğ";
        letters.set(0, "X");

        //letters.add("4"); -> Exception in thread "main" java.lang.UnsupportedOperationException

        System.out.println(Arrays.toString(strArray));
        System.out.println(letters);

    }
}
