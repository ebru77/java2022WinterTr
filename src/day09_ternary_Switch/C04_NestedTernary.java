package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // OCA VE ISTQB SORULARI
        // Verilen sayinin pozitif mi negatif mi oldugunu kontrol edip
        // 0 veya pozitif sayi ise tek veya cift
        //negatif ise -100 den buyuk yada kucuk oldugunu belirleyen ternary yaziniz


        int sayi = 199;

        if (sayi >= 0) {
            if (sayi % 2 == 0) {
                System.out.println("sayi pozitif cift sayi");
            } else {
                System.out.println("sayi pozitif tek sayi");
            }
        } else {
            if (sayi < -100) {
                System.out.println("sayi -100 den kucuk negatif sayi");
            } else {
                System.out.println("sayi -100 den buyuk negatif sayi");
            }
        }


    }
}
