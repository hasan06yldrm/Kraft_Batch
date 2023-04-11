package day28_Quiz;

import java.util.Scanner;

public class QuizAnswers {
    public static void main(String[] args) {
        System.out.println(sumUpToN(3));
        vucutKitleEndeksiHesapla(76,178);
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime bir de harf giriniz");
        String str=scan.nextLine();
        String ch=scan.nextLine();
        System.out.println(str+"'da "+frequency(str, ch)+" adet "+ch+" bulunmaktadır.");
        System.out.println(faktoriyel(4));
        System.out.println(concat("quiz", "kolaydı"));
        System.out.println(concat("quiz", "cok","kolaydı"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(equalsIgnorCase("Ahmet", "AHmet"));


//        1-)Kullanıcının girdiği sayısal bir ifadeyi alan ve 1den başlayarak girilen sayı
//        dahil toplamını veren metodu yazınız

    }
    public static int sumUpToN(int N){
       int result=0;
        for (int i = 1; i <=N ; i++) {
            result+=i;
        }
        return result;
    }

//     2-) Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
//    Aldiginiz degerleri bir metoda gondererek hesaplatin
//    vucutKitleEndeksiHesapla(kilo,boy)
//    vucut kitle endeksi = (kilo*10000 / (boy *boy))
//    vucut kitle endeksi
//    30’dan buyukse obez,
//    25-30 arasi ise kilolu,
//    20-25 arasi ise normal,
//    20’den kucukse zayif yazdirin.

    public static void vucutKitleEndeksiHesapla(int kilo,int boy){
        double vki=0;
        vki=(kilo*10000/boy*boy);
        if(vki>=30){
            System.out.println("obez");
        }else if(vki<=30&&vki>=25){
            System.out.println("kilolu");
        }else if(vki<=25&&vki>=20){
            System.out.println("normal");
        }else {
            System.out.println("zayıf");
        }
    }

//     3-) Kullanicidan bir String bir de char deger alin. Stringin icinde kac tane char
//    oldugunu donen bir metodla sayiyi hesaplatin. Stringde kac adet o harften
//    oldugunu da asagidaki formatta ekrana yazdirin. İpucu: length(),
//    frequency(String str,char ch)
//    orn:input “Merhaba”, ‘a’ Output= Merhaba ‘da 2 adet a bulunmaktadir.

    public static int frequency(String str,String ch){
         return str.length()-str.replace(ch,"").length();

    }

//    4- Girilen sayının faktoriyelini döndüren bir metot yazınız.

    public static int faktoriyel(int sayi){
       int result=1;
        for (int i = 1; i <=sayi ; i++) {
            result*=i;

        }
        return result;
    }

//     5-Concat işlemi yapan 2 adet ve 3 adet değer alacak iki farklı overloading metot yazınız.

    public static String concat(String str1,String str2){
        return str1.concat(str2);
    }
    public static String concat(String str1,String str2,String str3){
        return str1.concat(str2).concat(str3);

    }

//     6.Girilen kelimenin polindrom olup olmadığını kontrol eden bir metot yazınız.
//            (Tersi kendisine eşit


    public static boolean isPalindrome(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0; i--) {
            reverse+=str.charAt(i);
        }
        return str.equals(reverse)?true:false;
        }

        // 7.equalsIgnorecase() metodunu kullanmadan girilen 2 string türündeki değeri
//    büyük küçük harfleri baz almadan kontrol eden bir metot yazınız.

    public static boolean equalsIgnorCase(String str1,String str2) {
        return str1.toLowerCase().equals(str2.toLowerCase());
    }



}
