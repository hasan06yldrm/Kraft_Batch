package day08_ScannerAndOperators;

import java.util.Scanner;

public class _06_ScannerTask1 {
    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alın
        //Sayının karesini konsola yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin : ");

        int girilenSayi=scan.nextInt();
        System.out.println("Girilen sayi = "+girilenSayi);
        System.out.println("Girilen sayinin karesi = "+girilenSayi*girilenSayi);

        scan.close();


    }
}
