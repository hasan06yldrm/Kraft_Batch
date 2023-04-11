package day30_Review;

public class C06_Hastane {
    public static void main(String[] args) {
        Doktor hekim1=new Doktor();
        System.out.println("hekim1.isim = " + hekim1.isim);
        System.out.println("hekim1.cinsiyet = " + hekim1.cinsiyet);
        System.out.println("hekim1.uzmanMi = " + hekim1.uzmanMi);
        System.out.println("hekim1.yas = " + hekim1.yas);
        hekim1.isim="Kaan";
        hekim1.soyIsim="Sarp";
        hekim1.uzmanMi=true;
        hekim1.yas=32;
        System.out.println("hekim1.isim = " + hekim1.isim);
        System.out.println("hekim1.cinsiyet = " + hekim1.cinsiyet);
        System.out.println("hekim1.uzmanMi = " + hekim1.uzmanMi);
        System.out.println("hekim1.yas = " + hekim1.yas);

        System.out.println("Doktor.fakulte = " + Doktor.fakulte);//statik değişkene class ismi ile erişilebilir
        System.out.println(hekim1.fakulte);//obje ile de static değişkenlere erişilebilir
        Doktor.fakulte="Hacettepe Tip Fakultesi";

        System.out.println(hekim1);


        Doktor hekim2=new Doktor();
        hekim2.isim="Buket";
        System.out.println("hekim2.isim = " + hekim2.isim);
        System.out.println("Doktor.fakulte = " + Doktor.fakulte);


    }
}
