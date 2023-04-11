package Mentoring;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        isimALOrtlamabul();
        System.out.println(isimALOrtlamabul1());
    }
    //isim ve fizik kimya matematik notları alsın 2 ayrı method ile
    //ve ahmet in not ortalaması 70 şeklinde döndürsün
    //isimALOrtlamabul
    //ortalamaBul

    public static void isimALOrtlamabul() {
        Scanner scan = new Scanner(System.in);
        System.out.println("isim girin :");
        String name = scan.nextLine();
        System.out.println("fizik notu girin: ");
        int fizik = scan.nextInt();
        System.out.println("kimya notu girin: ");
        int kimya = scan.nextInt();
        System.out.println("matematik notu girin: ");
        int matematik = scan.nextInt();
        System.out.println(name + " in not ortalaması " + ortalamaBul(fizik, kimya, matematik));
    }

    public static int ortalamaBul(int fizikScore, int kimyaScore, int matematikScore) {
        return (fizikScore + kimyaScore + matematikScore) / 3;
    }

    public static String isimALOrtlamabul1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("isim girin :");
        String name = scan.nextLine();
        System.out.println("fizik notu girin: ");
        int fizik = scan.nextInt();
        System.out.println("kimya notu girin: ");
        int kimya = scan.nextInt();
        System.out.println("matematik notu girin: ");
        int matematik = scan.nextInt();

        return name + " in ortalaması " + ortalamaBul(fizik, kimya, matematik);


    }


}
