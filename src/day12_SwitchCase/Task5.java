package day12_SwitchCase;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı 1 : ");
        int a=scan.nextInt();
        System.out.print("Sayı 2 : ");
        int b=scan.nextInt();
        System.out.print("Yapmak istediğiniz işlemi giriniz (+,-,*,/) : " );
        String islem=scan.next();

        switch (islem){
            case "+":
                System.out.println("a+b");
                break;
            case "-":
                System.out.println("a-b");
                break;
            case "*":
                System.out.println("a*b");
                break;
            case "/":
                System.out.println("a/b");
                break;
            default:
                System.out.println("yanlış işlem girdiniz");
        }






    }
}
