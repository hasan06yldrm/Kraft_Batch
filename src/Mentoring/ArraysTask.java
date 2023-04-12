package Mentoring;

import java.util.Scanner;

public class ArraysTask {
    public static void main(String[] args) {
        //günler arrayi oluştur konsoldan index no alıp indexi aldığınız günü yazdırın
        String[] gunler=new String[7];
        gunler[0]="Pazartesi";
        gunler[1]="Salı";
        gunler[2]="Carsamba";
        gunler[3]="Persembe";
        gunler[4]="Cuma";
        gunler[5]="Cumartesi";
        gunler[6]="Pazar";

       Scanner scan=new Scanner(System.in);
        System.out.println("Gün indexini girin: ");
        int indexNo=scan.nextInt();
        System.out.println(gunler[indexNo]);


    }




}
