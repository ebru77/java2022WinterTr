package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {


        int sayi =-140;
  //verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
  // ve sonucu yazdiran bir ternary olusturun


       String sonuc = sayi>=100 ? "sayi 3 basamakli yada daha buyuk" : "sayi negatif veya 3 basamaktan daha kucuk";
       // System.out.println(sonuc);

  //Ternary bize sonuc dondurdugu icin ya bu sonucu direk yazdirmaliyiz
 //yada sonucun data turuneuygun bir variable'a atama yapabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);
    }
}
