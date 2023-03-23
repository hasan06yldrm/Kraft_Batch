package day13_ForLoops;

import java.util.Scanner;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        //Faktoriyel =Girilen sayıya kadar olan sayıların çarpımı
        //3!=3*2*1
        //4!=4*3*2*1=4*3!
        //5!=5*4*3*2*1
        //0!=1
        Scanner scan=new Scanner(System.in);
        //System.out.println("Sayı :");
        //int num=scan.nextInt();
        int sayi=6;
        int faktoriyel=1;

        for(int i=1;i<=sayi;i++){
            faktoriyel*=i;
        }
        System.out.println(sayi+"! = "+faktoriyel);



    }
}
