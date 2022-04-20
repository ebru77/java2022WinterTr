package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

    //Kullanicidan bir kelime isteyin kelime 3 haften kisa ise
  //"kelime cok kisa "yazin kelime 3,4 veye 5 harf ise harf sayisini
  //ve kelimenin tersten yazilisini yazdirin 5 harften uzunsa
  // "kelime cok uzun yazdirin"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime yaziniz");
        String kelime = scan.next();

        String tersKelime = "";

        if (kelime.length()<3){
            System.out.println("kelime cok kisa");
        }else if (kelime.length()<=5){
            if (kelime.length()==3){
                tersKelime = kelime.substring(2)+
                             kelime.substring(1,2)+
                             kelime.substring(0,1);
                System.out.println("girdiginiz kelimedeki harf sayisi : 3 " );
                System.out.println("kelimenin tersten yazilisi : " + tersKelime);

            }else if (kelime.length()==4){
                tersKelime =kelime.substring(3)+
                            kelime.substring(2,3)+
                            kelime.substring(1,2)+
                            kelime.substring(0,1);
                System.out.println("girdiginiz kelimedeki harf sayisi : 4 " );
                System.out.println("kelimenin tersten yazilisi : " + tersKelime);


            }else{
                tersKelime = kelime.substring(4)+
                        kelime.substring(3,4)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
                System.out.println("girdiginiz kelimedeki harf sayisi : 5 " );
                System.out.println("kelimenin tersten yazilisi : " + tersKelime);


            }
            System.out.println("kelimenin harf sayisi : " + kelime.length());
            System.out.println("kelimenin tersten yazilisi : " + tersKelime);

        }else{
            System.out.println("kelime cok uzun");
        }
    }
}
