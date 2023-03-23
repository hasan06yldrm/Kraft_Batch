package day17_Medhods;

import java.util.Random;
import java.util.Scanner;

public class C02_Tahmin_Oyunu {
    public static void main(String[] args) {
        //Bilgisayarın tuttuğu 0 dahil 50 arası sayıyı 5 hamlede bulma.
        // Tuttuğu sayıdan düşük bir tahminse yukarı diyecek eğer yüksek ise aşağı diyecek
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int sayi=random.nextInt(50);
        //System.out.println(sayi);//bunu kapatırsak tuttuğu sayıyı vermez hemen
        int i=1;
        while(i<=5){
            System.out.println(i+".Tahmin");
            int tahmin=scan.nextInt();
            if (tahmin>sayi&&i!=5){
                System.out.println("Aşağı");
            }else if(tahmin<sayi&&i!=5){
                System.out.println("Yukarı");
            }else if(tahmin==sayi){
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if(i==6){
                System.out.println("Malesef bilemedin.Tuttuğum sayı: "+sayi);
            }






        }
























    }
}
