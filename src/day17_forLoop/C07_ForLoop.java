package day17_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

 //interview sorusu
 //Kullanicidan 100 den kucuk bir tam sayi isteyin 1'den baslayarak girilen tum sayilari yazdir
        //sayi 3'un kati ise sayi yerine java yazdirin
        //sayi 5'in kati ise sayi yerine guzeldir yazdirin
        //sayi hem 3'un hemde 5'in kati isesayi yerine java guzeldir yazdirin

        int sayi =30;

        for (int i = 1; i <=sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("Java Guzeldir ");
            }else if (i%3==0){
                System.out.print("java ");
            }else if (i%5==0 ){
                System.out.print("guzeldir ");
            }else {
                System.out.print(i +" ");
            }


        }
    }
}
