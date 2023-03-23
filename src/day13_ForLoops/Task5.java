package day13_ForLoops;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String k=scan.nextLine();
        System.out.print("Kaç defa yazdırmak istiyorsunuz?");
        int a=scan.nextInt();

        for(int i=1;i<=a;i++){
            System.out.println(k);
        }




    }
}
