package day08_ifElseStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {

 //kullanicidan 100 uzerinden notunu isteyin
 //notu harf sistemine cevirip yazdirin
 // 50 den < se "D", 50_60 arasi "C", 60_80 arasi "B", 80'nin uzerinde "A"yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen notunuzu yaziniz");
        double notSayi = scan.nextDouble();

        if (notSayi<0 || notSayi>100){
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }
        if (notSayi<50 ){
            System.out.println("D");
        }else if ( notSayi<60){
            System.out.println("C");
        }else if ( notSayi<80){
            System.out.println("B");
        }else{
            System.out.println("A");

        }


    }
}
