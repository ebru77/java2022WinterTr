package day11_string_Manipulation;

import java.util.Locale;

public class C01_ToLowerCase_ToUpperCase {
    public static void main(String[] args) {

        String str = "Java Guzeldir";
   //String methodlarini arka arkaya kullanabiliriz
   //mesala ikinci kelimenin ilk harfini kucuk olarak yazdiralim

      // str.charAt(5); boyle yazdigimizda sonuc artik String degil Char olacaktir
    //dolayisiyla String de yapmak istedigimiz tum degisiklikleri once yapip
    //sonra charAt() methodunu kullanmaliyiz.

        System.out.println(str.toLowerCase().charAt(5));//g

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));//JAVA GUZELDİR
    }
}
