package day14_NestedWhileDoWhile;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        //Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit
        //değerlerini ekrana yazdırın. (C=(F-32) / 1.8)

       /* int i=23;
        while(i<=50){
            System.out.println(i+" C "+i*1.8+32+" F ");
            i++;
        }

        System.out.println("------------------------------------------");

       /* Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini
        sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
        ekrana yazdırın. Bu ilemi kullanıcı ‘X’ e basana kadar devam ettirin.  */

      /*  Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime=scan.next();

        System.out.println("Kaç defa yazdırmak istiyorsunuz : ");
        int a = scan.nextInt();
        int i=0;
        while(i<a) {

                System.out.println(kelime);
                i++;

        }

        System.out.println("--------------------------------------------------");

        /*Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        olan tamsayıların toplamını ekrana yazdıran programı yazınız.*/

       /*Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen (0 ile 1000)arasında bir sayı giriniz : " );
        int sayi=scan.nextInt();
        int sum=0;
        int i=0;
        while(i<=sayi){
            sum+=i;
            i++;


        }
        System.out.println("sum : "+sum);

        System.out.println("-------------------------------------------------");

       // Örnek: Kullanıcıdan 2 adet sayı alın ve bunları toplayın 2 sayısının
       // toplamı 25 ise programdan çıkış işlemi gerçekleştirin. 25 değil ise
        // program kullanıcıdan iki sayı almaya devam etsin.

        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int sayi1=0;
        int sum=sayi+sayi1;

        while(sum!=25){

            System.out.print("Lütfen bir sayı giriniz : ");
            sayi=scan.nextInt();
            System.out.print("Lütfen bir sayı daha giriniz :");
            sayi1=scan.nextInt();
            sum=sayi+sayi1;

            System.out.println(sum);

        }

        System.out.println("----------------------------------------------");*/

      /*  Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
        yazınız.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 0 ile 1000 arasında bir sayı giriniz : ");
        int sayi = scan.nextInt();
        int i = 0;
        int sum = 0;
        int sum1 = 0;
        int j = 0;
        while(i<=sayi){
            if(i%2==0) {
                sum += i;


            }
            i++;
        }
            System.out.println("Çift sayı : "+sum);


        while(j<=sayi){
            if(j%2==1){
                sum1+=j;
            }
            i++;
        }
        System.out.println("Tek sayı : "+sum1);





        System.out.println("----------------------------------------");












    }
}





















