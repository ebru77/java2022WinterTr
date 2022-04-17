package day12_string_Manipulation;

public class C05_Replace {
    public static void main(String[] args) {

        String str = "Bugun ne cok sey ogrendik";

 //bu cumledeki bosluk disindaki karakter sayisini bulunuz
        System.out.println("space haric karakter sayisi : " + str.replace(" ","").length());//21
 //Atama yapilmadigi surece orjinal String kalici olarak degismez
 //Sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur

        System.out.println("orjinal str karakter sayisi : " + str.length());//25

  //str da kalici degisiklik yapalim "bugun" yerine "yarin"
  // "ogrendik" yerine "coktan ogrendik"

       str = str.replace("Bugun","Dun");
       str = str.replace("sey ogrendik","seyi coktan ogrendik");
       System.out.println("Kalici degisiklikten sonra : " + str);
    }
}
