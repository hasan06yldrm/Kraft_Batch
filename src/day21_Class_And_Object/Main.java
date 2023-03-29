package day21_Class_And_Object;

public class Main {

    public static void main(String[] args) {

       Person cemile=new Person();
       cemile.yas=35;
       cemile.isim="cemile";
       cemile.cinsiyet="bayan";
       cemile.tcNo="122322111";
       cemile.yilSonuOrtalama=45;

       Person cemil=new Person();
       cemil.yas=40;
       cemil.isim="cemil";
       cemil.cinsiyet="bay";
       cemil.tcNo="322322111";
       cemil.yilSonuOrtalama=80;

        System.out.println(cemile.isim);
        System.out.println(cemil.isim);
        System.out.println(cemile.cinsiyet);
        System.out.println(cemil.cinsiyet);

        System.out.println(Person.ortalama(cemile.yilSonuOrtalama));
        cemile.uyu();
        cemil.uyu();
        cemile.tumBilgileriGetir();
        cemil.tumBilgileriGetir();

        System.out.println(cemil.yas + cemile.yas);
        cemil.oyunOyna();


     /*   Daire daire1=new Daire();
        daire1.r=5;
       // daire1.alanHesapla();
        //System.out.println("daire1.cevreHesapla() = " + daire1.cevreHesapla());
       // System.out.println(daire1.r);
        Daire daire2=new Daire();
        daire2.r=20;

        daire1.alanHesapla();
        daire2.alanHesapla();  */



    }
}
