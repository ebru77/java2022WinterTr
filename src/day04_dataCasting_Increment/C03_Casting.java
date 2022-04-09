package day04_dataCasting_Increment;

public class C03_Casting {
    public static void main(String[] args) {

        int sayi1=8;
        int sayi2=4;
        System.out.println(sayi1/sayi2);//2

        sayi2=3;
        System.out.println(sayi1/sayi2);//2.66666666 ==> 2

        sayi1=22;
        System.out.println(sayi1/sayi2);//7.333333 ==>7

        //java iki integer sayiyi birbirine bolerse sonucu integer olarak verir
        //eger virgulden sonra kusurat varsa siler.yuvarlama yapmaz

        sayi1=4786;
        sayi2=10;

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//478 ==>4786:10=478(sayi1 in yeni degeri)

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//47 ==>478:10=47(sayi1 in yeni degeri)

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//4 ==> 47:10=4(sayi1 in yeni degeri)

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//0 ==> 4:10=0 sayi1 in yeni degeri

        //bir sayidan sondan baslayarak kurtulmak istersek bunu kullanabiliriz

        sayi1=4895;
        double sayi3=10;
        /*
        sayi1=sayi1/sayi3;==> burada atama var sayi1'in sayi3'e bolumunu sayi1'e atiyoruz
         iki farkli sayi data turunu isleme koydugumuzda
        java kucuk olan data turu(int) icin AUTOWIDENING yapar.islemin sonucunu double kabul eder.
        ve buyuk kucugun icine giremeyecegi icin kod calismaz
        */
        System.out.println(sayi1/sayi3);//489.5 yazdirir
        System.out.println(sayi3/sayi1);//0.002042....yazdirir





    }
}
