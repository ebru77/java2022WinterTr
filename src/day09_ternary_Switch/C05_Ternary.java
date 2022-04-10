package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

 // Bazen ternary de ki iki sonucun data turleri farkli olabilir
 // Verilen sayi 100'den buyukse sayi'nin karesini alip yazdiran
 // 100'den kucukse "sayi 100'den buyuk olmali yazdiran bir ternary olusturalim

        int sayi = 100;
 //Ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz yada bir degiskene atamaliyiz
 //Eger sonuclar farkli data turunde ise atama yapacagimiz variable'in data turu tek olacagindan atama yapamayiz
 //sadece direk yazmaliyiz
        System.out.println(sayi>=100 ? sayi*sayi :"sayi 100'den buyuk olmali");
    }
}
