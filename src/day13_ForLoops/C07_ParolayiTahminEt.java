package day13_ForLoops;

import java.util.Scanner;

public class C07_ParolayiTahminEt {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String parola="safak";
        String tahmin="";
        int hak=3;

        System.out.println("Parolayı tahmin ediniz(Toplam 3 hakkınız var) :");

        for(int i=1;i<=3;i++){
            tahmin=scan.nextLine();
            if(tahmin.equals(parola)){
                System.out.println("Tebrikler.Parolayı bildiniz...");
                break;
            }else{
                System.out.println("Parola yanliş.Kalan tahmin hakkınız :"+(hak-i));
            }
        }






    }




}
