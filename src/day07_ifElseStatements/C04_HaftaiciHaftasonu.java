package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaiciHaftasonu {
    public static void main(String[] args) {

  //Kullanicidan gun ismini alin haftaici yada haftasonu oldugunu yazdirin
  //***String icin equals methodunu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun adi giriniz");
        String gunIsmi = scan.next().toLowerCase();//kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyoruz

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("hafta sonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||gunIsmi.equals("persembe")||gunIsmi.equals("sali") ){
            System.out.println("hafta ici");
        }
    }
}
