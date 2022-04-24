package day18_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        A
        A B
        A B C          seklini yazdirin 65=A ascii degeri
        A B C D
        A B C D E
        A B C D E F

         */

        char input ='I';

        for (char i = 'A'; i <= input; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j + " ");

            }
            System.out.println("");

        }

    }
}
