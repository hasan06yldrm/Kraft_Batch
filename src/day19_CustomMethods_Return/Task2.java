package day19_CustomMethods_Return;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        System.out.println("basamakBulma(123) = " + basamakBulma(123));
        System.out.println("mathPow(2,3) = " + mathPow(2,3));
        System.out.println("greatestCommonDivision(6,12) = " + greatestCommonDivision(6, 12));
        davetiye();


    }
    //Kullanıcıdan alınan sayının kaç basamaklı olduğunu bulan metodu yazınız


    public static int basamakBulma(int sayi){
        int basamakSayisi=0;
        while(sayi/10>=1){
            sayi/=10;
            basamakSayisi++;
        }

        basamakSayisi++;
        return basamakSayisi;
    }


    //Kullanıcı dan 2 sayı alın. İlk sayı taban, ikinci sayı ise üs olsun mathPow metodu oluşturun işlemler bu metodun
    //içerisinde yapılsın. (Math sınıfının pow metodunu siz yapacaksınız)
    //Math.pow(2,3)=8
    //mathPow(2,3)=8

    public static int mathPow(int taban,int kuvvet){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sayı girin : ");
        taban=scan.nextInt();
        System.out.println("Lütfen bir sayı daha girin : ");
        kuvvet=scan.nextInt();
        int result=1;
        for(int i=0;i<kuvvet;i++){
            result*=taban;
        }

        return result;



    }

    //100 ile 999 arasındaki tüm Armstrong sayılarını yazdıran bir program yazın. Sayının her
    //basamağının küplerinin toplamı sayının kendisine eşitse bu sayı Armstrong sayısı olarak
    //adlandırılır.
//      public static void main(String[] args) {
//
//
//
//    for(int i=100;i<999;i++){
//        int sayi=i;
//        int birlerBasamagi=sayi/10;
//        int onlarBasamagi=(sayi/10)%10;
//        int yuzlerBasamagi=sayi/100;
//        double armstrongSayisi=(Math.pow(birlerBasamagi,3)+Math.pow(onlarBasamagi,3)+Math.pow(yuzlerBasamagi,3));
//        if(armstrongSayisi==sayi){
//            System.out.println(armstrongSayisi);
//        }
//   }

    //Kullanıcıdan 2 sayı alın ve bu iki sayının en büyük ortak bölenini ekrana yazdırın. 1 ile 7
    //sonuc 1, 6-12(6)
    public static int greatestCommonDivision(int num1,int num2){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        num1=scan.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz : ");
        num2=scan.nextInt();
        int ebob=0;
        for(int i=1;i<=num1;i++){
            if((num1&i)==0&&num2%i==0){
                ebob=i;
            }

        }
        return ebob;

    }

    //Kullanıcıdan satır sayısı alan ve bu satır sayısına göre * (yıldızlar) lardan üçgen oluşturan metodu
    //yazınız? yildizUcgeni(3)
    //  *
    // * *
    //* * *

    public static void yildizOlusturma(int sayi){
        int yildiz;
        for(int i=1;i<=3;i++){
            for (int j = 3; j >=i; j--) {
                System.out.println(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.println(" *");
            }
            System.out.println(" ");
        }



    }

    //Konsoldan kullanıcıdan 2 sayı almanızı sağlayan bir
    //metodu çağırın. İkinci sayı 3 ün katı olan bir sayı değilse,
    //başka bir metodtan geçirin ve 3. katı olacak şekilde size
    //döndürsün. Sonra bu sayıları kabul eden başka bir
    //metotla da sayıları toplayın.





    //Düğün kartı bastıran bir program yazın.
    //Kullanıcıdan 2 adet kelime isteyen bir metodunuz olsun. Bu metot
    //kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun. Eğer
    //kullanıcı cümleleri yanlışlıkla aynı girerse. Başka bir metot çağrılsın ve
    //kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
    //istesin. Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
    //bağlayıp(concat) önünü ve arkasını yıldızlarla süsleyip versin.

    public static void davetiye(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk kelimeyi giriniz : ");
        String kelime1=scan.next();
        System.out.println("Lütfen ikinci kelimeyi giriniz : ");
        String kelime2=scan.next();
        if(kelime2.equals(kelime1)){
            System.out.println("Aynı kelimeleri girdiniz.Lütfen farklı kelimeler giriniz ");
            davetiye();
        }else{
            System.out.println("*****"+kelime1+" & "+kelime2+"*****");
        }
    }


}
