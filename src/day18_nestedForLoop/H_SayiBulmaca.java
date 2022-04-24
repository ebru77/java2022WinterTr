package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_SayiBulmaca {
    public static void main(String[] args) {

  //bilgisayara 1 ila 100 arasinda bir sayi tutturun kullanicidan bu sayiyi tahmin etmesini iste
  //girilen her tahminde sayiyi buyut yada kucult diye kullaniciya yol gosterin
  //kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd = new Random();//rastgele anlamina gelen obje olusturuyoruz
        int sayi = rnd.nextInt(100);//100'den kucuk rastgele bir sayi olusturur

        Scanner scan = new Scanner(System.in);//kullanicidan tahmin alabilmek icin
        // loop tan once ihtiyacimiz olan variable lari olustur
        int tahmin = 0;//tahmini kaydedebilmek icin variable olustur
        int sayac =1;//kac tahmin yaptigini bulmak icin
    //sayaci 1 aldik kullanici ilk seferde bilirse while loop u pass gececeginden  0 tahminde bildiniz yazar

        while (sayi!=tahmin){//tahmin ve sayi esit olmadigi surece dongu devam edecek
            System.out.println("Lutfen bir sayi giriniz");
            tahmin = scan.nextInt();

            if (tahmin>sayi){
                System.out.println("Daha kucuk bir sayi soylemelisin");
            }else if (tahmin<sayi){
                System.out.println("Daha buyuk bir sayi soylemelisin");
            }
            sayac++;//loop bitmeden sayaci arttirmaliyim
        }
        System.out.println("tuttugun sayiyi " + (sayac-1) + " buldunuz");


    }
}
