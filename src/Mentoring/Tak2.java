package Mentoring;
import java.util.Scanner;
public class Tak2 {
    public static void main(String[] args) {


    //        Task 2
//        Kullanıcıdan bir sayı alın
//        sayı cift sayı mı olduğunu bir boolean değişkeni ile kontrol edin

        Scanner scan=new Scanner(System.in);

        System.out.println("Çift bir sayi giriniz : ");
        int i=scan.nextInt();
        //boolean ciftMi1=(i%2==0);
        //boolean ciftMi2=!(i%2==1);
       //boolean tekMi=(i%2==1);
        //System.out.println("ciftMi = " + ciftMi1);
        //System.out.println("ciftMi = " + ciftMi2);
       //boolean tekMi1=(i%2==1);
        //System.out.println("tekMi = " + tekMi1);

       // boolean tekMi2=!(i%2==0);
       // System.out.println("tekMi2 = " + tekMi2);

        boolean tekMi3=(i%2!=0); //(1!=0)bir eşit değil 0 ---true
                                // (0!=0)---false
        System.out.println("tekMi3 = " + tekMi3);


    }
}
