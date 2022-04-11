package day11_string_Manipulation;

import java.util.Scanner;

public class CO5_IndexOf {
    public static void main(String[] args) {

        String str1 = "Java bir baska guzel valla cok guzel";
//istersek char olarak verdigimiz bir harfin index,ini dondurur
        System.out.println(str1.indexOf('J'));//0

//istersek bir harf yada metin olarak verdigimiz String'in index'ini dondurur
        System.out.println(str1.indexOf("aska"));//10

        System.out.println(str1.length()-1);//35
        System.out.println(str1.indexOf('a'));//1

//ayni harften birden fazla varsa ilk gordugu eslesmeyi dondurur
        System.out.println(str1.indexOf('b'));//5

 //bu method da java aramaya fromIndex olarak yazdigimiz indexden baslar(inclusive)
        System.out.println(str1.indexOf('b',6));//9

  // Verilen Stringdeki 2.a nin indexini bul
        int ilkindex = str1.indexOf('a');
        System.out.println(str1.indexOf('a',ilkindex+1));//3

        // Verilen Stringdeki 2.b nin indexini bul
        int ilkbindex = str1.indexOf("b");
        System.out.println(str1.indexOf("b",ilkbindex+1));//9

 //20.indexden sonra guzel kelimesini aratalim
        System.out.println(str1.indexOf("guzel",20));

 //String de olmayan bir harf aratsak yok demenin sayisal karsiligini verir (-1)
        System.out.println(str1.indexOf("y"));//-1

  //kullanicidan mail adresi isteyin @ isareti icermiyorsa gecersiz yazdirin
  //iceriyorsa mailiniz kabul edildi yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail = scan.next();

        if (mail.indexOf("@")==-1){
            System.out.println("gecersiz");
        }else {
            System.out.println("mailiniz kabul edildi");
        }
    }
}
