package day05_matematikselIslemler;

public class C01_PreincrementPostincrement {
    public static void main(String[] args) {


        int sayi=10;
        //bu sayiyi bir artirmak istersek
        sayi++;
        System.out.println(sayi);//11

        sayi++;
        System.out.println("preincrement'ten once : " + sayi);//12
        //eger ben 12. ve 13. satirda yaptigim islemleri tek satirda yaparsam
        //java iki islemden once hangisinin yapilacagini bilmek ister
        //once artirir sonra yazdirirsak java yeni degeri yazdirir
        //once yazdirir sonra artirirsak ,bu durumda eski deger yazdirilir
        System.out.println("preincrement satirinda : " + ++sayi);//13 once artirdi
        System.out.println("preincrement'den sonra: " + sayi);//13 yazdirdi

        System.out.println("postincrement satirinda : " + sayi++);//13 once yazdirdi
        System.out.println("postincrement satirindan sonra : " + sayi);//14 sonra artirdi
    }
}
