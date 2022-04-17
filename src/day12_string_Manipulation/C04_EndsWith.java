package day12_string_Manipulation;

public class C04_EndsWith {
    public static void main(String[] args) {

        //kullanicidan email adresi isteyin mail @gmail.com icermiyorsa
        //"lutfen gmail adresinizi giriniz" @gmail.com la bitiyorsa
        //"email adresiniz kaydedildi" @gmail.com la bitmiyorsa "lutfen yazimi kontrol edin" yazdirin


        String email = "nhes33@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("Lutfen gmail adresinizi giriniz");
        }else if (email.endsWith(arananMetin)){
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("LUTFEN YAZIMI KONTROL EDINIZ");
        }
    }
}
