package day08_ScannerAndOperators;

import java.util.Scanner;

public class _05_Scanner {
    public static void main(String[] args) {
        //1.adım Scanner objesi oluturalım
        Scanner scan=new Scanner(System.in);

        //2. Kullanıcıyı bilgilendir.Ne istediğinizi söyleyin
        System.out.println("Lutfen isminizi giriniz");

        //3.Girilen bilgiyi içine koyabileceğiniz variable oluşturun,oluşturduğunuz değişkenin içerisine
        //,scanner objesi ile uygun methodo çağırarak veriyi alın

        String name=scan.nextLine();
        System.out.println("Girilen isim : "+name);

        scan.close();

    }
}
