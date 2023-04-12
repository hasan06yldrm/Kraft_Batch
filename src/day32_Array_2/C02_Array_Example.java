package day32_Array_2;

import java.util.Scanner;

public class C02_Array_Example {
    public static void main(String[] args) {
        //kullanıcıdan 3 adet kelime alın ve bu 3 farklı kelimeyi array içine atalım
        String array[]=new String[3];
        Scanner scan=new Scanner(System.in);
        System.out.println("1.kelime");
        String kelime1=scan.nextLine();
        array[0]=kelime1;
        System.out.println("2.kelime");
        String kelime2=scan.nextLine();
        array[1]=kelime2;
        System.out.println("3.kelime");
        String kelime3=scan.nextLine();
        array[2]=kelime3;

        System.out.println("Girmiş olduğun kelimelerden hangi kelimeyi istiyorsun 1-2-3: ");
        int tercih=scan.nextInt();

        switch (tercih){
            case 1:
                System.out.println(array[0]);
                break;
            case 2:
                System.out.println(array[1]);
                break;
            case 3:
                System.out.println(array[2]);
                break;
            default:
                System.out.println("Hatalı giriş");
        }



    }

    //kullanıcıdan 3 adet kelime alın ve bu 3 farklı kelimeyi array içine atalım
}
