package day12_SwitchCase;
import java.util.Scanner;
public class C03_IF_Else_Example {
    public static void main(String[] args) {
        //+,-,,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        System.out.print("1.Sayı : ");
        double x=scan.nextDouble();
        System.out.print("2.Sayı : ");
        double y=scan.nextDouble();
        System.out.print("Lütfen işlem seçiniz (+,-,*,/)");
        String islem=scan.nextLine();

        //double sonuc=0;

        if(islem.equals("+")){
            System.out.println(x+y);
        }else if(islem.equals("-")){
            System.out.println(x-y);
        }else if(islem.equals(x*y)){
            System.out.println("*");
        }else if(islem.equals("/")){
            System.out.println("/");
        }else{
            System.out.println("Hatalı işlem");
        }











    }
}
