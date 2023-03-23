package day07_Aritmetic_Operators;

public class _02Aritmetic_Operators_2 {
    public static void main(String[] args){
        //int x=10;
       // int y=4;
        //int z=x*y;
        //double z=(double)x/y;
        //int x=4;
        //int y=10;
       // double z=x%y;
       // double z=(double)x/y;
        //System.out.print(z);//4.0 int olarak 4tür.Önemli olan kalan olduğuiçin.

       // double sonuc=35+12/3%2*(3-1);
        //          35+12/3%2*2
        //          35+4%2*2
        //          35+0*2
        //          35+0
        //          35

       /* int dogumYil=1990;
        int yas=2023-dogumYil;
        int ahmetYas=yas-5;
        //Ali ile Ahmet kardeştir.Ali 1990 yılında doğmuştur.Ali,Ahmet den 5 yaş büyük old. göre Ahmet =?
        System.out.print("Ahmet yaş = "+ahmetYas);
        System.out.print("Ahmet yaş = "+(yas-5));

        //2cm yarıçapına sahip dairenin alanı ve çevresini hesaplayın(PI=3.14)
        double pi=3.14; //Her yerde değişmeyeceğinden emin olunan değişkenler büyük harfle yazılır.
        Math.PI sınıfı bize yardımcı oluyor
        double PI=Math.PI;  //math.sqrt(49)=7 karekök alıyor. Math.pow(2,3)=8 İki üzeri üç alır.
        double r=2;
        double alan=PI*r*r;
        double alan2=Math.PI*Math.pow(r,2);
        System.out.println("Alan = "+alan);
        System.out.println("Alan2 = "+alan2);

        double cevre=2*PI*r;
        System.out.println("Cevre = "+cevre);
        System.out.println("Cevre = "+(2*PI*r));*/

        //300 Fahrenheit kaç Celsius 'dur?
        //(C=(F-32)/1.8)
        //double f=300;
       // double c=(f-32)/1.8;
       // System.out.print((int)f+" Fahrenheit "+(int)c+" celciusdur");

        //32 Ceisius kaç Fahrenheit dır?
        //(C=(f-32)*1.8)
        //double f=32;
        // double f=(c*1.8)+32;
        // System.out.print((int)f+" fahrenheit "+(int)c+" celciusdur");





        //Ali fizik dersinden 92,
        // kimya dersinden 55,
        // matematik dersinden 89 almıştır.
        //1.Ali’nin not ortalaması kaçtır?

        //Alinin sınıf geçme notu 80 ve üzeri old.göre Alinin sınıfı geçti ise ekrana true ya da false yazdırın

       /* double f=92;
        double k=55;
        double m=89;
        double notOrtalama=(f+k+m)/3;
        System.out.println("notOrtalama = " + notOrtalama);
        boolean isPas=(notOrtalama>=80);
        System.out.print("Ali sınıfı geçti mi = "+isPas);
        System.out.print("Ali sınıfı geçti mi = "+notOrtalama>=80));*/

       /* Örnek: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır. Toplantıya 113 katılmıştır.
        1.Toplantı salonun toplam kapasitesi nedir?
        2.Kaç adet boş koltuk vardır ?
        3.Kaç adet sırada oturulmaktadır ?
        4. Kaç sıra tamamen boş kalmıştır.
        5.Oturulan sıralarda kaç adet boş koltuk vardır?*/

        int sira=15;
        int siraKoltukAdet=12;
        int katilimciSayisi=113;
        //1.Toplantı salonun toplam kapasitesi nedir?
        int kapasite=sira*siraKoltukAdet;
        System.out.println("kapasite = " + kapasite);
        //2.Kaç adet boş koltuk vardır ?
        int bosKoltukAdet=kapasite-katilimciSayisi;
        System.out.println("bosKoltukAdet = " + bosKoltukAdet);
        //3.Kaç adet sırada oturulmaktadır ?
        int oturulanSiraAdeti=katilimciSayisi/siraKoltukAdet+1;
        System.out.println("oturulanSiraAdeti = " + oturulanSiraAdeti);
        //4.Kaç sıra tamamen boş kalmıştır.
        int bosSiraAdeti=sira-oturulanSiraAdeti;
        System.out.println("bosSiraAdeti = " + bosSiraAdeti);
        //5.Oturulan sıralarda kaç adet boş koltuk vardır?
        int oturulanSiradakiBosKoltuk=siraKoltukAdet-(katilimciSayisi%12);
        System.out.println("oturulanSiradakiBosKoltuk = " + oturulanSiradakiBosKoltuk);


    }
}
