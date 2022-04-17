package day12_string_Manipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {

  //Kullanicidan bir cumle ve bir kelime isteyin,kelimenin cumlede kullanimina bakarak
  //asagidaki 3 cumleden uygun olanini yazdirin
        //-Girilen kelime cumlede kullanilmamis
        //-Girilen kelime cumlede bir kere kullanilmis
        //-Girilen kelime cumlede birden fazla kullanilmis

        String cumle = "Java ogren,yeni program ile yeni sayfa ac";
        String kelime = "yeni";


        int ilkKullanim = cumle.indexOf(kelime);
        int sonKullanim = cumle.lastIndexOf(kelime);


        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (sonKullanim==ilkKullanim){
            System.out.println("Girilen kelime cumlede bir kere kullanilmis");
        }else {
            System.out.println("GIRILEN KELIME CUMLEDE BIRDEN FAZLA KULLANILMIS");
        }

        String str = "Eclipse";
        System.out.println(str.lastIndexOf("p",4));//4 dahil


    }
}
