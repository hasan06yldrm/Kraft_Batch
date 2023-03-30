package day23_StringClass;
import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        //Konsoldan kullanıcıdan bir mesaj alın ve method onun karakter sayısını versin.
        //Aldığınız mesajın son index ini yazdırın.
        //Aldığınız mesajın her karakterini konsola alt alta yazdırın.

        nameOfCharacter();


 }
    public static void nameOfCharacter(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen mesajı girin: ");
        String str = scan.nextLine();
        System.out.println("str.length() = " + str.length());
        System.out.println("str.charAt(str.length()-1) = " + str.charAt(str.length() - 1));

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }


    }










}
