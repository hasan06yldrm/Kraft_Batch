package day07_Aritmetic_Operators;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        double f=scan.nextDouble();
        double c=(f-32)/1.8;
        System.out.print(f+ " Fahrenheit "+(int)c+" Celciusdur.");


    }
}
