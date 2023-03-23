package day07_Aritmetic_Operators;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.print("Yarıçap : ");
        double r=scan.nextDouble();
        double PI=3.14;
        double alan=PI*r*r;
        double cevre=2*PI*r;
        System.out.println("Alan : "+alan);
        System.out.print("Çevre : "+cevre);


    }
}
