package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {


        //Kullanicidan bir kelime isteyin kelime 3 haften kisa ise
        //"kelime cok kisa "yazin kelime 3,4 veye 5 harf ise harf sayisini
        //ve kelimenin tersten yazilisini yazdirin 5 harften uzunsa
        // "kelime cok uzun yazdirin"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime yaziniz");
        String kelime = scan.next();
        int harfSayisi = kelime.length();

        if (harfSayisi<3){
            System.out.println("kelime cok kisa");

        }else if (harfSayisi==3){
            ucHarfiTersineCevir(kelime);

        }else if (harfSayisi==4){
            dortHarfiTersineCevir(kelime);

        }else if (harfSayisi==5){
            besHarfiTersineCevir(kelime);

        }else {
            System.out.println("kelime cok uzun");
        }

    }
    //1-Method olusturmak icin methodun adini yazariz
    //2- Methoda giderken goturmem gereken variable varsa,bunu methoda ekle
    //3-


    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) +
                kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 5 " );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);


    }
    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4 " );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);


    }

    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2)+
            kelime.substring(1,2)+
            kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 3 " );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);



    }





    }



