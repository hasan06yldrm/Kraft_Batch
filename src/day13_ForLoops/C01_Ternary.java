package day13_ForLoops;
import java.util.Scanner;
public class C01_Ternary {

    public static void main(String[] args) {
        /*
         kullanicidan pozitif bir tamsayi alin
         sayi cift ise "sayi cift"
         degilse "tek sayi" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int num=scan.nextInt();

        if(num%2==0){
            System.out.println("Sayı çift");
        }else{
            System.out.println("Sayı tektir");
        }

        System.out.println("----------------------------------------");

        System.out.println(num%2==0? "Çift Sayi":"Tek Sayi");

        String result=(num%2==0)?"Çift Sayi":"Tek Sayi";
        System.out.println(result);




    }




}
