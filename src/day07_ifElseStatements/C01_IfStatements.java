package day07_ifElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        if(a>b){
            System.out.println(a+b);//true olmadigi icin yazdirmaz
        }
        if(a==b){
            System.out.println(a*b);//true olmadigi icin yazdirmaz
        }
        if (a>100){
            System.out.println("a 100 den buyuk");//yazdirmaz
        }
        if (a*b>5){
            System.out.println("sayilarin carpimi 5 den buyuktur");
        }
        //bagimsiz if cumleleri kendilerinin disinda kodlarla ilgilenmezler
        //bir sart ve o sarta bagli sonuca odaklanir
        //birden fazla bagimsiz if cumlesi oldugunda hepsinin bodysi calisabilecegi gibi
        //hicbirinin bodysi calismayabilir
    }
}
