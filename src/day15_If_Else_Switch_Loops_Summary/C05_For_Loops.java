package day15_If_Else_Switch_Loops_Summary;

import java.util.Scanner;

public class C05_For_Loops {
    public static void main(String[] args) {


       /* //kullanıcının 3 hakkı olsun şifre girsin
        Scanner scan = new Scanner(System.in);
        int sifre = 56;
        System.out.println("şifre nedir 3 hakkınız var");

        int i = 0;
        while (i < 3) {
            System.out.println("Şifre : ");
            int tahmin = scan.nextInt();
            if (sifre == tahmin) {
                System.out.println("şifre doğru");
                break;
            }//else{ burada gerek yok break le çıkıyor
            System.out.println("şifre yanlış");
        }
        i++;

        System.out.println("---------------------------------");

        //kullanıcının 3 hakkı olsun şifre girsin
        Scanner scan = new Scanner(System.in);
        int sifre = 56;
        System.out.println("şifre nedir 3 hakkınız var");

        boolean result=true;

        while (result) {
            System.out.println("Şifre : ");
            int tahmin = scan.nextInt();
            if (sifre == tahmin) {
                System.out.println("şifre doğru");
                result=false;
            }else{
                System.out.println("şifre yanlış");
            }

        }

        System.out.println("-----------------------------------"); */

        //kullanıcının 3 hakkı olsun şifre girsin
        Scanner scan = new Scanner(System.in);
        int sifre = 56;
        System.out.println("şifre nedir 3 hakkınız var");

        boolean result = true;
        int i = 0;
        while (result) {
            System.out.println("Şifre : ");
            int tahmin = scan.nextInt();
            if (sifre == tahmin) {
                System.out.println("şifre doğru");
                result = false;
            } else {
                System.out.println("şifre yanlış");
                i++;
            }
            if (i == 3) {
                result = false;
            }
        }


    }


}


