package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

  //Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
  // asagidaki sekli yazdirin
        //*
        //* *
        //* * *
        //* * * *

        int input = 5;
        int input2 = 8;//dikdortgen yapmak istedigimizde kullaniriz

        for (int i = 0; i <=input ; i++) {
            for (int j = 0; j <=i ; j++) {
    //nested for loop  dikdortgen veya ucgen formatinda olabilir
    //dikdortgen istedigimizde iki loop icin de bagimsiz en point belirleriz
    //ucgen sekli vermek icin inner loop'un end pointini alarak outer degiskene bagli yapariz
                System.out.print("* ");

            }
            System.out.println("");//asagi gecmesi icin
            
        }

    }
}
