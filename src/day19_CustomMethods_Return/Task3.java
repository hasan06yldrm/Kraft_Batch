package day19_CustomMethods_Return;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen n terimli Fibonacci dizisini yazdıran bir program yazın: 0 1 1 2 3 5
        //8 13 24
        Scanner scan=new Scanner(System.in);
        int a=1,b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<25;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c+" ");
        }





    }
}
