package day12_SwitchCase;

import java.util.Scanner;

public class C02_Homework {
    public static void main(String[] args) {
        ////Bir program yazın
        //// 3 tane numara kabul etsin ve büyük olanı versin.(homework)
        //// 2 veya 3 farklı yol ile çözmeye çalışın

        Scanner scan=new Scanner(System.in);
        /*System.out.println("Lütfen 3 sayı giriniz");
        System.out.print("1. sayı : ");
        int a=scan.nextInt();
        System.out.print("2.sayı : ");
        int b=scan.nextInt();
        System.out.print("3. sayı : ");
        int c=scan.nextInt();

        if ((a>b)&&(a>c)){
            System.out.print("En büyük sayı : "+a);
        }else if((b>a)&&(b>c)){
            System.out.println("En büyük sayı : "+b);
        }else if((c>a)&&(c>b)){
            System.out.println("En büyük sayı : " + c);
        }else {
            System.out.print("Büyük yok sayıların hepsi aynıdır");
        }

        int x,y,z;
        x=50;
        y=61;
        z=15;
        int first=Math.max(x,y);
        int max=Math.max(first,z);
        //System.out.println("max değer"+(Math.max(Math.max(x,y),z) ));
        System.out.println("max değer:"+max);

        if(x>=y&&x>=z){
            System.out.println(x);
        }else if(y>x&&y>=z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }*/

        //3 sayı alın sayılar birbirine eşit olan sayıyı ekrana getiren
        // (min 2 sayı eşit olmalı)
        // eşit sayı yok ise ekrana eşit sayı yoktur yazan programı yazınız
        //1,2,3  eşit sayı yok
        //1,2,2  2
        //2,2,2  2
        //2,3,2  2

        int x,y,z;
        x=60;
        y=65;
        z=70;
        if(x==y){
            System.out.println(x);
        }else if(x==z){
            System.out.println(x);
        }else if(y==z){
            System.out.println(y);
        }else{
            System.out.println("Eşit sayı yok");
        }




    }
}
