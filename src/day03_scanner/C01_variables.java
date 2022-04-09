package day03_scanner;

public class C01_variables {
    public static void main(String[] args) {
        //1)farkli 3 data turune variable olusturun ve bunlari yazin
        String okulIsmi ="Yildiz Koleji";
        System.out.println(okulIsmi);//Yildiz Koleji

        char ilkHarf;
        ilkHarf='K';
        System.out.println(ilkHarf);//K

        int sayi1=10, sayi2=20;
        System.out.println(sayi1+sayi2);//30

        //2)isim ve soyisim iciniki variable olusturun ve bunlari
        //isminiz : mehmet
        //soyisminiz :bulutluoz  seklinde yazdirin
        String isim="Mehmet";
        String soyIsim=" Bulutluoz";
        System.out.println("isminiz :" + isim);
        System.out.println("soyisminiz :"+ soyIsim);

        //3)iki farkli tam sayiata turunde 2 variable olusturun bunlarin toplamini yazdirin
        short sayi3=20;
        double sayi4=30;
        System.out.println("iki sayinin toplami : "+( sayi3+sayi4));//50,0

        //4)bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        int sayi5=44;
        double sayi6=52.5;
        System.out.println("iki sayinin toplami : " +(sayi5+sayi6));

        //5)char data turunde bir variable olusturun ve yazdirin
        char ozelKarakter='$';
        System.out.println(ozelKarakter);

        //6)bir tamsayi bir de char degisken olusturun ve bunlarin toplamini yazdirin
        int sayi7=20;
        char harf='a';
        System.out.println(sayi7+harf);//117 char data turundeki degiskenler matematiksel islemler kullanilirsa
        // o char degerinin ASCII karsiligi isleme alinir



    }
}
