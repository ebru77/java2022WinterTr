package day09_ternary_Switch;

import java.util.Scanner;

public class Ternary_Sorulari2 {
    public static void main(String[] args) {

 // tam sayinin  tek mi cift mi oldugunu yazdirin

        int sayi = 9;
        String sonuc = (sayi%2==0 )? ("sayi cifttir"):("sayi tektir");
        System.out.println(sonuc);
    }
}
