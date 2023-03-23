package day10_UnaryLogicalOperAndReview;
import java.util.Scanner;
public class _03_SwapVariables {
    public static void main(String[] args) {
     /*   1. write a program that can swipe two variables' value by using a temporary variable from users

        Ex:
        if a= 10, b=15

        output:
        a = 15
        b = 10 */
        Scanner scan=new Scanner(System.in);
        System.out.println("a sayisi için bir tam sayi giriniz : ");
        int a= scan.nextInt();//30

        System.out.println("b sayisi için bir tam sayi giriniz : ");
        int b= scan.nextInt();//15

        System.out.println("a = " + a);//a=30
        System.out.println("b = " + b);//b=15

       // a=b;//15
        //b=a;//15



        int temp=a;//30
        a=b;//a=15
        b=temp;//b=30

        System.out.println("a = " + a);//a=15
        System.out.println("b = " + b);//b=30


    }
}
