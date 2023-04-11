package day27;

public class Calısma {
    public static void main(String[] args) {
        /*
    Kullanıcıdan bir kelime alın ve kin kelimesi başından veya
    ilk karakterden sonra gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    Kinlenmek true
    Kin tutmak true
    Ekin ektim true
    Keskin ilçesinden geçiyorum false
     Neden kin tutuyorsun false */
        String kelime = "Kinlenmek";
        String kontrol = "kin";//"" deneme amaçlı null hata verir kontrol edilmez
        System.out.println(ilkKelimeKontrol(kelime, kontrol));

        //Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa, uzun
        // kelimeyi ortada 30 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
        //Mehmet
        //Ali AliAliMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe hmet
        // MehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe hmetMehmetMehmetMehmet
        // MehmetMehmetMehmetMehmetMehmetMehmetMe hmetMehmetMehmetMehmetMehmetMehmetMehmet
        // MehmetMehmetMehmetMe hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
        // hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetAliAli
        System.out.println(cokluYazdir("Ahmet", "Ali", 2, 5, 3));

        //Kullanıcıdan bir kelime veya söz alın ve ilk 5
        // karakterini yazdırın. 5 karakterin altında bir kelime girdiği taktirde
        // 5 karaktere nokta ile tamamlayın.
        //Sabun Sabun Merhaba Merha Ali Ali..
        //Hey Hey..
        //Pi Pi...
        karaktereTamamla("A", 5, '.');

        //Kullanıcıdan bir kelime alın ve
        // bu kelimenin ilk 2 harfi sonunda
        // yer alıyorsa true almıyorsa false yazdırın.
        System.out.println(ilkSonIkiKelimeKontrol("araba"));//false
        System.out.println(ilkSonIkiKelimeKontrol("arar"));//true
        System.out.println(ilkSonIkiKelimeKontrol("Arar"));//true
        System.out.println(ilkSonIkiKelimeKontrol("Aa"));//true
        System.out.println(ilkSonIkiKelimeKontrol("A"));//hata
        System.out.println(ilkSonIkiKelimeKontrol(null));//false
        System.out.println(ilkSonKelimeKontrol("Ankarank", 3));//true
        System.out.println(ilkSonKelimeKontrol("Ankara", -9));

        //Kullanıcının  ad ve soyad bilgilerini
        //  Ekrana "Soy isminiz ..(soyad)" Yazan metodu yazınız.
        //İnput: "Harun Özsoy "
        //Output: "Soy isminiz Özsoy dır."
        //İnput:" Harun Kenan Özsoy " Output: "Soy isminiz Özsoy"
        //İnput: "Harun Kenan Can Özsoy " Output: "Soy isminiz Özsoy"
        //İnput:" Harun Kenan Can Sami Özsoy" Output: "Soy isminiz Özsoy"
        //Kullanıcı başına ve sonuna dilediği kadar boşluk girebilir lütfen
        // bu durumu dikkate alın. Output’u dikkatli inceleyin.
        System.out.println(soyadBelirt(" Harun Kenan Can Sami Özsoy"));
        System.out.println(sonKelimeBul("özsoy assasaa sasasas sasasasas"));

        //Kullanıcıdan bir dize sözcük alın ve yinelenen
        // her karakteri kelimenizden çıkartarak sonuç
        // döndüren metodu yazınız. (Büyük küçük duyarlı)

        //Merhaba Merhab Ananas Anas
        System.out.println(yinelenenKelimeCikart("Ananas"));//Anas
        System.out.println(yinelenenKelimeCikart("Merhaba"));//Merhb
        System.out.println(yinelenenKelimeCikart1("Ananas"));//Anas
        System.out.println(yinelenenKelimeCikart1("aaaaaaaaaaa"));//a


    }

    public static boolean ilkKelimeKontrol(String str, String target) {
        if (target == null) return false;
        str = str.toLowerCase();
        target = target.toLowerCase();//kinlenmek         kin         true
        return str.startsWith(target) || str.substring(1).startsWith(target);
    }

    public static boolean ilkKelimeKontrol2(String str, String target) {
        return str.substring(0, target.length() + 1).contains(target);
    }

    public static String cokluYazdir(String str1, String str2, int ilkDongu, int ortaDongu, int sonDongu) {
        String result = "";
        if (str1.length() < str2.length()) {
            for (int i = 0; i < ilkDongu; i++) {
                result += str1;
            }
            //result=str1+str1+str2+str2
            for (int i = 0; i < ortaDongu; i++) {
                result += str2;
            }
            for (int i = 0; i < sonDongu; i++) {
                result += str1;
            }
            //return result;


        } else {
            for (int i = 0; i < ilkDongu; i++) {
                result += str2;
            }
            //result=str1+str1+str2+str2
            for (int i = 0; i < ortaDongu; i++) {
                result += str1;
            }
            for (int i = 0; i < sonDongu; i++) {
                result += str2;
            }

        }
        return result;

    }

    //                                    Merhaba       5             .
    //                                    0123456
    public static String karaktereTamamla(String str, int number, char karakter) {

        if (str.length() >= number) {
            return str.substring(0, number);//Merha
        } else {//else yazmayabiliriz
            //   Ali      5-3  Ali..
            int count = number - str.length();

            for (int i = 0; i < count; i++) {//int i=str.length;i<number;i++ bu da oluyor
                str += karakter;
            }
            return str;
        }
    }

    public static boolean ilkSonIkiKelimeKontrol(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }
        //                                                                      7-2=5
        return str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2));
    }

    public static boolean ilkSonKelimeKontrol(String str, int karakterSayisi) {
        if (str == null || str.length() < karakterSayisi || karakterSayisi < 1) {
            return false;
        }
        //                                                                      7-2=5
        return str.substring(0, karakterSayisi).equalsIgnoreCase(str.substring(str.length() - karakterSayisi));
    }

    public static String soyadBelirt(String str) {

        if (str == null) {
            return null;
        }
        str = str.trim();
        return str.trim().substring(str.lastIndexOf(" ") + 1);
    }

    public static String sonKelimeBul(String str) {

        if (str == null) {
            return null;//return str da olabilir
        }
        str = str.trim();
        // return str.trim().substring(str.lastIndexOf(" ")+1);
        return str.substring(str.lastIndexOf(" ") + 1);
    }

    public static String yinelenenKelimeCikart(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i, i + 1))) {
                result += str.substring(i, i + 1);//i,i+1 sadece 1 karakter alır String de
            }
        }
        return result;


    }

    public static String yinelenenKelimeCikart1(String str) {
        String result = "";
        for (; str.length() > 0; ) {
            if (!result.contains(str.substring(0, 1))) {
                result += str.substring(0, 1);

            }
            str = str.replace(str.substring(0, 1), "");
        }
        return result;


    }
}
