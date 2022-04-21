package interviewSorulari;

public class Soru4_Faktoryel {
    public static void main(String[] args) {

        //interview sorulari
        //Kullanicidan 10'dan kucuk bir tam sayi isteyin
        //ve girilen sayinin faktoryel'ini bulun (5!=5*4*3*2*1)

        int input = 8;
        int faktoryel = 1;
        for (int i = input; i >=1 ; i--) {
            faktoryel*=i;
        }
        System.out.println(input +"! = " + faktoryel);

    }
}
