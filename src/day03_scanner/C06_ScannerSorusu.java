package day03_scanner;

import java.util.Scanner;

public class C06_ScannerSorusu {
    public static void main(String[] args) {

        //Kullanicidan ismi ve soy ismi alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        // isim - soyisim = mehmet bulutluoz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi yaziniz");
        String soyIsim=scan.nextLine();

        System.out.println("isim - soyisim :"+ isim+" "+soyIsim);

    }
}
