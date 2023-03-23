package day13_ForLoops;
import java.util.Scanner;
import java.util.Scanner;

public class C02_If_Switch_Ternary {
    public static void main(String[] args) {

        /* Kullanicidan bir harf isteyin
         o harfle baslayan gun ismi varsa yazdirin
         yoksa "gecersiz harf" yazdirin*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);//Scanner sınıfı ile harf alamıyoruz,scan.next() String aldık
                                        //charAt(0) bu aldığımız kelimenin ilk harfini almış olduk

        //String name="Hasan";
        //System.out.println(name);
        //System.out.println(name.charAt(0));

        if(harf=='p'|| harf=='P'){
            System.out.println("Pazar,Pazartesi,Perşembe");
        }else if(harf=='s'||harf=='S'){
            System.out.println("Salı");
        }else if(harf=='c'||harf=='C'){
            System.out.println("Carsamba,Cuma,Cumartesi");
        }else{
            System.out.println("Geçersiz harf");
        }

        System.out.println("-----------------------------------------");

        switch(harf){
            case 's','S':
                System.out.println("Salı");
                break;
            case 'c':
            case 'C':
                System.out.println("Carsamba,Cuma,Cumartesi");
                break;
            case 'p','P':
                System.out.println("Pazar,Pazartesi,Persembe");
                break;
            default:
                System.out.println("Geçersiz harf");


        }

        System.out.println("---------------------------------------");

        //String result=(harf=='p'|| harf=='P')? "Pazar,Pazartesi,Persembe" :"Yanlis";
       // System.out.println(result);

        String result=(harf=='p'|| harf=='P')? "Pazar,Pazartesi,Persembe" :(harf=='s'||harf=='S')? "Salı"
                :(harf=='c'||harf=='C')?("Carsamba,Cuma,Cumartesi"):"Geçersiz harf" ;
        System.out.println(result);


    }
}
