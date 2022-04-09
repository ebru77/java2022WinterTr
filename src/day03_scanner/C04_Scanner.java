package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
    //Scanner kullanmak icin 3 adim takip ediyoruz
        //1.adim kendimize bir scanner olusturmak

        Scanner scan = new Scanner(System.in);//1.esitligin saginda yeni bir scan olusturulur
        //ve olusturulan bu scanner scan variable ina assign edilir.scan variablenin ismidir
        // istedigimiz ismi veririz
        //2.Kullanicidan istediginiz degeri girebilmesi icin aciklayici bir bilgi yazdirin

        System.out.println("Lutfen isminizi giriniz");

        //3.adim kullanicinin girdigi degere uygun bir variable olusturup kaydedin

        //String kullaniciIsmi=scan.next();(next) SADECE ilk kelimeyi alir(space e kadar)

         String kullaniciIsmi=scan.nextLine();//satir sonuna kadar girileni alir
        System.out.println("kullanicinin girdigi isim :"+kullaniciIsmi);






    }
}
