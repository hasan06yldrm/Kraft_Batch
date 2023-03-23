package day12_SwitchCase;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi=scan.nextInt();

        int asilSayi=35;
        if((asilSayi/2)>sayi){
            System.out.println("Çok yaklaştınız biraz çıkmalısınız");
        }else if(sayi<asilSayi){
            System.out.println("Daha çok çıkmalısınız");
        }else if (sayi>(asilSayi*2)){
            System.out.println("Çok yaklaştınız biraz inmelisiniz");
        }else if(sayi>asilSayi){
            System.out.println("Daha çok inmelisiniz");
        }




    }
}
