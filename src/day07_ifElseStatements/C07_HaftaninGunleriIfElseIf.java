package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

  //Kullanicidan gun ismi alin hafta ici mi hafta sonu mu yazdirin
  //Eger kullanici gun ismini yanlis girerse "yanlis isim"yazin
  //String icin main methodunu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi = scan.nextLine().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("hafta sonu");

        }else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("hafta ici");
        }else{
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
    //eger if else if.....statement else ile bitiyorsa olasiliklardan bir tanesi mutlaka calisir
    //java ilk buldugu true ya ait sonucu yazdirir ve kalan sartlara bakmaz

    //if else if...cumleleri else ile bitmesede calisir
    //ancak bu durumda tek olasilik calisabilir veya hic bir islem yapmayabilir
    }
}
