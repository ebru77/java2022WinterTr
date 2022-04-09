package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

   //Kullanicidan bir tam sayi isteyinve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }
        if (sayi%2!=0){
            System.out.println("sayi tektir");
        }
    //normalde bir tam sayi ya tektir yada cift,ucuncu bir durum yoktur
    //o zaman tek yada cift olmasini iki if ile degil
    // if else ile tek statement ta yapmak daha dogrudur


        //********IF ELSE ILE COZUM******

       if(sayi%2==0){
           System.out.println("sayi cifttir");
       }else {
           System.out.println("sayi tektir");
       }
    }
}
