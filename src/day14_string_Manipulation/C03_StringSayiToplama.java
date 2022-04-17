package day14_string_Manipulation;

public class C03_StringSayiToplama {
    public static void main(String[] args) {

 //String seklinde verilen asagidakifiyatlarin toplamini bulun
    //    String str = "$13.99";
   //     String str = "10.55";
  //ipucu : Double.parseDouble() metodunu kullanabilirsin

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\D","");//$ isareti ve . dan kurtulduk
        System.out.println(str1);//1399 String olarak yazdi

        str2 = str2.replaceAll("\\D","");//$ isareti ve . dan kurtulduk
        System.out.println(str2);//1055 String olarak yazdi

        double sayi1 = Double.parseDouble(str1);//sayiya cevirdi (1.yol)
        double sayi2 = Double.parseDouble(str2);//sayiya cevirdi(1.yol)

        double strsayi1 = Double.valueOf(str1);// ikinci yol
        double strsayi2 = Double.valueOf(str2);// ikinci yol

        double toplam = (sayi1+sayi2)/100;
        System.out.println(toplam);//24.54 (1.yol)

        double sonuc = (strsayi1 +strsayi2)/100;
        System.out.println("verilen String sayilarin toplami : $" + sonuc);//24.54 (ikinci yol)







}
}

