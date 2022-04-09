package interviewSorulari;

import java.util.Scanner;

public class Soru1_ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        ucBasamakliArmstrong(sayi);
    }

    private static void ucBasamakliArmstrong(int n) {
        int sayininKupleriToplami = 0;
        int bSayi = 0;
        int girilenSayi = n;

        while (n>0){
            bSayi = n%10;
            sayininKupleriToplami += (bSayi*bSayi*bSayi);
            n = n/10;
        }

        if (girilenSayi==sayininKupleriToplami)
            System.out.println(girilenSayi+ " armstrong bir sayidir");
        else System.out.println("degildir");


    }
}
