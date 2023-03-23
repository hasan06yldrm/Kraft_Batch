package day10_UnaryLogicalOperAndReview;
import java.util.Scanner;
public class _02_EvenlyDivisible {
    public static void main(String[] args){
        /*
* 2. Create a class called C02_EvenlyDivisible,and write a program that gets an integer number from user
 check if a number is evenly divisible by 2, 3, 5

            Ex:
                number = 65;

                * Output:
                65 is divisible by 2:false
                65 is divisible by 3:false
                65 is divisible by 5:true
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter an integer number : ");
        int number=scan.nextInt();

        boolean isDivisibleBy2=number%2==0;
        boolean isDivisibleBy3=number%3==0;
        boolean isDivisibleBy5=number%5==0;

        System.out.println(number+" is divisible by 2: "+isDivisibleBy2);
        System.out.println(number+" is divisible by 3: "+isDivisibleBy3);
        System.out.println(number+" is divisible by 5: "+isDivisibleBy5);




    }
}
