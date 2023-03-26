package day19_CustomMethods_Return;

public class C03_Faktoriyel {
    public static void main(String[] args){
       // System.out.println("faktoriyelHesapla(4) = " + faktoriyelHesapla(4));
        int sonuc=faktoriyelHesapla(4);
        System.out.println("sonuc = " + sonuc);


    }
    //verdiğimiz bir sayının faktoriyelini hesaplayıp sonucu bize döndüren bir method olusturun
    /*Method olusturma asamaları
    1.public static (standart)
    2.olusturacagimiz metod bize bir sonuc dondurecekse data tipini belirtmek gerekiyor
    3.metod adi
    4.metodun parantezi() parametre olup olmayacagi ve parametre data tipleri ve isimleri parantez icine yazilir
    5.{}body ac,döndürülmesi gereken islemi yap,
    6.return keywordu ile döndürülmesi planlanan degeri döndür
     */

    public static int faktoriyelHesapla(int sayi){
        int faktoriyel=1;
        for(int i=1;i<=sayi;i++){
            faktoriyel*=i;
        }
        return faktoriyel;
    }






}
