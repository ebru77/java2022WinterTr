package day18_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

  //kullanicidan bir rakam alip carpim tablosu olusturalim

        //1 2 3       1*2  1*3  1*4
        //2 4 6       2*2  2*3  2*4
        //3 6 9       3*2  3*3  3*4

        int input = 3;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {

                System.out.print((i*j)+" ");

            }//inner loop'un sonu

            System.out.println(" ");//satiri asagi gecirmek icin
            
        }//outer loop'un sonu

//outer loop bir deger aldiginda inner-loop bastan sona calisir sonra outer loop deger degistirir


    }
}
