package day10_UnaryLogicalOperAndReview;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Please your name :");
        String name=scan.nextLine();

        System.out.print("Please your age : ");
        byte age =scan.nextByte();

        boolean isEligibleToBuyCigarettes=age>=21;

        System.out.print(name+" is eligible to buy cigarettes : "+isEligibleToBuyCigarettes);

        /*
       1. Get name and age from the user, declare a variable (byte) age, write a program that can check if the
       person is eligible to buy Cigarettes. In USA it is illegal to sell tabacco under age 21.
       print console : Ahmet is eligible to buy cigarettes: true/false
        */





    }
}
