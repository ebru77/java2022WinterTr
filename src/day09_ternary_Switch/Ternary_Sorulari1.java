package day09_ternary_Switch;

import java.util.Scanner;

public class Ternary_Sorulari1 {
    public static void main(String[] args) {

  //kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        Integer sonuc = sayi1>sayi2 ? sayi2 :sayi1;
        System.out.println(sonuc);
    }
}

