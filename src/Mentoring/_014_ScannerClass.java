package Mentoring;
import java.util.Scanner;
public class _014_ScannerClass {
    public static void main(String[] args) {

        int num=6;
        System.out.println(num);
        System.err.println("Hata");

        Scanner scan=new Scanner(System.in);



        System.out.println("Adınızı giriniz : ");
        String name=scan.nextLine();
        System.out.println("Adı "+ name+" miş.");


        System.out.println("Bir sayı giriniz :");
        int num1= scan.nextInt();
        System.out.println("num1 = " + (num1+5));
        System.out.println(num1+5);
        num1+=5;
        System.out.println("num1 = " + num1);


        System.out.println("Boyunuzu giriniz :");
        float boy=scan.nextFloat();
        System.out.println("boy = " + boy);

        System.out.println("Boyunuzu giriniz :");
        double boy1= scan.nextDouble();
        System.out.println("boy1 = " + boy1);
        scan.nextLine();

        System.out.println("Soyisim :");
        String soyIsim=scan.nextLine();

        System.out.println("başarılı sekilde veriler girildi");


    }
}
