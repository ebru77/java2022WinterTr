package day14_string_Manipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {

   //Kullanicidan ismini soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim soyisim :M***** B*******
        //kart no : **** **** **** 1234

        String isim = "Nesrin Hacer Ebru";
        String soyisim = "Sik";
        String krediKartino = "1234123412341234";

        String yeniIsim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase() + soyisim.replaceAll("\\S","*");
        String yeniKrediKartno = "**** **** **** " + krediKartino.substring(12);
        System.out.println("isim_soyisim :" + yeniIsim + " " + yeniSoyisim);
        System.out.println("kredi kart no : " + yeniKrediKartno);

    }
}
