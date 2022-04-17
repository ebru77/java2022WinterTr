package day12_string_Manipulation;

public class C03_Contains {
    public static void main(String[] args) {

 //kullanicidan email adresi isteyin mail @gmail.com icermiyorsa
 //"lutfen gmail adresinizi giriniz" @gmail.com la bitiyorsa
 //"email adresiniz kaydedildi" @gmail.com la bitmiyorsa "lutfen yazimi kontrol edin" yazdirin

      String mail = "nhes@gmail.com";
      String arananMetin = "@gmail.com";

      if (!mail.contains(arananMetin)){
          System.out.println("Lutfen mail adresinizi giriniz");
      }else if (mail.lastIndexOf(arananMetin)==mail.length()-10){
          System.out.println("email adresiniz kaydedildi");
      }else {
          System.out.println("lutfen yazimi kontrol ediniz");
      }


    }
}
