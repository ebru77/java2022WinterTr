package day13_string_Manipulation;

public class C01_Substring {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";
        System.out.println(str.substring(5));//ile IT cok guzel

    //yukardaki Stringi Mehmet Hoca ile IT cok guzel
        System.out.println(str.replace("Java","Mehmet Hoca"));
        System.out.println("Mehmet hoca " + str.substring(5));
        System.out.println(str.substring(9));//yazilan index inclusive

//Eger bir indexden sona kadar olan parcayi degil belirli bir parcayi almak istersek
    //2 parametre yazmak gerekir str.substring(baslangic indexi, bitis indexi);
//Baslangic indexi inclusive bitis indexi exclusive dir

        System.out.println(str.substring(0,5));//Java
        System.out.println(str.substring(0,1));//J

    //6. karakteri String olarak bulun
    String harf = str.substring(5,6);
        System.out.println(harf);//i

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));//hicbirsey yazdirmaz

 //System.out.println(str.substring(5,2));//bitis indexi baslangic indexinden kucuk olamaz hata verir

        System.out.println(str.substring(str.length()-1));//r son harfi verir

        System.out.println(str.substring(str.length()-5));//siyor (son 5 harfi verir)

        System.out.println(str.substring(str.length()));//son harften sonrasini yani hiclik verir





    }

}
