package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        int a =10;
        int b =20;

  //iki variable'in degerlerini toplayanbir method olusturun
  // 1. adim : method adini yazalim
  // 2. adim : methoda gondermem gereken bir argumant var mi?

        ikiSayiTopla(25,50);

        C04.dortHarfiTersineCevir("sema");
    }
// Bir method'u olusturmak calismasi icin yeterli degildir
// method cagrilirsa calisir
// ayni class yada baska class da olmasinin bir onemi yoktur
//Java main method da yukardan asagiya dogru calisir
// ve geldigi satiri calistirir

    public static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami : " + ( a+b));
    }
}
