package interviewSorulari;

public class Soru2_PerfektNumber {

    public static void main(String[] args) {
   //Perfekt number
  //Kullanici tarafindanbir sayiya kadar olan sayilarin,mukemmel olup olmadigini bulan method yaziniz
   //Mukemmel sayi :bir sayinin kendisi haric bolenlerin toplami kendisine esitse o sayi mukemmeldir
   //(1+2+3 = 6 = 6)Mukemmel
        //ornek  : 6, 28, 496, 8128
        //Input : 6
        //Output : 1 2 3

        int sayi =1000;
        sayiMukemmelMi(sayi);
    }

    private static void sayiMukemmelMi(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                toplam += i;
                System.out.println(i + " ");

                
            }
        }
        if (toplam==sayi){

        }

    }

}
