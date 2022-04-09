package day02_variables;

public class C01_variables {
    public static void main(String[] args) {
        //Bir variable olustururken icerisine koyacagim datanin alabilecegi degerlere uygun
        // bir data turu secmeliyiz
        //ornegin bir sehrin nufusundan bahsediyorsak
        //variablemizin data turu String,Boolean,Char veya double olamaz
        //geriye kalan tam sayi turlerinden sehrin nufusunu icine alabilecekbuyuklukte birdata turu secebiliriz
        //biz kurs boyunca genelde tam sayilar icin int,ondalikli sayilar icin double kulllanacagiz.

        System.out.println("Hello World yazdiran Javayi halleder");

        int level=1;
        System.out.println(level);//tirnagin icinde olmadigi icin variablenin degerini yazdirir
        System.out.println("level");//tirnagin icindekini yazdirir.


        boolean ogrenciMi= true;
        boolean yagisVarMi= false;

        System.out.println(ogrenciMi);

        char ozelSembol='&';
        char sayi='2';
        char harf='S';

        System.out.println(harf);
    }
}
