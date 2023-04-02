package day25_Summary;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class C01_Methods {
    public static void main(String[] args) {

        System.out.println("sonDeger(\"Merhaba\") = " + sonDeger("Merhaba"));//a
        Scanner scan=new Scanner(System.in);
//        System.out.println("x :");
//        int x=scan.nextInt();
//        System.out.println("y: ");
//        int y=scan.nextInt();

        int x=5;
        int y=10;
        int z=ornekMethods(x,y);
        System.out.println(z);

        int sayi1=5;
        int sayi2=10;
        //toplamları max değerin 4 katı mı kontrol edin
        System.out.println(4 * max(sayi1, sayi2) == sum(sayi1 , sayi2));//false

        String str1="Harun";
        System.out.println("ucEkle(str1) = " + ucEkle(str1));//Harun3
        //str1=ucEkle(str1)//Harun3 oldu str1
        //str1=ucEkle(str1).substring(0,3);
       // System.out.println(str1);//Har

        String str2="Harun";
        System.out.println("contain(str1,\"a\") = " + contain(str1, "a"));//true içinde a var


    }
   // public static void ornekMethods(int x,int y){//void metod oldğu için başka yerde kullanamıyoruz voidleri
        //System.out.println(x+y);
   // }
    public static int ornekMethods(int x,int y){
        System.out.println("merhaba");
        System.out.println("nasılsın");
       int z=x+y;
        //return z;
        return 'A';//A=65 old.için int bir değer
    }

    //int f(x)=2x+5;
    //x=5;
    //int y=10+f(x);

    public static char sonDeger(String str){
        char result=' ';

        for (int i = 0; i < str.length(); i++) {
            result=str.charAt(i);
        }
        return result;


    }
    public static char sonDeger2(String str){
       return str.charAt(str.length()-1);//a
        }
    public static String sonDeger3(String str){
        return str.substring(str.length()-1);//a
    }

    public static int max(int a,int b){
        if(a>b){return a;}
        return b;

    }

    public static int sum(int x,int y){
        return x+y;
    }

    public static String ucEkle(String str){
        return str+"3";
    }

    public static boolean contain(String str,String deger){

        return str.contains(deger);

    }




}


