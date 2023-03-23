package Mentoring;
import java.util.Scanner;
public class _5_1_RelationalOperator {
    public static void main(String[] args){
        int a=25;// a=2; a=26;
        int b=25;

        System.out.println("a b ye eşit mi "+(a==b));//-mi demek eşittir

        System.out.println("a b den farklı mi "+(a!=b));//eşit değildir demek

        System.out.println("a b den küçüktür "+(a>b));//a b den küçüktür
        System.out.println("a b den küçüktür "+(a>=b));//a b den küçüktür

        System.out.println("a b den büyüküktür "+(a<b));//a b den büyüktür
        System.out.println("a b den büyüküktür "+(a<=b));//a b den büyüktür

        // Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak ekrana yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 3 basamaklı bir sayı giriniz : ");
        int sayi=scan.nextInt();

        /*int a=2;
        int b=5;
        int c=6;

        int result=a*(b+c);
        System.out.println(result); */

        //435 ->534 sayı olarak bulunuz

        int birler=sayi%10;//5
        System.out.println("birler = " + birler);

        int onlar=(sayi/10)%10; //43%10  3
        System.out.println("onlar = " + onlar);

        int yuzler=sayi/100;// 4
        System.out.println("yuzler = " + yuzler);

        //534 olacak
        int yeniSayi=birler*100+onlar*10+yuzler*1;
        System.out.println("yeniSayi = " + yeniSayi);

        String birlerStr = Integer.toString(birler); // değişiikenin tipine uygun dönüşüm
        String onlarStr = Integer.toString(onlar); // değişiikenin tipine uygun dönüşüm
        String yüzlerStr = Integer.toString(yuzler); // değişiikenin tipine uygun dönüşüm

        String result=birlerStr+onlarStr+yüzlerStr;
        System.out.println("result = " + result);


    }
}
