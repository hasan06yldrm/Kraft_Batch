package day10_UnaryLogicalOperAndReview;
import java.util.Scanner;
public class _01_PositiveOrNegative {
    public static void main(String[] args){

        /*
1. Create a class called C01_Positive or Negative, and  write a program that can identify if the user entered number is
    positive, or negative or zero.

            Ex:
                number = 200

                output:
                200 is positive number:true
                200 is negative number :false
                200 is zero :false
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz : ");
        int number=scan.nextInt();//-12

        boolean isPositive=number>0;
        boolean isNegative=number<0;
        boolean isZero=number==0;
        System.out.println(number+" is positive number "+isPositive);
                  // false                -12>0
        System.out.println(number+" is negative number "+isNegative);
                 //   true                -12<0
        System.out.println(number+" is zero number "+isZero);
                //   false              -12==0





    }



}
