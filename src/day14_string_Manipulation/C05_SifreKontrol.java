package day14_string_Manipulation;

import java.util.Scanner;

public class C05_SifreKontrol {
    public static void main(String[] args) {

        //Kullanicidan bir sifre girmesini isteyin.
        //Asagidaki sartlari sagliyorsa "sifre basari ile tamamlandi"
        //sartlari saglamazsa "islem basarisiz ,lutfen yeni bir sifre giriniz
        //ilk harf buyuk olmali
        //son harf kucuk olmali
        //sifre bosluk icermemeli
        //sifre uzunlugu en az 8 karakter olmali


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifre giriniz");

        String sifre =scan.nextLine() ;

        boolean ilkHarf = false;
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkHarf = true;
        }else{
            System.out.println("sifrenizin ilk harfi buyuk olmali");
        }

        boolean sonHarf = false;
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            sonHarf = true;
        }else {
            System.out.println("sifrenizin son harfi kucuk olmali");
        }

        boolean bosluk = false;
        if (!sifre.contains(" ")){
            bosluk = true;
        }else {
            System.out.println("sifre bosluk icermemeli");
        }

        boolean uzunluk = false;
        if (sifre.length()>=8){
            uzunluk = true;
        }else {
            System.out.println("sifre en az 8 karakter olmali");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }
    }
}
