package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C10_AddNumbers {
    public static void main(String[] args) {
        /*   Kullanıcıdan devamlı sayı isteyen ve bu sayıları toplayan
        programı yazınız. Kullanıcı 0 girdiğinde programdan çıkması
        sağlanmalıdır.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int n=scan.nextInt();
        int sum=n;

        while(n!=0){
            System.out.println("Toplamasını istediğiniz sayıyı giriniz : ");
            n=scan.nextInt();
            sum+=n;
        }
        System.out.println("Toplam = "+sum);




    }
}
