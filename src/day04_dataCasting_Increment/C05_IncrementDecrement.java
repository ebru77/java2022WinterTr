package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;

        System.out.println(sayi+10);//30 sayinin 10 fazlasini yazdirdim artirmadim
        System.out.println(sayi);//20
     //eger atama yapmazsak sayida yaptigimiz artirma yada azaltma kalici olmaz

        sayi=sayi+10;//==> 10 artirdi
        System.out.println(sayi);//30

        System.out.println(sayi=sayi+=10);//40==>10 daha artirdi ve atadi
        System.out.println(sayi);//40

        System.out.println(sayi+=10);//50
        System.out.println(sayi);//50

        //bir variablenin degerini kalici olarak artirmak veya azaltmak istersek assigment sart

        System.out.println("23.satir :" + sayi++);//50
        System.out.println("24.satir :" + sayi);//51

        System.out.println("26.satir : " + ++sayi);//52
        System.out.println("27.satir : " + sayi);//52




    }
}
