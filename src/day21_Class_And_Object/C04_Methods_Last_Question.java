package day21_Class_And_Object;

import java.util.Scanner;

public class C04_Methods_Last_Question {
    //Konsoldan
    //kullanıcıdan 2 sayı almanızı sağlayan bir
    // metodu çağırı n İkinci sayı 3 ün katı olan bir sayı değilse,
    //başka bir metodtan geçirin ve 3 katı olacak ş ekilde size
    // döndürsün Sonra bu sayıları kabul eden başka bir
    //metotla da sayıları toplayın

    public static void main(String[] args) {
        sayiAl();

    }
    public static void sayiAl(){
        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayi: ");
        int sayi1=scan.nextInt();
        System.out.println("2.sayi: ");
        int sayi2=scan.nextInt();
        int sayi3= ucunKati(sayi2);
        System.out.println(sayilariTopla( sayi1,sayi3));

        System.out.println(sayilariTopla( sayi1,ucunKati(sayi2)));


    }

    private static int sayilariTopla(int x, int y) {

        return x+y;
    }

    private static int ucunKati(int sayi2) {
        if(sayi2%3==0){
            return sayi2;
        }
        sayi2=sayi2-sayi2%3;//return sayi2-sayi2%3; bu da olur
        return sayi2;
    }


}
