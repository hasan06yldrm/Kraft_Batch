package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C07_ParolayiTahminEt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String parola="safak";
        String tahmin="";
        int hak=3;
        System.out.println("Parolayı tahmin ediniz toplam 3 hakkınız var");

        while(0<hak){
            tahmin=scan.nextLine();
            if(tahmin.equals(parola)){
                System.out.println("Tebrikler,parolayı bildiniz");
                break;
            }else{
                System.out.println("Parola yanlış.Kalan tahmin hakkınız : "+(--hak));
            }
        }



    }
}
