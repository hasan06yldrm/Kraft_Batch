package day08_ScannerAndOperators;

import java.util.Scanner;

public class _07_ScannerTask2 {
    public static void main(String[] args) {

        //      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //        Isminiz : Himmet
        //        Soyisminiz : Abi
        //        Yasiniz : 38
        //      Dogum Yeriniz: Kayseri
        //        Kaydiniz basariyla tamamlanmistir.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        String isim= scan.nextLine();

        System.out.println("Lütfen soyismizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas=scan.nextInt();
        scan.nextLine();

        System.out.println("Dogum yerinizi giriniz");
        String dogumYeri=scan.nextLine();

        System.out.println("Isminiz : "+isim);
        System.out.println("Soyisminiz : "+soyisim);
        System.out.println("Yasiniz : "+yas);
        System.out.println("Doğum Yeriniz : "+dogumYeri);
        System.out.println("Kaydınız başarıyla tamamlanmıştır.");

        //Kullanıcının istediğimiz veri türünde değer girişi yapmazsa kodomozda hata oluşur,execution durur.
        //Hatalı inputlara karşı nasıl tedbirler alacağımızı daha sonra görücez
        //Şimdi kullanıcı bizim talimatlarımızı kabul ediyor ve doğru input giriyor varsayıyoruz

       /* System.out.println("Isminiz : "+isim+
                    "\nSoyisminiz : "+soyisim+
        "\nYasiniz : "+yas+
        "\nDoğum Yeriniz : "+dogumYeri+
        "\nKaydınız başarıyla tamamlanmıştır.");*/










    }
}
