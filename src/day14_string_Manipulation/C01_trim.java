package day14_string_Manipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str = " Siz ne derseniz deyin ,java bildigini okur. ";

       str.trim();
        System.out.println(str);//Siz ne derseniz deyin ,java bildigini okur(bosluklu)
        System.out.println(str.length());//45

        str = str.trim();//cumlenin basindaki ve sonundaki boslugu siler
        System.out.println(str);//Siz ne derseniz deyin ,java bildigini okur
        System.out.println(str.length());//43


    }
}
