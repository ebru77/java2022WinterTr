package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {


        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2;

        System.out.println(sayi3);//87.9

        //int sayi4=sayi1/sayi2;//kabul etmez cunku deger double, variable int
        //yani variable daha dar dolayisiyla java bunu otomatik olarak yapmaz
        //java sorumlulugu ustlenmemizi ister

        int sayi4= (int) (sayi1/sayi2);//sayi1'i sayi2'ye bol cikani int'e ata
        System.out.println(sayi4);//87

        int sayi5=140;
        //byte sayi6=sayi5;kabul etmez sag teraftaki deger int sol taraftaki byte
        byte sayi6=(byte) sayi5;
        System.out.println(sayi6);//-116

        sayi5=130;
         sayi6=(byte) sayi5;
        System.out.println(sayi6);//-126

         sayi5=260;
         sayi6=(byte) sayi5;
        System.out.println(sayi6);//4

        sayi5=520;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);//8


        sayi5=-130;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);//126





    }
}
