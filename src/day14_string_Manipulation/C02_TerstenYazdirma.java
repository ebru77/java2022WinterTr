package day14_string_Manipulation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {

  //Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi
      //ilk harfi buyuk diger harfler kucuk tersden yazdirin

        String input = "Mavi";

        String tersStr = input.substring(3).toUpperCase() +//I
                input.substring(2,3).toLowerCase() +//v
                input.substring(1,2).toLowerCase() + //a
                input.substring(0,1).toLowerCase();//m
        System.out.println(tersStr);//Ivam


    }
}
