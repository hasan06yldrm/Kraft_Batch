package day13_ForLoops;
import java.util.Scanner;
public class Task6 {public static void main(String[] args){
    //Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
    //girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
    //olan tamsayıların toplamını ekrana yazdıran programı yazınız.

    Scanner scan=new Scanner(System.in);
    System.out.print("Lütfen 0-1000 arasında bir sayı giriniz : ");
    int sayi=scan.nextInt();
    int a=0;
    for(int i=0;i<=sayi;i++){
        a+=i;
    }
    System.out.println("Sayı : "+a);



}
}
