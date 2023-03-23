package day08_ScannerAndOperators;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
       /* int a=5*2+4+3-2*(1+2)+3;
        int b=1-2*(2+4)/2*(-2-1);
        System.out.println("Sonuç : "+a);
        System.out.println("Sonuç : "+b);*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Değer1 = ");
        int a=scan.nextInt();
        System.out.println("Değer2 =");
        int b=scan.nextInt();
        System.out.println("Değer3 =");
        int c=scan.nextInt();
        int sum=a+b+c;

        System.out.println(a+"+"+b+"+"+c+"+"+"="+sum);





    }
}
