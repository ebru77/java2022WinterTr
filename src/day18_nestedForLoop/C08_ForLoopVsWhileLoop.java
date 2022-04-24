package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {

  //Kullanicidan toplamak istedigi sayilari alin ve kullanici
  //0'a basincaya kadar devam edin kullanici 0'a bastiginda
  //girdigi tum sayilarin toplamini yazdirin


        Scanner scan = new Scanner(System.in);
        int sayi =1;//baslangic degeri
        int sum = 0;

        while (sayi!=0){//bitis degeri
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            sum+=sayi;//degisim degeri (artma yada azalma)

//baslangic bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir
//ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir
        }
        System.out.println("girilen sayinin toplami : " + sum);
    }
}
