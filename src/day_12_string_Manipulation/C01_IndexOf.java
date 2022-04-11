package day_12_string_Manipulation;

import java.util.Scanner;

public class C01_IndexOf {
    public static void main(String[] args) {

  //Kullanicidan bir cumle ve bir kelime isteyin,kelimenin cumlede kullanimina bakarak
  //asagidaki 3 cumleden uygun olanini yazdirin
        //-Girilen kelime cumlede kullanilmamis
        //-Girilen kelime cumlede bir kere kullanilmis
       //-Girilen kelime cumlede birden fazla kullanilmis

        String cumle = "Java ogren,yeni program ile yeni sayfa ac";
        String kelime = " ";

        int ilkKullanim = cumle.indexOf(kelime);
        int ikinciKullanim = cumle.indexOf(kelime,ilkKullanim+1);

        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (ikinciKullanim==(-1)){
            System.out.println("Girilen kelime cumlede bir kere kullanilmis");
        }else {
            System.out.println("GIRILEN KELIME CUMLEDE BIRDEN FAZLA KULLANILMIS");
        }


    }
}
