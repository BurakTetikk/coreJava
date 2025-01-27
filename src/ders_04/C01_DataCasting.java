package ders_04;

public class C01_DataCasting {
    public static void main(String[] args) {

        int a = 134;
        double b = 23.4;
        short c = 34;
        byte d = 14;

        double e = a; // değerin data türü int, variable'ın data türü double
        int f = c; // değerin data türü < variable'ın data türü

        short g = d; // değerin data türü < variable'ın data türü


        short h = (short) b; // değerin data türü > variable'ın data türü
        System.out.println("double 23.4 -> short : " + h); //23

        byte l = (byte) a; // variable'ın data türü < değerin data türü
        System.out.println("int 134 -> byte : " + l); //-122

        int m = (int) b; // variable'ın data türü < değerin data türü
        System.out.println("double 23.4 -> int : " + m);

        /*
                Biz daha kapsamlı data türündeki bir değeri daha dar kapsamlı bir variable'a atamak
                istersek Java bunu otomatik yapmayacaktır.
                Çünkü daha kapsamlıyı daha dar kapsamlı bir türe çevirmek istiyorsanız data kayıpları olabilir
                veya java datayı yeni data türüne çevirmek için değiştirebilir

        */


    }
}
