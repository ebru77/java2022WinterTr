package day05_matematikselIslemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        sayi2=sayi1++;
        System.out.println(sayi1 + "," +sayi2 + "," + sayi3);


        sayi3=++sayi1;
        System.out.println(sayi1 + "," +sayi2 + "," + sayi3);

        System.out.println(sayi3++);//12 cunku once yazdiriyor
        System.out.println(sayi3);//13 artirdi

        System.out.println(--sayi2);//9 once azaltti
    }
}
