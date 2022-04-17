package day12_string_Manipulation;

import java.util.Scanner;

public class C06_ReplaceAll {
    public static void main(String[] args) {

  //Kullanicidan isim ve soyisim bilgisini alip butun harfleri * yapalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi yaziniz");
        String isimSoyisim = scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\w","*"));
    }
}
