package day09_ternary_Switch;

import java.util.Scanner;

public class Ternary_Sorulari3 {
    public static void main(String[] args) {

 //Kullanicidan tam sayi alin ve sayinin mutlak degerini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        Integer sonuc = sayi>=0 ? sayi : (-1)*sayi;
        System.out.println(sonuc);
    }
}
