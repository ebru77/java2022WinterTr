package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

  //verilen iki harf ve aralarindaki harfleri yazan bir kod yaziniz

      char ilkHarf = 'e';
      char sonHarf = 's';

        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i + " ");

        }

  //baslangic ve bitis arasinda bu sayilari yazdirin

        double baslangic = 10;
        double bitis = 15;
        double artis =0.2;

        for (double i = baslangic; i <bitis ; i+=artis) {
            System.out.println(i + " ");

        }

    }
}
