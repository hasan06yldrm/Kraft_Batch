package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C03_IF_Example {
    public static void main(String[] args) {

        //alinin fizik notu 50
        //kimya 30 ortalaması 50 üzerinde ise
        //ekrana geçti yazsın
        //50 ve altında ise herhangi bir şey yazdırmasın

       /* //double f=55;
        double k=50;
        double ort=(f+k)/2;
        //boolean result=(ort>50);
        double gecmeNotu=50;
        if (ort>gecmeNotu){//result parantez içine
        System.out.println("Ali geçti ");
        } */

        //alinin fizik notu 50
        //kimya 30 ortalaması 50 üzerinde ise
        //ekrana geçti yazsın
        //50 ve altında ise herhangi bir şey yazdırmasın

        Scanner scan=new Scanner(System.in);
        System.out.println("Ders notlarını giriniz : ");
        System.out.println("Fizik : ");
        double f=scan.nextDouble();
        System.out.println("Kimya : ");
        double k=scan.nextDouble();
        System.out.println("Gecme notu : ");
        double gecmeNotu=scan.nextDouble();

        double ort=(f+k)/2;
        if (ort>=gecmeNotu){//geçemeyince hiçbir sey yazmıyor
            System.out.println("Sınıfı geçtiniz tebrikler");
            System.out.println("Harika");
            System.out.println("Bir üst sınıf");
        }
        System.out.println("A");
        System.out.println("B");





    }

}
