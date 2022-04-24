package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

  //kullanicidan iki tam sayi alip bu sayilari ve aralarindaki tum tam sayilari yazdiran
  //bir kod olusturun

        int input1 = 10;
        int input2 = 20;

        for (int i = input1; i <=input2 ; i++) {
            System.out.print(i + " ");
            
        }
        System.out.println("");//alt satira gecmek icin

        //ayni soruyu while loop la yapalim

        int i = input1;
        while (i <= input2) {
            System.out.print(i + " ");
            i++;

        }
        System.out.println("");
        System.out.println(input1);
    }
}
