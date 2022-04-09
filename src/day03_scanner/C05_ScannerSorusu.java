package day03_scanner;

import java.util.Scanner;

public class C05_ScannerSorusu {
    public static void main(String[] args) {
        //Kullanicidan yari cap isteyip cemberin cevresini ve dairenin alanini hesapla yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yari capini giriniz");
        double yariCap=scan.nextDouble();
        System.out.println("girdiginiz yaricap: "+ yariCap);
        System.out.println("cemberin cevresi: "+ 2*3.14*yariCap);
        System.out.println("dairenin alani: "+ 3.14*yariCap*yariCap);

    }
}
