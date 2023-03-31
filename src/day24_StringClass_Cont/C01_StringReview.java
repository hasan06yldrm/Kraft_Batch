package day24_StringClass_Cont;
import java.util.Scanner;
public class C01_StringReview {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi giriniz: ");
        String isim=scan.nextLine();

        //012345678901
        // Yavuz Selim
        //ismin son harfini al
        //length(), charAt()
        int uzunluk=isim.length();
        char sonHarf=isim.charAt(uzunluk-1);//Toplam karakter sayısından 1 çıkarıp son indeksi buluyorum
        System.out.println(sonHarf);

        //equals()
        System.out.println(isim == " Yavuz Selim ");//false farklı objeleri işaret ediyorlar
        System.out.println(isim.equals(" Yavuz Selim "));//true
        isim.equalsIgnoreCase(" yaVuz seLiM ");//true

        //toUpperCase  toLowerCase
        System.out.println(isim.toLowerCase());// yavuz selim ;
        System.out.println(isim.toUpperCase());// YAVUZ SELİM ;
        System.out.println(isim);// Yavuz Selim ;oluyor Stringler immutable değişmez olduğu için eskiye döndü

        //trim()
        System.out.println(isim.trim());//Yavuz Selim;boşluklar gitti
        System.out.println(isim);// Yavuz Selim ;boşluk geri geldi immutable


        //indexOf()
        System.out.println(isim.indexOf("S"));//7 boşlukları da sayar
        System.out.println(isim.indexOf("Selim"));//7 ilk indeksi getirir
        System.out.println(isim.indexOf(" "));//0 ilki
        System.out.println(isim.lastIndexOf(" "));//12 sondaki boşluk
        int ilkIndeks=isim.indexOf("Y");
        int lastIndeks=isim.lastIndexOf("Y");
        if(ilkIndeks==lastIndeks){
            System.out.println("Y harfi Stringde uniquetir");//Yani tektir,bir kere kullanılmış
        }
        int ilkIndeks1=isim.indexOf(" ");
        int lastIndeks1=isim.lastIndexOf(" ");
        if(ilkIndeks==lastIndeks){
            System.out.println("Stringde uniquetir");
        }else{
            System.out.println("Unique değildir");
        }


        //replace()
        System.out.println(isim.replace(" ", ""));//YavuzSelim;Boşluklar gitti
        System.out.println(isim.replace("vuz", "giz"));// Yagiz Selim ;
        String message="Merhaba";
        String message1="Merhaba";
        String message2=new String("Merhaba");
        System.out.println(message==message1);//true
        System.out.println(message==message2);//false

        System.out.println(message);//Merhaba
        System.out.println(message.replace("a", "e"));//Merhebe
        System.out.println(message.replaceFirst("a", "e"));//Merheba


    }
}
