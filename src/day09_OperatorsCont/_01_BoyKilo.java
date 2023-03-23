package day09_OperatorsCont;

import java.util.Scanner;

public class _01_BoyKilo {
    public static void main(String[] args) {

        //Kullanıcıdan boy(pndalıklı) ve kilosunu(ondalıklı) bilgisini alıp ekrana yek satırda yazdırınız
        //input isminde bir scanner objesi oluşturduk


        Scanner input=new Scanner(System.in);

        System.out.println("Boyunuzu giriniz (ornek 1.78): ");
        double boy=input.nextDouble();

        System.out.println("Kilonuzu giriniz (ornek 80.5) : ");
        double kilo=input.nextDouble();

        //input.nextLine();//***nextDouble sonra input.nextLine kullanmak için yani yazıyı içine alıyor yazdırmak için
        System.out.println("Lütfen isminizi giriniz");
        String isim= input.next();//ilk kelime
        input.nextLine();
        System.out.println("Soyisminizi giriniz:");
        String soyisim=input.nextLine();


        System.out.println(isim+" "+soyisim+" boyunuz : "+boy+" m kilonuz : "+kilo+" kg");

        //Scanner.next() İlk space boşluğa kadar olan değerleri alir
        //Scanner.nextLine()İlk entere kadar olan degerleri alır
























    }
}
