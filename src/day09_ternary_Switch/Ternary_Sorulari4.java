package day09_ternary_Switch;

import java.util.Scanner;

public class Ternary_Sorulari4 {
    public static void main(String[] args) {

 //Kullanicidan bir sayi alin. sayi pozitifse "Sayi pozitif "yazdirin
        //negatifse sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi>=0 ? "sayi pozitif" : sayi*sayi);
    }
}
