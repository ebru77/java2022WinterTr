package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

 //Ternary ile yapilan islemler if else ile de yapilabilir
 //if else yerine ternary tercih etme sebebi yapinin basit ve anlasilabilir olmasidir
 //Ternary icerisinde komplex kodlar olmaz sadece sonuc yada basit islemler vardir

     //Kullanicidan bir tam sayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi ciftdir");
        }else {
            System.out.println("sayi tektir");
        }
        System.out.println((sayi%2==0)?("sayi cift"):("sayi tek"));
    }
}
