package Mentoring;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        System.out.println("Enter your age: ");
        System.out.println(getName()+" "+getAge());



    }
    //write a method that gets the name of the user
    //and a method that gets the age of the user

    public static String getName(){
        //Scanner scan=new Scanner(System.in);
       // String name=scan.nextLine();

        return new Scanner(System.in).nextLine();
    }

    public static int getAge(){
        return new Scanner(System.in).nextInt();
    }

    public static int add(int n1,int n2){
        return n1+n2;
    }
    public static int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public static double add(double n1,int n2,int n3,int n4) {
        return n1 + n2 + n3 + n4;
    }


}
