package day49_Exception;

import java.util.Scanner;

public class C01_Exception_1 {//İSTİSNA
    public static void main(String[] args) {
     /*   Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        try {
            int x=scan.nextInt();
            System.out.println(x*10);
        }catch (Exception e){
            System.out.println("Hata alındı");
        }
        System.out.println("Kod devam ediyor");
        System.out.println("Kod devam ediyor");
        System.out.println("Kod devam ediyor"); */

       // System.out.println(bolme(5, 0));//-1

     /*   String[] arr={"Harun","Mehmet","Ahmet"};
        try {
            System.out.println(arr[5]);//ArrayIndexOutOfBoundsException hatası çünkü 3 isim var try ile görmezden gelindi
        }catch (Exception e){
            System.out.println("Hata: "+e.getMessage());//Hata: Index 5 out of bounds for length 3 hata veriyor ama kod devam ediyor normalde etmez çıkar
        }
        System.out.println("kod devam ediyor"); */

       // System.out.println(sayiGir());//5 yapınca koddan çıkar sayı olunca int değerini aşan sayıyı kabul etmez

        Scanner scan=new Scanner(System.in);
        System.out.println("Kod başladı");
        try {
            int x=5/0;//  / by zero hatası var burada ama kod devam etti
        }catch (Exception e){
            System.out.println("Hata: "+e.getMessage());
            System.out.println("Kararınız nedir?(1 işleme devam, 2 programı sonlandır)");
            int karar=scan.nextInt();
            if(karar!=1){
                System.exit(0);
            }
        }
        System.out.println("kod devam ediyor");
    }

    public static int bolme(int sayi,int bolen){
//        if (bolen == 0) {
//            return -1;
//        }
        try {
            return sayi/bolen;
        }catch (Exception e){
            System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
            return -1;
        }

    }
    public static int sayiGir() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("sayi: ");  BURADA DA KULLANABİLİRİZ TRY İÇİNDE DE.
//        int sayi;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("sayi: ");
            int sayi;
            sayi = scan.nextInt();
            return sayi;
        } catch (Exception e) {
            System.out.println("Hatalı giriş tekrar deneyin");
            System.out.println(e.toString());
            return sayiGir();
        }
    }
}
