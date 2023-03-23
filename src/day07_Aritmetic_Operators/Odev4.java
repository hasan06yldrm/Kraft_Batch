package day07_Aritmetic_Operators;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.print("Toplam Saniye : ");
        int ts= scan.nextInt();

        int saat=ts/3600;
        int dakika=(ts%3600)/60;
        int saniye=ts%60;

        System.out.println("saat = " + saat);
        System.out.println("dakika = " + dakika);
        System.out.println("saniye = " + saniye);


    }
}
