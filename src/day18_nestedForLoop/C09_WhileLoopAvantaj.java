package day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {

   //Kullanicidan istedigi kadar sayi girmesini isteyin
   //kullanicinin girdigi sayilarin toplami 500'u gecerse
   // "artik yeter cok sayi girdin , toplam ... oldu "yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        while (toplam<500){
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("artik yeter cok sayi girdin, toplam " + toplam + " oldu");
    }
}
