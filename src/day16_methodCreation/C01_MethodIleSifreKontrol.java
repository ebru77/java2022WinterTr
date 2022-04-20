package day16_methodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {

        //Kullanicidan bir sifre girmesini isteyin.
        //Asagidaki sartlari sagliyorsa "sifre basari ile tamamlandi"
        //sartlari saglamazsa "islem basarisiz ,lutfen yeni bir sifre giriniz
        //ilk harf buyuk olmali
        //son harf kucuk olmali
        //sifre bosluk icermemeli
        //sifre uzunlugu en az 8 karakter olmali


        String sifre ="Ahmetcokakilli";

        boolean ilkHarfKontrol = ilkHarfKontrolEt(sifre);
        boolean sonHarfKontrol = sonHarfKontrolEt(sifre);
        boolean boslukKontrol = boslukKontrolEt(sifre);
        boolean uzunlukKontrol= uzunlugunuKontrolEt(sifre);

        if (ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol){
            System.out.println("sifre basari ile tamamlandi");
        }else {
            System.out.println("islem basarisiz,lutfen tekrar deneyiniz");
        }



    }

    private static boolean uzunlugunuKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        }else {
            System.out.println("sifre en az 8 karakter olmali");
        }


        return uzunlukKontrolSonuc;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc = false;
        if (!sifre.contains(" ")){
            boslukKontrolSonuc = true;
        }else {
            System.out.println("sifre bosluk icermemeli");
        }
        return boslukKontrolSonuc;


    }

    private static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc = false;
        char sonHarf = sifre.charAt(sifre.length()-1);
        if (sonHarf>='a' && sonHarf<='z'){
            sonHarfSonuc =true;
        }else {
            System.out.println("sifremizin son harfi kucuk olmali");
        }

        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf = sifre.charAt(0);
        boolean ilkHarfSonuc = false;

        if (ilkHarf >= 'A' && ilkHarf <= 'Z'){
            ilkHarfSonuc = true;
    }else  {
            System.out.println("sifrenizin ilk harfi buyuk olmali");
        }

        return ilkHarfSonuc;
    }
}
