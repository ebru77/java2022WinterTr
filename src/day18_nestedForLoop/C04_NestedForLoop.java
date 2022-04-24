package day18_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {

  /*
      *
      * *
      * * *
      * * * *
      * * * * *   bu sekli yazdir
      * * * *
      * * *
      * *
      *

   */

        int input = 5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
                
            }
            System.out.println(" ");
            
        }

        for (int i =1; i <=input-1 ; i++) {//satiri tekrar etmemek icin input-1 yaptik
            for (int j = 1; j <=input-i ; j++) {

                System.out.print("* ");

            }
            System.out.println(" ");

        }


    }
}
