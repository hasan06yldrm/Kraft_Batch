package day09_OperatorsCont;
import java.util.Scanner;
public class Tasks2_PhoneNumber {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.print("Please enter your country code : ");
        int countryCode=scan.nextInt();

        System.out.print("Please enter your area code : ");
        int areaCode=scan.nextInt();

        System.out.print("Please your local number : ");
        int localNumber=scan.nextInt();

        System.out.println("Your phone number is "+"+("+countryCode+")"+areaCode+"-"+localNumber);







    }
}
