package day13_string_Manipulation;

public class C02_Substring {
    public static void main(String[] args) {

 //1-48 of 104 results for "nutella"
 //Bu arama sonucundaki bulunan sonuc sayisi
 //100'den cok ise "super" az ise "az sonuc bulundu"

    String str = "1-48 of 104 results for \"nutella\"";

    int ilkSpace = str.indexOf(" ");
    int ikinciSpace = str.indexOf(" ",ilkSpace+1);
    int ucuncuSpace = str.indexOf(" ",ikinciSpace+1);

    String aramaSonucSayisiStr = str.substring(ikinciSpace+1,ucuncuSpace);//substringden dolayi STRING
        System.out.println(aramaSonucSayisiStr);//104 String

        int aramaSonucSayisiint = Integer.valueOf(aramaSonucSayisiStr);//integer'a cevirdik

        if (aramaSonucSayisiint>100){
            System.out.println("super");

        }else {
            System.out.println("az sonuc bulundu");
        }

    }
}
