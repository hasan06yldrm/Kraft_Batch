package day49_Exception;

import java.util.Scanner;

public class C02_Exception_2 {
    //private static int count=0;//sayiGiris() metondundan bağımsız olması için burada yaptık

    public static void main(String[] args) {
        System.out.println("kod basladi");
       try{
           System.out.println(5/0);
           //--;Bunlar yazılmaz compile derleme handle edilmez
       }catch (Exception exp){
           System.out.println("Hata");
           exp.printStackTrace();//java.lang.Arith...:/by zero void olarak getiriyor
           exp.toString();//String olarak getiriyor   /by zero kırmızı yazmadı
           exp.getMessage();//String olarak getirir   /by zero kırmızı yazmadı
       }
        System.out.println("kod devam ediyor");


        System.out.println(faktoriyel(0));//1
        //System.out.println(faktoriyel(a));//compile error run yapmadan kızarıyor hemen

        System.out.println(sayiGiris());

        System.out.println("0");
        try {

                System.out.println("1");
                System.out.println(5/0);//Exception fırlattıktan sonrakiler çalışmaz alttakiler çalışmaz 0167 yazar
                System.out.println("2");
                System.out.println("3");
                System.out.println(5/0);
                System.out.println("5");

        }catch (Exception e){
            System.out.println("6");//01236 yazar ve programdan çıkar
            try {
                System.out.println(5/0);
            }catch (Exception f){
                System.out.println("7");
            }
        }
        System.out.println("8");

        //while ve for looplar kullanmadan kullanıcıya 3 hak verin ve int değeri dogru girmez
        // ise kullanıcıya ikaz vererek programdan atın

    }
    private static int count=0;//sayiGiris metodu için kullanılmıştır.
    public static int sayiGiris(){
        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("sayi: ");
            int x=scan.nextInt();
            count=0;
            return x;
        }catch (Exception e){
            count++;
            if(count==3){
                System.out.println("Hakkınız kalmamıştır");
                count=0;
                System.exit(0);
            }
            System.out.println(3-count+" hakkınız kalmıştır,lütfen tekrar deneyiniz");
            return sayiGiris();
        }
    }
    //faktoriyel hesabı yapan bir metod yazınız...
    public static int faktoriyel(int n){

        try{
            int result=1;
            for (int i = 0; i <= n; i++) {
                result*=i;
            }
            return result;
        }catch (Exception e){
            System.out.println("Hata: "+e.toString());
            return -1;
        }
    }
}
