package interviewSorulari;

public class Soru3_Palidrome {
    public static void main(String[] args) {

        //interview sorulari
        //Kullanicidan bir string isteyin.Girilen String'in palidrome
        //olup olmadigini kontrol eden bir program yaziniz

        String input = "madam";
        polidromeKontrolEt(input);
    }

    private static void polidromeKontrolEt(String input) {

        String terstenInput ="";
        for (int i = input.length()-1; i >= 0; i--) {
            terstenInput+=input.charAt(i);


        }
        System.out.println("Girdiginiz kelimenin tersten yazilisi : " + terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("girdiginiz kelime palidrom");
        }else {
            System.out.println("girdiginiz kelime palidrome degil");
        }
    }


}




