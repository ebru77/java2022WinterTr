package day02_variables;

public class C03_variables {
    public static void main(String[] args) {

        String ogrenciIsmi="Melih";
        ogrenciIsmi="Furkan";

        //bir variable declare edildikten sonraistedigimiz kadar deger degisimi yapabiliriz
        //ancak declare edilen bir variable tekrar declare edilemez

        //String ogrenciIsmi="Abdullah"

       String isim,soyisim,dogumyeri;
       isim="nihat";
       soyisim="ozel";
       dogumyeri="ankara";

        System.out.println(soyisim);

        String tcNo="1234567890";
        String hiclik="";

        //String non-primitive oldugu icinbiz sadece data saklamak degil
        // extra bazi ozellikleri de kullanabiliriz
        //eger tc no,okul numarasiveya tel numarasi gibi
        //kendisi sayisal olan ancak matematiksel bir islemde kullanilmayan
        //degerler icin String kullanilabilir

        String harf="A";
        char harf2='A';

        //bu ikisi icinde ayni durum gecerli
        // ben A harfi icin bir variable'i char olarak da olusturabilirim
        //eger sadece saklayacaksak char kullanilabilir ama
        // String'in ozelliklerindenistifade etmek icin String olarak tanimlamak avantajli olabilir


    }
}
