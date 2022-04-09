package day08_ifElseStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {

  //Kullanicidan iki sayi isteyiniz
  //sayilardan ikiside pozitifse sayilarin toplamini yazdirin
  //sayilarin ikiside negatif ise sayilarin carpimini yazdirin
  //sayilarin ikisi farkli isaretlerdeyse "farkli isaretlerde sayilarla islem yapamazsin"
  //sayilardan sifira esit olan var ise "sifir carpmaya gore yutan elemandir"yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayi da pozitif oldugundan toplamlari = " +
                    (sayi1+sayi2));

        }else if (sayi1<0 && sayi2<0){
            System.out.println("girdiginiz iki sayi negatif oldugundan carpmalari = " +
                    (sayi1*sayi2));
        }else  if (sayi1*sayi2<0){
            System.out.println("farkli isaretli sayilarla islem yapamazsin");
        }else {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }


    }
}
