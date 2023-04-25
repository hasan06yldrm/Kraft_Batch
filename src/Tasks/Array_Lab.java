package Tasks;

import java.util.Arrays;

public class Array_Lab {
    public static void main(String[] args){
       int[] i={3,5,6,7,8,3};
        System.out.println("arrayTumSayiToplam(i) = " + arrayTumSayiToplam(i));
        System.out.println("arrayTumCiftSayiToplam(i) = " + arrayTumCiftSayiToplam(i));
        System.out.println("arrayTumUcToplam(i) = " + arrayTumUcToplam(i));
        enBuyukVeKucukSayi(i);
        enKucukSayiTumIndex(i);//SONUCU NASIL YAZDIRACAM KONSOLA BİLEMEDİM HOCAM


    }
    //Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
     //createArray(8,15) → [8,9,10,11,12,13,14,15]



    //Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.(Arrays.sort ve
    //Arrays.fill kullanılmayacak)
    //[1,2,-8,-9] [-9,-9,-9,-9]
    public static void enKucukSayiTumIndex(int[] arr){
        //int[] newArr=new int[arr.length];
        int min=arr[0];
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            if(min<arr[i]){
                arr[i]=min;
            }
        }
        System.out.println(arr);
    }
    //Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız.
    // (Arrays.sort kullanılmayacak)
    public static void enBuyukVeKucukSayi(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("En büyük sayı "+max+" en küçük sayı "+min);
    }
    //Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
    //[2,3,3,6,5,4,3] →9
    public static int arrayTumUcToplam(int[] arr){
       int result=0;
        for(int i:arr){
            if(i==3){
                result+=i;
            }
        }
        return result;
    }
    //Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.
    public static int arrayTumCiftSayiToplam(int[] arr){
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                result+=arr[i];
            }
        }
        return result;
    }
    //Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız.
    public static int arrayTumSayiToplam(int[] arr){
        int result=0;
        for(int x:arr){
            result+=x;
        }
        return result;
    }
}
