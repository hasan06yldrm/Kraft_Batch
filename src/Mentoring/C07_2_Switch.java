package Mentoring;
import java.util.Scanner;
public class C07_2_Switch {
    public static void main(String[] args) {

       /* int n=1;
        if(n==1){
            System.out.println("monday");
        }else if(n==2){
            System.out.println("tuesday");
        }else if(n==2){
            System.out.println("wednesda");
        }else if(n==2) {
            System.out.println("thursday");
        }else if(n==2) {
            System.out.println("friday");
        }else if(n==2){
            System.out.println("saturday");
        else{
                System.out.println("friday");
        }*/

        int n=5;
        switch(n){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;//gibi n değiştirdikçe gün değişiyor
            default:
                System.out.println("Enter a valid number");
        }


        System.out.println("---------------------------------------------");
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        //[23:17]
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = oku.nextInt();

        int onlar=(sayi/10)%10;//127    12    2
                                //355   35    5

        switch (onlar){
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
        }








    }
}
