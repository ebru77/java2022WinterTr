package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {

 //verilen iki sayiyi toplayan bir method olusturalim

        int sayi1 = 10;
        int sayi2 = 20;

        ikiSayiTopla(sayi1,sayi2);

 //iki double sayinin toplamini yazdiran bir method olusturalim

        double sayi3 =15.2;
        double sayi4 =10.3;

        //ikiSayiTopla(sayi3,sayi4);

    }

    private static void ikiSayiTopla(int sayi1, int sayi2) {

        System.out.println("iki integer toplami :" + (sayi1 + sayi2));
    }
}
