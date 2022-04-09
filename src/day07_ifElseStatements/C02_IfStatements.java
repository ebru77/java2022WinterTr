package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a =10;
        int b =20;

        if (a<b && b<100){
            System.out.println("isteginiz gerceklesecek");

        }
        if (a>0) System.out.println("susulu parantez olmazsa sadece bir satir calisir");

        //bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        //if body sini {} icine yazmalisiniz
        //bodyi {} icine yazmasakta if cumlesi calisir ama ilk gordugu noktali virgulde
        //if cumlesi bitmis olur
     //20.satirdaki kod 13.satirdaki if dogru olsada olmasa da calisir
        System.out.println("ikinci satir da calisti");
    }
}
