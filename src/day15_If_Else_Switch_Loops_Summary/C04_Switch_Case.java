package day15_If_Else_Switch_Loops_Summary;
import java.util.Scanner;
public class C04_Switch_Case {
    public static void main(String[] args) {
        //byte-short-int-char-String

       /* int x=5;

        switch (x){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            default://default u araya yazmayın yazarsanız break le beraber yazın
                System.out.println("E"); */

        //et menü,sebze menü,çocuk menü(1-2-3)
        //et menü:pirzola50tl,tavuk30tl
        //sebze menü:enginar30tl,roka salatası40tl
        //çocuk menü:patates kızartması 10tl,makarna 5tl

        Scanner scan=new Scanner(System.in);
        System.out.println("et menü,sebze menü,çocuk menü(1-2) : ");
        int tercih_1=scan.nextInt();
        switch (tercih_1){
            case 1:
                System.out.println("pirzola mı (1) tavuk mu (2)");
                int tercih_2=scan.nextInt();
                switch (tercih_2){
                    case 1:
                        System.out.println("pirzola 50TL");
                        break;
                    case 2:
                        System.out.println("tavuk 30TL");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                        break;
                }


            case 2:
                System.out.println("enginar (1) roka salatası (2)");
                int tercih_3=scan.nextInt();
                switch (tercih_3  ){
                    case 1:
                        System.out.println("enginar 10TL");
                        break;
                    case 2:
                        System.out.println("roka salatası 5TL");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }

                break;
            default:
                System.out.println("hatalı giriş");

        }


    }

}
