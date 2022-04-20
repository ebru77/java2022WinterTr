package day16_methodCreation;

public class C02_Overloading {
    public static void main(String[] args) {

        String str = "bu da gecer ya Huu";
        System.out.println(str.indexOf("d"));//3
        System.out.println(str.indexOf("a",5));//13
        System.out.println(str.indexOf('a',5));//13

 //bir class'da ayni isimde birden fazla method olmasina overloading denir
 //ya parametre sayisi farkli olmali yada parametre sayisi ayni ise
 //argumentlerin data turleri farkli olmali


    }
}
