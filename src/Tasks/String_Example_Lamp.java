package Tasks;

import java.util.Scanner;

public class String_Example_Lamp {
    public static void main(String[] args) {

        //System.out.println(ilkUcHarf("Hasan"));
        // System.out.println(ilkUcHarf("iş"));

        //System.out.println(ekleModulus("Yaz ayları çok güzeldir.", "%"));

        //System.out.println(ikinciYariyiYazdir("Karnıbahar"));
        //System.out.println(ikinciYariyiYazdir("Beşiktaşk"));

        //System.out.println(ilkBulduguYer("Ankara", "a", "e"));

        //System.out.println(herHarfiUc("Asus"));

        //System.out.println(kacAdet("Ankara", 'a'));

        //System.out.println(harfleriKaldir("Ankara","a"));

        //System.out.println(basVeIlkKarakterdeSonra("Ekin ektim", "kin"));
        //System.out.println(basVeIlkKarakterdeSonra("kin tutmak", "kin"));

        //System.out.println(kisaUzunDongu("Bjk", "Beşiktaş"));

        // System.out.println(besAltiniTamamla("As", 5,'.'));

        //System.out.println(ilkIkiHarfSonda("salsa"));


//        System.out.println(soyadYaz("Harun Kenan Can Sami Özsoy"));

        System.out.println(yinelenenleriCikar("Ankara"));

        //System.out.println(yinelenenKelimeleriVer("Ankara bizim başkentimizdir"));

        unluUnsuz("Ha");

        //System.out.println(basiSonaEkle("Adıyaman"));

        // System.out.println(sonuBasaEkle("Ankara"));

        //System.out.println(benzersizHarf("Merhaba"));

        //System.out.println(ikiKelimeAynimi("Nefes", "Enfes"));

        // System.out.println(ardiArdinaTekrarEden(" aabccccseeeeeefff"));

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Lütfen bir kelime giriniz (1-4 harf arası): " );
//        String kelime1= scan.nextLine();
//        System.out.println("Lütfen diğer kelimeyi girin: ");
//        String kelime2= scan.nextLine();
//        System.out.println(concatSonda(kelime1, kelime2));
//        System.out.println(kelimeKontrol());

        // System.out.println(benzersizHarf2("Merhaba"));

        //System.out.println(palindrome("talat"));
        // System.out.println(palindrome2("nalan"));

        //System.out.println(input("Sevmek veya Sevmemek", "Sev"));


        //System.out.println(aynilarMi("Ankara Bursa kadar yeşil değil. Bursa bir başka.", "Ankara", "Bursa"));
        //System.out.println(sonuAcak(" Zamlanacak", "acak"));


    }

    //   Soru1: Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 kelimeden az
//    ise inputu döndüren bir metot yazınız.
//    Merhaba Mer
//    Ali Ali
    public static String ilkUcHarf(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        }
        return str;
    }

    //   Soru2 : Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
//    Merhaba dünya Merhaba%dünya
    public static String ekleModulus(String str, String ch) {
        return str.replace(" ", ch);
    }

    //   Soru3 : Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
//    yazdırın.
//    Sanayagı yagı
//    Mutluluk uluk
    public static String ikinciYariyiYazdir(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(str.length() / 2);
        } else {
            return str.substring(str.length() / 2 + 1);
        }
    }

    //    Soru4 :Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
//    alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
//yazınız.
//        (Merhaba ,a, e) Merheba
//            (Kasaba , a, i) Kisaba
    public static String ilkBulduguYer(String str, String eski, String yeni) {
        return str.replaceFirst(eski, yeni);
    }

    //    Soru5 :Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
//    Merhaba MMMeeerrrhhhaaabbbaaa
//    Ali AAAllliii
    public static String herHarfiUc(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    //    Soru6 :Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
//    kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
//    edilecek)
//    Ankara,a 3
//    Edirne,e 2
    public static int kacAdet(String str, char ch) {   //YAPAMADIM SİZİN CEVABA BAKTIM
        int result = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                result++;
            }
        }
        return result;
    }

    //    Soru7 :Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
//    kaldırılmış şekilde string döndüren programı yazınız.
//            (Merhaba, a) Merhb
    public static String harfleriKaldir(String str, String ch) {
        return str.replace(ch, "");
    }


    /*Soru 8:Kullanıcıdan bir kelime alın ve kin kelimesi başından veya
    ilk karakterden sonra gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    Kinlenmek true
    Kin tutmak true
    Ekin ektim true
    Keskin ilçesinden geçiyorum false
    Neden kin tutuyorsun false */
    public static boolean basVeIlkKarakterdeSonra(String str, String target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith(target) || str.substring(1).startsWith(target)) {
                return true;
            }
        }
        return false;
    }

    //Soru 9:Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa, uzun
    // kelimeyi ortada 30 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    //Mehmet
    //Ali AliAliMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe hmet
    // MehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe hmetMehmetMehmetMehmet
    // MehmetMehmetMehmetMehmetMehmetMehmetMe hmetMehmetMehmetMehmetMehmetMehmetMehmet
    // MehmetMehmetMehmetMe hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
    // hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetAliAli
    public static String kisaUzunDongu(String str1, String str2) {
        String result = "";
        if (str1.length() < str2.length()) {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 2; j++) {
                    result += str1;
                }
                for (int j = 0; j < 1; j++) {
                    for (int k = 0; k < 6; k++) {
                        result += str2;
                    }
                    for (int l = 0; l < 1; l++) {
                        for (int m = 0; m < 2; m++) {
                            result += str1;
                        }
                    }
                }
            }
        } else {
            if (str2.length() < str1.length()) {
                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j < 2; j++) {
                        result += str2;
                    }
                    for (int j = 0; j < 1; j++) {
                        for (int k = 0; k < 6; k++) {
                            result += str1;
                        }
                        for (int l = 0; l < 1; l++) {
                            for (int m = 0; m < 2; m++) {
                                result += str2;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    //Soru 10:Kullanıcıdan bir kelime veya söz alın ve ilk 5
    // karakterini yazdırın. 5 karakterin altında bir kelime girdiği taktirde
    // 5 karaktere nokta ile tamamlayın.
    //Sabun Sabun Merhaba Merha Ali Ali..
    //Hey Hey..
    //Pi Pi...
    public static String besAltiniTamamla(String str, int num, char ch) { //SİZİN CEVABA BAKTIM

        if (str.length() >= num) {
            return str.substring(0, num);
        }
        int count = num - str.length();
        for (int i = 0; i < count; i++) {
            str += ch;
        }
        return str;
    }

    //    Soru11 :Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
//    almıyorsa false yazdırın.
//    Ankara false
//    Kafka true
//    Salsa true
//    Saksı false
    public static boolean ilkIkiHarfSonda(String str) {
        if (str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }

    //   Soru12 : Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
//    Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.
//            İnput: "Harun Özsoy "
//    Output: "Soy isminiz Özsoy dır."
//    İnput:" Harun Kenan Özsoy "
//    Output: "Soy isminiz Özsoy dır."
//    İnput: "Harun Kenan Can Özsoy "
//    Output: "Soy isminiz Özsoy dır."
//    İnput:" Harun Kenan Can Sami Özsoy"
//    Output: "Soy isminiz Özsoy dır."
    public static String soyadYaz(String str) {
        return str.substring(str.lastIndexOf(" ") + 1);
    }

    //   Soru13 : Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
//    çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
//    Merhaba Merhab
//    Ananas Anas
    public static String yinelenenleriCikar(String str) {  //cevaba baktım
        String result = "";
        for (; str.length() > 0; ) {
            if (!result.contains(str.substring(0, 1))) {
                result += str.substring(0, 1);

            }
            str = str.replace(str.substring(0, 1), "");
        }
        return str;
    }

    //    Soru 14:Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
//    olarak return eden methot yazınız.
//" Java " output:a
//" Javva " output:av
//" Derslerime cok calisiyorum" output:erslimco
    public static String yinelenenKelimeleriVer(String str) {
        String ch = "";
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.contains(ch)) {
                str = str.replace(ch, "");
                ch += str.charAt(i);

                count++;
            }

        }
        return ch;
    }
    //    Soru 15: Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
//    ayrı ayrı ekrana yazan programı yazınız.
//    Ankara ünlü harfler=Aa
//    Ünsüz harfler=nkr
    public static void unluUnsuz(String str) {

        String unlu = "a,e,ı,i,o,ö,u,ü";
        for (int i = 0; i < str.length(); i++) {

        }

    }

    //   Soru 16: Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
//    harfini kelimeden keserek sonuna ekleyin.
//            Merhaba habaMer
//    Ali Ali
    public static String basiSonaEkle(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.length() >= 3) {
                //                   beşiktaş
                //                   01234567
                str.replace(str.substring(0, 3), "");
                result = str.substring(0, 3);
                str = str.replace(str.substring(0, 3), "").concat(result);
                break;
            }
        }
        return str;
    }

    //   Soru 17: Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
//    harfini kelimeden keserek kelimenin başına ekleyin.
//    Merhaba abaMerh
//    Ali Ali
    public static String sonuBasaEkle(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.length() >= 3) {
                //                   beşiktaş
                //                   01234567
                str.replace(str.substring(str.length() - 3), "");
                result = str.substring(str.length() - 3);
                str =str.replace(str.substring(str.length() - 3), "");
                str=result.concat(str);
                break;

            }
        }
        return str;
    }

//    Soru 18:Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
//    küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
//    ikazı versin.
//    Merhaba M
//    Araba r
//    Karkas rotası o
    public static String benzersizHarf(String str){
       String ch="";
       str=str.toLowerCase();
       for (int i = 0; i <str.length() ; i++) {
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                ch+=str.charAt(i);
            }else{
                str=str.replace(str.substring(i,i+1),"");
            }
       }
        return " Benzersiz harf yoktur";
    }

//   Soru 19: Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
//eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
//            yazdırın. (anagram kelime ise)
//    İftar – Tarif true
//    Zehra – Ezhar true
//    Nefes – Enfes true
//    Selcuk-Elyase false                  NOT:MENTORİNG DERSİNDE YAPTIK
public static boolean ikiKelimeAynimi(String str1, String str2) {
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    if (str1.length() != str2.length()) {
        return false;
    }

    for (int i = 0; i < str1.length(); i++) {
        int index = str2.indexOf(str1.charAt(i));

        if (index == -1) {
            return false;
        }
        str2 = str2.substring(0, index) + str2.substring(index + 1);
    }
    if (str1.length() != str2.length()) {
        return false;
    }
    return true;
}

//   Soru 20: Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
//    yazın.
//            aabccccseeeeeefff acef
//    abaccb c
//    Arsız ardı ardına tekrar eden harf yoktur
//    amannsız n
    public static String ardiArdinaTekrarEden(String str){
        String ch="";
        //int count=0;
        for(int i=0;i<str.length();i++) {
            if (ch.contains(str.substring(i,i+1))){
                ch+=str.substring(i,i+1);
            }
            str=str.replace(str.substring(i,i+1),"");
        }
        return ch;
    }

//   Soru 21: Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
//    girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
//    Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
//    giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
//    birleştirerek yazdırın.
//    Slm
//            Ali
//    Slm Ali
//public static String kelimeKontrol() {
//    Scanner scan = new Scanner(System.in);
//    String kelime1 = "";
//    String kelime2 = "";
//    System.out.println("Lütfen 1 ila 4 karakterden oluşan 2 kelime girin");
//    int i = 0;
//    while (true) {
//        System.out.println("1.kelime: ");
//        String kelime1 = scan.nextLine();
//        if(kelime1.length()>0&&kelime1.length()<5) {
//            break;
//        }
//            System.out.println("Hatalı giriş lütfen tekrar deneyin");
//            i++;
//            if(i==3) return null;
//    }
//     i = 0;
//    while (true) {
//        System.out.println("2.kelime: ");
//        String kelime2 = scan.nextLine();
//        if(kelime2.length()>0&&kelime2.length()<5) {
//            break;
//        }
//        System.out.println("Hatalı giriş lütfen tekrar deneyin");
//        i++;
//        if(i==3) return null;
//    }
//    return kelime1.concat(" ").concat(kelime2);
//    }

//   Soru 22: Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
//    küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
//    ikazı versin.
//    Merhaba M
//    Araba r
//    Karkas rotası o
    public static String benzersizHarf2(String str){
        String ch="";
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                ch += str.charAt(i);
            }else{
                str=str.replace(str.substring(i,i+1),"");
            }
        }
        return ch +" Benzersiz harf yoktur";
    }

//  Soru 23:  Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
//true değil ise false döndüren metot yazınız.
//            Kabak true
//    Nalan true
//    Ara true
//    talat true
//    Kasaba false
//    ahmet false
    public static boolean palindrome(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
            if(str.equals(result)){
                return true;
            }

        }
        return false;
    }

//  Soru 24:  Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
//true değil ise false döndüren metot yazınız.
//            Kabak true
//    Nalan true
//    Ara true
//    talat true
//    Kasaba false
//    ahmet false
    public static boolean palindrome2(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
            if(str.equals(result)){
                return true;
            }
        }
        return false;
    }

//   Soru 25: Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
//    ekrana yazdırın.
//    Seni seviyorum 1
//    Sevmek veya sevmemek 2
//    Sev seni seveni , sevmek güzeldir. 3
//    public static int input(String str,String target){
//
//        int result;
//        String ch="";
//        for (int i = 0; i < str.length(); i++) {
//            if(str.contains(ch)){
//                result+=ch;
//            }
//        }
//        return result ;
//    }

//   Soru 26: Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı
//    sayılarda dönüyorsa false yazdıran metodu yazınız.
//    Ankara ile Bursa arası 500 km. True
//    Ankara Bursa kadar yeşil değil. Bursa bir başka. False
//    İstanbul çok uzak false                                   NOT=MENTORİNG DE ÇÖZDÜK
    public static boolean aynilarMi(String str,String bak1,String bak2){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.toLowerCase().contains(bak1.toLowerCase())){
                str=str.replace(bak1,"");
                count++;
            }else if(str.toLowerCase().contains(bak2.toLowerCase())){
                str=str.replace(bak2,"");
                count++;
            }else{
                if(bak1==bak2&&count!=0){
                    return true;
                }
            }
        }
         return false;
    }

    //   Soru 27: Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
//    döndüren metodu yazdırın.
//            Kullanacak true
//    Zamlanacak true
//    Farkındalık false
//    Farkında false
    public static boolean sonuAcak(String str,String target){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(str.length()-4).equals(target)){
                return true;
            }
        }
        return false;
    }

//   Soru 28: Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
//    yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
//    Merhaba 1m1e1r1h2a1b
//    Seni seviyorum 2s2e1n2i1v1y1o1r1u1m



//  Soru 29:  Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
//    Merhaba a
//    aaaaaaabbcccc a
//    eeemmmsssssssssshhhhhhhhhsss s

   // contain() kullanmadan contain metodunu yazınız? (2 kelime alan ve 2.kelimenin ilk kelimenin içinde olup olmadığını kontrol eden)

    //Girilen bir sayının Binary olup olmadığını bulan bir metot yazın. 110 true  112 false

    //girilen 2 adet sayının EBOB'unu bulan bir metot yazınız (en büyük ortak bölen)

   // girilen 2 adet sayının EKOK'unu bulan bir metot yazınız (en küçük ortak kat)

    //isEmpty() metodunu kullanmadan girilen bir değerin boş (null değil) olup olmaduğunu kontrol eden bir motot yazınız?




}









