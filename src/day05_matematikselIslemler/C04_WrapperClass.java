package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {
     //Primitive data turu ile non_primitive arasindaki farklar nelerdir?
        //primitiveleri java olusturur biz kullaniriz non_primitiveleri hem java olusturur hem de biz

        String str ="Java";
        int sayi = 10;

        System.out.println(str.toUpperCase());//JAVA
        System.out.println(str);

    //non_primitive data turleri data depolamak yaninda bircok farkli method'a sahiptir.
    //ancak primitive data turlerinin boyle bir ozelligi yoktur.
        // primitive data turleri sadece degerleri saklar(container)

    //primitive data turleri icin de bazi methodlargerekli oldugunda java ara bir cozum uretmis
    //Java her bir primitive data turunu non_primitive olarak kullanabilmek icin
    //ozel class'lar olusturmus ve bunlara wrapper classlar adini vermistir

        double sayi2=20.5;
    //sayi2 primitive oldugundan sayi2. dedigimizde hicbir method gelmez

        Double sayi3=15.2;
   //sayi3 wrapper class olan Double classini kullandigindan
    // sayi3. dedigimizde bir cok method gelir

    }
}
