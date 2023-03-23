package day11_ControlFlowStatements_IF;
import java.util.Scanner;
public class C05_If_Else_Example {
    public static void main(String[] args) {
       /* System.out.print("A");
        if(true){//false ACD  true ise ABD yazacak
            System.out.print("B");
        }else{
            System.out.print("C");
        }
        System.out.print("D");*/

        //hava sıcaklığı 20 derecenin altında ise hava soğuk
        //20 ve üzerinde ise hava sıcak yazsın

       /* Scanner scan=new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz :");
        double h=scan.nextDouble();
        //int s=25;

        if(h>=20){
            System.out.println("Hava sıcak");
        }else{
            System.out.println("Hava soğuk");
        } */

        //kullanıcıdan bir tam sayı alın
        //ekrana tek mi çift mi olduğunu yazdıran proğramı yazın

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz : ");
        int a=scan.nextInt();
        //boolean result=(a%2==0);
        if (a%2==0){
            System.out.println("çift");
        }else{
            System.out.println("tek");
        }




    }
}
