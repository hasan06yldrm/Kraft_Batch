package day07_Aritmetic_Operators;

import java.util.Scanner;

public class _04ScannerExample {
    public static void main(String[] args) {

       /*Scanner scan=new Scanner(System.in); //* hepsini içine alıyor
        System.out.print("Kimya: ");
        int kimya= scan.nextInt();

        System.out.println("Fizik: ");
        int fizik= scan.nextInt();
        double ortalama=((double)f9izik+kimya)/2;
        System.out.println("ortalama = " + ortalama);

        Scanner scan=new Scanner(System.in);

        System.out.print("Doğum yiliniz: ");
        int yil= scan.nextInt();
        int yas=2023-yil;
        System.out.println("yas = " + yas);  */

        //Ali fizik dersinden 92,
        // kimya dersinden 55,
        // matematik dersinden 89 almıştır.
        //1.Ali’nin not ortalaması kaçtır?
        Scanner scan=new Scanner(System.in);
        System.out.print("fizik: ");
        double f= scan.nextDouble();
        System.out.print("matematik: ");
        double m= scan.nextDouble();
        System.out.print("kimya: ");
        double k= scan.nextDouble();
        double ort=(f+k+m)/3;
        System.out.println("ortalama = " + ort);


    }
}
