package Mentoring;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        //task 4
        //Kullanıcıdan 2 int değeişken  alınız ve
        //sayıların farklarının tek olduğunu
        //kontrol eden bir boolean değiken tanımlayınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 2 sayi giriniz : ");
        int a=scan.nextInt();
        int b=scan.nextInt();

        boolean tekMi=(a-b)%2==1;//2>0 yazsak
        System.out.println("tekMi = " + tekMi);


    }
}
