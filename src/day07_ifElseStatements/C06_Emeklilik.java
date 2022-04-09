package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

   // kullanicidan yasini isteyin 65 yada daha buyukse emekli olabilirsin
   // 65 den kucukse emekli olamazsin yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else{
            System.out.println("emekli olamazsin");
            System.out.println(65-yas + "sene daha calismalisin");
        }
    //if else statement'lerden iki durumdan sadece biri calisir
    //ikisininde birden calisma ihtimali ===YOK
    //ikisininde calismama ihtimali ===YOK
    }
}
