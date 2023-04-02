package Tasks;

public class String_Tasks {
    public static void main(String[] args) {
       // "javayı Seviyor muyum?" ifadesindeki y harfinin sayısını veren bir program yazın

        String str="Javayı Seviyor muyum";
        System.out.println(str.length());//20
        String str1=(str.replace("y", ""));
        System.out.println(str1.length());//17
        System.out.println("Javayı Seviyor muyum içerisinde "+(str.length()-str1.length())+" tane y harfi vardır");

        // Aldığınız mesajın sesli harflerini a,e,i formatında konsola yazdırın.
        //              01234567890123456
        String message="Şampiyon Beşiktaş";
        System.out.println(message.charAt(1) + "," + message.charAt(4) + ","
                + message.charAt(6) + "," + message.charAt(10));

        //Bir method yazın dönüş tipi olsun kullanıcıdan 2 string istesin ve
        //eğer stringlerin length i eşitse girdiğiniz kelimelerin karekter
        //sayısı eşit mesajı döndürsün eğer aynı stringler gönderildiyse, bu
        //kelimeler aynı mesajı döndürsün. Kelimeler her anlamda farklı
        //ise kullanıcıyı aynı sürece sokun.(ödev)

        String a="Hamza";
        String b="Büşra";
        System.out.println(ikiKelimeGir(a, b));


        //Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini
        //isteyin cümle içinde sev köküne sahip bir kelime var ise bir
        //method what a lovely person(ne hoş bir insan) mesajı
        //döndürsün.

        String cumle="23 Nisanı cok seviyorum";
        System.out.println(sev(cumle));

        //İsminizin son 3 harfini 3 kez yazdıran bir method oluşturun.
        String isim="Hasan";
        isimSonUc(isim);

        //1-İsminizin ortadaki 3 harfini veren bir method yazın.
        String ad="Hasan";
        System.out.println(isimOrta(ad));

        //2-İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna
        //kısaltın yani fazla karakterleri atın. Ve isminizle soy adınızı
        //birleştirin
        String name="Hasan";
        String surname="Yıldırım";
        String surnameSon=(surname.replace("ı", ""));//Yldrm
        System.out.println(name.concat(" "+surnameSon));

        //3-İsminizin baş harfi soy adınızda varsa soy adınızı isminizin
        //baş harfinden arındırıp yazdıran bir method oluşturun.
        String adi="hasan";
        String soyadi="Bilgehan";
        if(arindirma(adi,soyadi)>=0){
            System.out.println("içinde var ve 2. kelimenin " + arindirma(adi, soyadi )+ " indeksinde yer alıyor");
        }else{
            System.out.println("İçinde yok");
        }
        String soyadi1=soyadi.replace("h","");
        System.out.println(adi.concat(" "+soyadi1));

        //4-İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname
        //oluşturan bir method yazın
        String isim1="Hasan";
        String soyisim="Yıldırım";
        System.out.println(nickName(isim1, soyisim));

        //5-Girilen 2 kelimeden kısa olanı uzun olanın başına ve sonuna
        //ekleyen bir method yazın
        String kelime1="Allah";
        String kelime2="Bir";
        ekleme(kelime1,kelime2);

        //6-Girilen kelimeyi tersten yazdıran bir method yazın.
        String kl="Nazan";
        String st="";
        for (int i=kl.length()-1;0<=i;i--){
            st+=kl.charAt(i);//st=st+kl.charAt(i);
        }
        System.out.println(st);

        //7-Dün akşam eve giderken onları görmüştüm. Cümlesindeki ü
        //harfinin önünde ve arkasında olan harflerden bir string üreten
        //bir method yazın



        //8-trim(String str) şeklinde bir metot yazın trim gibi çalışsın
        // ve string döndürsün.  İçerisinde string in hazır metodu olan trim metodunu kullanmayın.
        String str2="  Hasan   ";
        System.out.println(trim(str2));


    }

    public static String ikiKelimeGir(String a,String b){
        if(a.equals(b)){
            return "Bu kelimeler aynı";
        }
        if(a.length()==b.length()){
            return "girdiğiniz kelimelerin karekter sayısı eşit";
        }
        return "Kelimeler ve uzunlukları aynı değil ";
    }

    public static String sev(String str){
        if(str.contains("sev")){
            return "what a lovel person";
        }
        return "Sev kelimesi yok";

    }

    public static void isimSonUc(String isim){
        String yaz=isim.substring(isim.length()-3);
        for(int i=0;i<=2;i++){
            System.out.println(yaz);
        }
    }
    public static String isimOrta(String isim){
        return isim.substring(1,4);
    }
    public static int arindirma(String a,String b){

         return b.indexOf(a.charAt(0));
    }
    public static String nickName(String str1,String str2){
        return (str1.substring(0,3)+str2.substring(str2.length()-3));

    }

    public static void ekleme(String a,String b){
        if(a.length()>b.length()){
            System.out.println(b.concat(a.concat(b)));
        }else{
            System.out.println(a.concat(b.concat(a)));
        }
    }

    public static String trim(String str){

         if(str.contains(" ")){
             str=str.replace(" ","");
        }
        return str;
    }





    }

