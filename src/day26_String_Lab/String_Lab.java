package day26_String_Lab;

public class String_Lab {


    public static void main(String[] args) {
        //Kullanıcıdan bir input alın ve girilen inputun ilk 3
        // harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
        //Merhaba Mer Ali Ali
        //String str = "aş";//Has
        //Ali Ali
        //iş iş
        //a a
        //System.out.println(ilkUcHarfGetir(str));//Has
        //System.out.println(ilkUcHarfGetir2(str));//Has

        //Kullanıcıdan bir dize sözcük alın ve her
        // boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
        // "   merhaba dünya  "   %%%merhaba%dünya%%
        String kelime = "   merhaba  dünya "; // %%merhaba%dünya
        System.out.println(boslukSilYuzdeEkle(kelime));//%%%merhaba%%dünya%

        //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını
        // döndüren bir program yazdırın.
        //Sanayagı yagı Mutluluk uluk
        //String kelime1 = "  Sanayagı";
        String kelime1 = "Sanayagı";
        String kelime2 = "Sanatyagı";
        //                012345678 tden baslasın istemiyoruz çünkü
        System.out.println(ikinciYari(kelime1));//yagı
        System.out.println(ikinciYari2(kelime1));//yagı eşit değil o yuzden +1 dedik
        System.out.println(ikinciYari3(kelime2));//yagı

        //Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve
        // yeni harfi/harfleri alan ve buna göre kelimede/dizede sadece
        // ilk bulduğu yeri değiştiren metodu yazınız.
        //(Merhaba ,a, e) Merheba (Kasaba , a, i) Kisaba
        String kelime3 = "Merhaba";
        System.out.println(ilkKelimeDegistir(kelime3, "a", "e"));//Merheba

        //trim(String str) şeklinde bir metot yazın trim gibi çalışsın
        // ve string döndürsün.  İçerisinde string in hazır metodu olan trim metodunu kullanmayın.
        //"   harun merhaba nasılsın   "
        // str.substring(start,end+1)
        // harun merhaba nasılsın
        String kelime4 = "   harun merhaba nasılsın   ";
        System.out.println(kelime4);//   harun merhaba nasılsın   ;
        System.out.println(trim(kelime4));//harun merhaba nasılsın baş ve sondaki boşluk gitti ortada kaldı

        //Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
        //Merhaba MMMeeerrrhhhaaabbbaaa Ali AAAllliii
        String kelime5 = "Merhaba";
        System.out.println(herKelimeyiUcDefaYazdir(kelime5));//MMMeeerrrhhhaaabbbaaa
        System.out.println(cokluKelimeYazdir(kelime5,3));//MMMeeerrrhhhaaabbbaaa

        //tek index  numarası alan substring metodunu yazınız
        // "Merhaba"     str.substring(3)=haba
        //  substring(String str,int index)
        String kelime6 = "Merhaba";
        //                0123456
        System.out.println(subString(kelime6, 3));//haba

        //çift index  numarası alan substring metodunu yazınız
        // "Merhaba"     str.substring(3,5)=ha
        //  subString(String str,int start, int end)
        String kelime7 = "Merhaba";
        //                0123456
        System.out.println(subString(kelime7, 3,5));//ba

        //Kullanıcıdan bir kelime ve bir karakter alın
        // ve bu kelimenin istenen karakterin kaç adet olduğunu
        // döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
        //Ankara,a 3 Edirne,e 2
        String kelime8 = "Ankara";
        System.out.println(karakterSay(kelime8, 'a'));//3

        //Kullanıcıdan bir kelime ve bir harf alın
        // kelimenizin içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız.
        //(Merhaba, a) Merhb
        String kelime9 = "Ankara";
        System.out.println(harfSil(kelime9, "a"));//Ankr


    }
    public static String ilkUcHarfGetir(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 3);
    }
    public static String ilkUcHarfGetir2(String str) {
     //substringin özelliği fazla yani 3 den az ise de olan yere kadar gider fazla dememiz önemli değil
        return str.substring(0, 3);
    }

    public static String boslukSilYuzdeEkle(String str){

        return str.replace(" ","%");
    }

    public static String ikinciYari(String str){

        return str.substring(str.length()/2);

    }
    public static String ikinciYari2(String str){
        if(str.length()%2==0){//eşit uzunluktaysa böyle değilse aşağı
            return str.substring(str.length()/2);
        }else{
            return str.substring(str.length()/2+1);
        }

        }
        public static String ikinciYari3(String str){
            //                                      (int) 5.0=5
            //                                   (int)Math.ceil(4.5)
            return str.substring((int)Math.ceil((double)str.length()/2));//Math ceil bir üst tarafa yuvarlar

    }

    public static String ilkKelimeDegistir(String str,String eski,String yeni){
        return str.replaceFirst(eski,yeni);
    }
    public static String trim(String str){
        int start=0;
        int end=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                start=i;
                break;
            }
        }
        for (int i = str.length()-1; i>=0 ; i--) {
            if(str.charAt(i)!=' '){
                end=i;
                break;
            }

        }
        return str.substring(start,end+1);

    }

    public static String herKelimeyiUcDefaYazdir(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            for (int j = 0; j < 3; j++) {
                result+=str.charAt(i);
            }
        }
        return result;
    }
    public static String cokluKelimeYazdir(String str,int adet){
        String result="";
        for(int i=0;i<str.length();i++){
            for (int j = 0; j < adet; j++) {
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static String subString(String str,int index){
        String result="";
        //        3 4 5 6    7
        for(int i=index;i<str.length();i++){
            result+=str.charAt(i);
        }
        return result;

    }

    public static String subString(String str,int start,int end){
        String result="";
        for (int i = start; i < end; i++) {
            result+=str.charAt(i);
        }
        return result;
    }

    public static int karakterSay(String str,char ch){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static int karakterSay2(String str,String c){
        str=str.toLowerCase();
        c=c.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+1).equals(c)){
                count++;
            }
        }
        return count;
    }
    public static int karakterSay3(String str,char ch) {
        String x = ch + "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase(x)) {
                count++;
            }

        }
        return count;
    }
    public static int karakterSay4(String str,String c){
        str=str.toLowerCase();
        c=c.toLowerCase();
        int startLength=str.length();
        int finalLength=str.replace(c,"").length();
        return startLength-finalLength;
    }

    public static String harfSil(String str,String target){
        return str.replace(target,"");
    }
    public static String harfSil(String str,char target){
        String target2=target+"";//replace de String kullanıldığı için burada char ı String e çevirdik
        return str.replace(target2,"");
    }
    public static String harfSil1(String str,char target){
        //Merhaba    a
        //0123456
        String result="";
        for (int i = 0; i < str.length(); i++) {
            //     a         !=a   false
            if(str.charAt(i)!=target){
                result+=str.charAt(i);//Merhb tek tek içine yazdırıyor
            }
        }
        return result;
    }

    public static String reverse(String str) {
        try {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }




}


