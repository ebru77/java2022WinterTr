package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

  //String de herhangi bir karakteri almak istedigimizde o harfin index'ini kullanarak
  //str.charAt(Istenen Idex) yazabiliriz
         String str = "Java Cok Guzel";
     //J harfini yazdirmak icin
        System.out.println(str.charAt(0));

    //G yi yazdiralim
        System.out.println(str.charAt(9));

    //va yazdiralim
        System.out.println(" "+str.charAt(2)+str.charAt(3));//va

    //cOK yazdiralim
        System.out.println(" "+str.toLowerCase().charAt(5)
                +str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));//cOK

    //son harfi yazdir.Son harfin indeksi string uzunlugu-1=
        System.out.println(str.charAt(14-1));//uzunluk-1

   //eger uzunlugu index olarak girersek hata verir
       // System.out.println(str.charAt(14));//hata verir

    }
}
