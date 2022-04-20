package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {
        String isim = "Nesrin Hacer Ebru";
        String soyisim = "Shik";
        String krediKartino = "1234123412341234";

//Eger bir methoddan bir islem yapmasini ve yaptigi islemi bize getirmesini isterseniz
//Return type void degil,bize getirecegi sonucun data turunde olmalidir

        String gizlenmisIsimSoyisim = isimSoyisimGizle(isim,soyisim);

  //bana isim ve soyismin gizlenmis halini getirmesini istiyorum
  //bekledigim donus STring olur

        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmisKrediKartiNo = krediKartiGizle(krediKartino);

        System.out.println(gizlenmisKrediKartiNo);

    }

    private static String krediKartiGizle(String krediKartino) {
        String yeniKrediKartno = "**** **** **** " + krediKartino.substring(12);
        return yeniKrediKartno;

    }

    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim = isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S","*");
  //Method olusturmada 3. adim method calisinca sadece birsey mi yazdiracak
  //yoksa bize bir data mi dondurecek buna karar vermektir
  //bu soruda gizlenmis isim soyisim dondurmesi istendiginden
  //return type'i void degil string sectik ve metodun sonuna return edilecek datayi yazdik
        return yeniIsim + " " + yeniSoyisim;

    }
}
