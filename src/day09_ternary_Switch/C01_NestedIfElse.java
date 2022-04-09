package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

  //kullanicidan dort basamakli bir sayi aliniz girdigi sayi 5'e bolunuyorsa son rakami kontrol edin
  //son rakami 0 ise "5'e bolunen cift sayi yazdirin. 0 degil ise "5'e bolunen tek sayi yazdirin"
  //girdigi sayi 5'e bolunmuyorsa ekrana tekrar deneyin yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi<1000 || sayi>9999){
            System.out.println("lutfen girdiginiz sayiyi kontrol ediniz");

        }else if (sayi%10!=0 && sayi%5==0){
            System.out.println("5'e bolunen tek sayi");
        }else if (sayi%5==0){
            System.out.println("5'e bolunen cift sayi");
        }else{
            System.out.println("5'e bolunemiyor");
        }


    }
}
