package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C04_IF_ELSE {
    public static void main(String[] args) {

       /* double f=55;
        double k=50;
        double ort=(f+k)/2;
        //boolean result=(ort>50);
        double gecmeNotu=50;
        if (ort>gecmeNotu){//result parantez içine
        System.out.println("Ali geçti ");
        } else{
            System.out.println("Ali kaldı");
        } */


        //fizik kimya ve matematik notlarını konsaldan alsın
        //ortalama 80 ve üzerinde ise geçti yazsın
        //80 altı ise kaldınız yazsın

        Scanner scan=new Scanner(System.in);
        System.out.print("Fizik notunu giriniz : ");
        double f=scan.nextDouble();
        System.out.print("Kimya notunu giriniz : ");
        double k=scan.nextDouble();
        System.out.print("Matematik notunu giriniz : ");
        double m=scan.nextDouble();
        System.out.println("Gecme notu");
        double gecmeNotu=scan.nextDouble();

        double ort=(f+k+m)/3;

        if (ort>=gecmeNotu){
            System.out.println("Gecti");
        }else {
            System.out.println("Kaldı");
        }

    }
}
