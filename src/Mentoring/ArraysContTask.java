package Mentoring;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysContTask {

  /*

    Write a program that fills an array with n integers entered by the user.
    Suppose That The user can enter at least 1 number and at most 15 numbers

     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("How many elements?(Max is 15) : ");
        int n =input.nextInt();

        while (n>15|| n<=0){
            System.out.println("Invalid number, try again: ");
            n= input.nextInt();
        }

        int [] numbers=new int[n];
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);

    }

    private static void printArrayOfIntegers(int[] numbers) {
        System.out.println("The elements are : ");
        System.out.println(Arrays.toString(numbers));

    }

    private static void fillArrayOfIntegers(int[] numbers) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= input.nextInt();
        }

    }
}
