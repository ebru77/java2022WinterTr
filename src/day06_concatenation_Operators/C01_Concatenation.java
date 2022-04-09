package day06_concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=3;

        //variable'larin degerlerini degistirmeden asagidaki ifadeleri
        //bu variableleri kullanarak yaziniz

        System.out.println(str1+sayi1+str2);//java5Guzeldir
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);//2Guzeldir15
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));//java22
        System.out.println(sayi1+(sayi2+str2));//53Guzeldir
        System.out.println(""+sayi1+sayi2+str2);//53Guzeldir

        /*
        Eger tamamen sayilardan olusan bir string varsa ve biz bunu int'e cevirmek istersek
        Integer.valueof(str)

        bir sayiyi String'e cevirmek istersem "" + sayi
         */
        System.out.println();
    }
}
