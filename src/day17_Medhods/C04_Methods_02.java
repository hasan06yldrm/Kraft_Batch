package day17_Medhods;

import java.util.Scanner;

public class C04_Methods_02 {
    public static void main(String[] args) {

      //aritmetikOrtalama();
      //enBuyuk();
    kiloOkkaCevir();

    }



    public static void aritmetikOrtalama(){

        double x=3,y=5,z=10;
        double result=(x+y+z)/3;
        System.out.println("Ortalama: "+result);


    }
    //Bir method yazın 2 sayıdan büyük olanı versin

    public static void enBuyuk(){
        int x=10,y=20;
        int max;
        if(x>y){
            max=x;
        }else{
            max=y;
        }
        System.out.println("En büyük sayı: "+max);
    }

    //Bir method yazın ve kiloyu okka cinsinden versin.Okka=1.282 kg

    public static void kiloOkkaCevir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kilogram: ");
        double kilogram=scan.nextDouble();
        double okka=kilogram/1.282;
        System.out.println(kilogram+" kilogram "+okka+" okkadır.");

    //main de int sayi=5;
        //kupHesapla(sayi);
        //sayininKaresi(sayi);
        //isimYaz(name:"Hasan");
    }
    public static void kupHesapla(int x){
        int result=x*x*x;
        System.out.println("Sonuç: "+result);
    }
    //1 sayının karesini yazan metodu yazınız
    public static void sayininKaresi(int x){
        int result=x*x;
        System.out.println("Sonuç: "+result);
    }

    //parametre olarak isminizi alan ve sonucunda isminiz ....yazan programı yaz

    public static void isimYaz(String name){//virgül koyarak artırabiliriz
        System.out.println("İsminiz: "+name);
    }

    public static void max(int x,int y){

        int max;
        if(x>y){
            max=x;
        }else{
            max=y;
        }
        System.out.println("En büyük sayı: "+max);
    }

    //iki sayının ortalamasını veren metodu yazınız

    public static void ort(double x,int y){
        double ort=((double)x+y)/2;//(String name,int yas)olunca main de ona göre sırayla olamlı
        System.out.println(ort);
        //main de ort(x=5,y=10);



    }
}
