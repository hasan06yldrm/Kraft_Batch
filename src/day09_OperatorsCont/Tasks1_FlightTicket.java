package day09_OperatorsCont;
import java.util.Scanner;
public class Tasks1_FlightTicket {
    public static void main(String[] args){

        /*
      create a class named FlightTicket, and declare the following
      variables:
              1. from
              2. to
              3. ticketPrice
          use concatenation to display the full info of the ticket

              ex:
                  From Ankara to Istanbul is 599TL
       */

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen nereye gitmek istediğinizi yazınız : ");
        String nereye=scan.nextLine();

        System.out.print("Lütfen bileti nereden aldığınızı yazınız : ");
        String nereden=scan.nextLine();

        System.out.print("Lütfen bilet fiyatını giriniz : ");
        int ticketPrice=scan.nextInt();

        System.out.println("From "+nereden+" to "+nereye+" is "+ticketPrice+"TL");



    }
}
