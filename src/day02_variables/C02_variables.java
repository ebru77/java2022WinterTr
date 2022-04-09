package day02_variables;

public class C02_variables {
    public static void main(String[] args) {
        //eger istersek bir variable'i once declare edip sonra deger atayabiliriz
        //java calismaya main method dan baslar
        //sonra yukardan asagi,soldan saga dogru calisir

        String okulIsmi;

        //java deger atamasi yapmadigimiz bir variable olusturmamiza itiraz etmez
        // ancak deger atamasi yapincaya kadar o variable'i kullanmamiza izin vermez
        //System.out.println();

        okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);//yildiz koleji

        okulIsmi="star koleji";
        System.out.println(okulIsmi);//star koleji

        //println ile print arasindaki fark
        //println dediginizde yazdirma isleminden sonra alt satira gecerken
        //print dedigin zaman yazdirma isleminden sonra alt satira gecmez
    }
}
