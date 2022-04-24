package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

   //Kullanicidan kac sayi toplamak istedigini alin
   //bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        int sayiAdedi = 3;
        Scanner scan = new Scanner(System.in);//obje olusturma loop icinde yapilmaz
        int sayi = 0;//variable objeyi atayacagimiz konteynir

        int sum = 0;//toplami koyacagimiz variable

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("Lutfen bir sayi giriniz");//kullaniciya mesaj
            sayi = scan.nextInt();//loop'un icinde objeye deger atadik
            sum+=sayi;
        }
        System.out.println("girilen " + sayiAdedi + " sayinin toplami : " + sum);

        //while ile yapalim

        sayi = 0;//kullanicidan alacagim sayi
        sum = 0;
        int sayac = 1;//while loop,un condationini saglayacak sayac

        while (sayac<=sayiAdedi){
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            sum+=sayi;
            sayac++;
        }
        System.out.println("girilen " + sayiAdedi + " sayinin toplami : " + sum);

    }
}
