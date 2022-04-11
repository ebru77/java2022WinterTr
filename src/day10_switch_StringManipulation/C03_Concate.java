package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

    //concation yapmak icin iki ihtimalimiz var ya (+)operatorunu kullanabiliriz
    //yada String classindan gelen concate metodunu kullanabiliriz

        String str1 = "Java";
        String str2 = "Candir";
        //java candir yazdiralim

        System.out.println(str1 +" "+ str2);

        String cumle = str1.concat(str2);//javacandir

        cumle=str1.concat(" ").concat(str2);

        System.out.println(cumle);

//cumle icine String degil de sayi yada boolean yazarsak ne olur
//concate metodu icine String parametre ister String disinda bir parametre yazildiginda
//onu String haline getirmeliyiz ornek : cumle = str1.concat(""+ 5);
        //cumle = str1.concat(""+ 5);
        //cumle = str1.concat(true +" ")
    }
}
