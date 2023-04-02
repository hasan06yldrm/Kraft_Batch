package day25_Summary;

import java.util.Scanner;

public class String_Example {

    //length(); boşluklarıda karakter olarak kabul eder
    //Girilen String bir ifadenin uzunluğunu döndüren metodu yazınız karakter sayısını

    public static void main(String[] args) {
        String cumle = "Merhaba";
        //            0123456 index
        //            1234567 karakter sayısı
        System.out.println(uzunluk(cumle));//7 metoddan oldu
        System.out.println(cumle.length());//7

        System.out.println(harfleriKucult(cumle));//merhaba
        System.out.println(cumle.toLowerCase());//merhaba

        System.out.println(harfleriBuyult(cumle));//MERHABA
        System.out.println(cumle.toLowerCase());//MERHABA

        String kelime = "Merhaba";
        //             0123456
        System.out.println(kelime.charAt(4));//a
        System.out.println(karakterGetir(kelime, 4));//a

        String kelime2 = "Merhaba";
        String kelime3 = "dünya";
        System.out.println(kelime2.concat(kelime3));//Merhabadünya
        System.out.println(birlestir(kelime2, kelime3));//Merhabadünya
        System.out.println(birlestir2(kelime2, kelime3));//Merhabadünya

        String kelime4 = "Merhaba";
        String kelime5 = "r";
        System.out.println(kelime4.contains(kelime5));//true
        iceriyorMu(kelime4, kelime5);//true

        String kelime6 = "    Merhaba    ";
        System.out.println(kelime.trim());//Merhaba BOŞLUKSUZ
        System.out.println(boskuklariSil(kelime));//Merhaba

        String kelime7 = "    Merh   aba    ";
        System.out.println(kelime7.replace("Mer", "Har"));//Harhaba
        System.out.println(kelimeDegistir(kelime7, "Mer", "Har"));//Harhaba
        System.out.println(kelime7.replace(" ", ""));//Boşluklar gitti hepsi
        System.out.println(kelime7.replace("a ", "i"));//Merh ibi
        System.out.println(kelime7.replaceFirst("a", "i"));//Merh iba
        System.out.println(kelimeDegistirIlk(kelime7, "a", "i"));//Merh iba

        String str8 = "Merhaba";
        System.out.println(str8.indexOf("a"));//4
        System.out.println(str8.indexOf("aba"));//4
        System.out.println(str8.indexOf("abak"));//-1
        System.out.println(ilkIndexNoGetir(str8, "a"));//4

        String str9 = "Merhaba";
        String str10 = "ErMan";
        if (ikinciKelimedeVarMi(str9, str10) >= 0) {
            System.out.println("içinde var ve 2. kelimenin " + ikinciKelimedeVarMi(str9, str10) + "indeksinde yer alıyor");
        } else {
            System.out.println("2.kelimenin içerisinde yer almıyor");
        }

        String str11 = "Merhaba";
        System.out.println(str11.lastIndexOf("a"));//6
        sonIndexNoGetir(str11, "a");//6

        String str12 = "Merhaba";
        String str13 = "Merhaba";
        System.out.println(str12.equals(str13));//true
        System.out.println(esitMi(str12, str13));//true ama harflerden biri büyük olursa false olur "E" gibi
        System.out.println(esitMiBuyukKucukIhmal(str12, str13));//true
        System.out.println(str12.equalsIgnoreCase(str13));//true

        String str14 = " ";
        System.out.println(str14.isEmpty());//false
        System.out.println(str14.isBlank());//true
        //str14.length()==0;böyle yapsak true verir isEmpty çünkü tamamen boş
        //str14.replace(" ","").length()==0 isBlank true

        String str15 = "Merhaba";
        String str16 = "M";
        String str17 = "Mera";
        System.out.println(str15.startsWith(str17));//false
        System.out.println(str15.startsWith(str16));//true
        System.out.println(basliyorMu(str15, str16));//true
        System.out.println(str15.endsWith(str17));//false
        System.out.println(str15.endsWith(str16));//false
        System.out.println(bitiyorMu(str15, str16));//false a,ba,aba,haba ile biterse true

        String str18 = "Merhaba";
        System.out.println(str18.substring(1));//erhaba
        System.out.println(str18.substring(1, 3));//er
        System.out.println(indekstenItibarenYaz(str18, 1, 3));//er

        //String str19 = "Merhaba";
        //String str20 = "Merhaba";

        Scanner scan=new Scanner(System.in);
        boolean flag=true;
        while(flag){                   //(!soru6(str19,str20)){
            System.out.println("1.kelime");
            String str19=scan.nextLine();
            System.out.println("2.kelime");
            String str20=scan.nextLine();
            flag=!soru6(str19,str20);

        }

    }


//        Bir method yazın dönüş tipi olsun kullanıcıdan 2 string istesin ve
//        eğer stringlerin length i eşitse girdiğiniz kelimelerin karekter
//        sayısı eşit mesajı döndürsün eğer aynı stringler gönderildiyse, bu
//        kelimeler aynı mesajı döndürsün Kelimeler her anlamda farklı
//        ise kullanıcıyı aynı sürece sokun ..

        public static String soru5(String a,String b){
       if(a.equalsIgnoreCase(b)){
           return "kelimele aynı";
       }
        if(a.length()==b.length()){
            return "girdiğiniz kelimelerin karekter sayısı eşit";
        }
        return  "kelimeler aynı değil ve uzunlukları aynı değil";



        }

    public static boolean soru6(String a,String b){
        if(a.equalsIgnoreCase(b)){
            System.out.println("kelimele aynı");
            return true;
        }
        if(a.length()==b.length()){
            System.out.println("girdiğiniz kelimelerin karekter sayısı eşit");
            return true;
        }
        System.out.println("kelimeler aynı değil ve uzunlukları aynı değil");
        return false;



    }








    //length();
    public static int uzunluk(String str){
        return str.length();

    }
    //toLowerCase();
    public static String harfleriKucult(String str){
        return str.toLowerCase();
    }

    //toUpperCase();
    public static String harfleriBuyult(String str){
        return str.toUpperCase();
    }

    //charAt();

    //merhaba
    //0123456
    public static char karakterGetir(String str,int index){
        return str.charAt(index);
    }

    //concat();
    public static String birlestir(String a,String b){
        return a.concat(b);
    }
    public static String birlestir2(String a,String b){
        return a+b;
    }

    //contains();
    public static boolean iceriyorMu(String str,String kontrolEdilecekKelime){
        return str.contains(kontrolEdilecekKelime);
    }
    public static boolean iceriyorMu2(String str,String kontrolEdilecekKelime){
        if(str.indexOf(kontrolEdilecekKelime)<0){
            return false;
        }
        return true;
    }
    //trim(); Stringin baş ve sonundaki boşlukları siler
    public static String boskuklariSil(String str){
        return str.trim();
    }

    //replace()  benim verdiğim değerle değiştir
    public static String kelimeDegistir(String str,String eskiKelime,String yeniKelime){
        return str.replace(eskiKelime,yeniKelime);
    }
    //replaceFirst();
    public static String kelimeDegistirIlk(String str,String eskiKelime,String yeniKelime){
        return str.replaceFirst(eskiKelime,yeniKelime);
    }
    //indexOf();

    //merhaba
    //0123456
    //a4,ab4,aba4,abak-1 yani yok
    public static int ilkIndexNoGetir(String str,String kelime){
        return str.indexOf(kelime);
    }
    public static int ilkIndexNoGetir(String str,char kelime){
        return str.indexOf(kelime);
    }

    public static int ikinciKelimedeVarMi(String str1,String str2){

        return str2.indexOf(str1.trim().charAt(0));


    }
    //lastIndexOf
    //Merhaba
    //0123456
    //a 6

    public static int sonIndexNoGetir(String str,String kelime){
        return str.lastIndexOf(kelime);
    }
    public static int sonIndexNoGetir(String str,char kelime){
        return str.lastIndexOf(kelime);
    }

    //equals() String karşılaştırma ve equalsIgnoreCase() büyük küçük önemli değil

    public static boolean esitMi(String a,String b){
        return a.equals(b);
    }
    public static boolean esitMiBuyukKucukIhmal(String a,String b){
        return a.equalsIgnoreCase(b);
    }

    //==referansları kontrol eder

    //isEmpty()

    public static boolean tamamenBosMu(String str){
        return str.isEmpty();
    }
    //isBlank space diye tanımlayabiliriz
    public static boolean spaceHaricindeKarakterVarMi(String str){
        return str.isBlank();
    }

    //startsWith()
    public static boolean basliyorMu(String kelime,String kontrolEdilecekKelime){
        return kelime.startsWith(kontrolEdilecekKelime);
    }

    //endsWith()
    public static boolean bitiyorMu(String kelime,String kontrolEdilecekKelime){
        return kelime.endsWith(kontrolEdilecekKelime);
    }

    //substring(int beginIndex)
    //substring(int beginIndex,int endIndex)end dahil değil
    public static String indekstenItibarenYaz(String str,int index){
        return str.substring(index);
    }

    public static String indekstenItibarenYaz(String str,int startIndex,int endIndex){
        return str.substring(startIndex,endIndex);
    }






}
