package day06_concatenation_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);//false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc1);//true

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc2);//false

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;//false

        //&& ve & arasindaki fark

      // sayi3'un 10 ile 20 arasinda oldugunu true diyerek dondurun
      // java uclu karsilastirma kabul etmez ikilikarsilastirmalar yapip birlestirmeliyiz
        int sayi3 =15;
        System.out.println(sayi3>10 & sayi3<20);//true

     //sayi4 un10 ile 15 arasinda olmadigini true diyerek dondurelim
        int sayi4=5;
        System.out.println(sayi4<10 || sayi4>15);//true





    }
}
