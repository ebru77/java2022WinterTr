package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {



    //String'i yazdiran method olusturalim
    //Hosgeldiniz diyen bir method olustur
    //Kapanma mesaji yazan bir method olustur

        hosgeldinYazdir();


  

    }

    public static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkurler");
    }


    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin");
        stringYazdir("boyle de olur");
    }

    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
