package day31_Arrays_1;

public class C02_Array_1 {
    public static void main(String[] args) {
       // String x="Harun";
        String[] y=new String[6];//şimdiden değer veriyoruz
        int h[]=new int[3];//aynı tip olacak önünde arkasında kullanabiliriz kapasitesi sınırlı
        int t[];//burada henüz bellek olumadı t referans new i kullandığımızda oluşuyor
        t=new int[8];

        int z[]=new int[5];
        System.out.println(z[0]);//0
        System.out.println(z[1]);//0
        System.out.println(z[2]);//0
        System.out.println(z[3]);//0
        System.out.println(z[4]);//0
        System.out.println(z[5]);//hata limit aşıldı
        z[0]=105;
        z[1]=89;
        z[2]=63;
        z[3]=56;
        z[4]=107;
        System.out.println("----kontrol----");//iş,n bitince sil hatayı bulmak için
        z[5]=77; //bunu yaparsak hata verir index 4 çünkü
        System.out.println(z[0]);//105
        System.out.println(z[1]);//89
        System.out.println(z[4]);//107
        //System.out.println(z[5]);//5 i çağırabiliriz ama hata alırız

        String[] isim=new String[4];
        //String str[];
        //str=new String[]; böyle de olur
        isim[0]="Hasan";
        isim[1]="Hamza";
        isim[2]="Büşra";
         //isim[3]="Nagehan";//hata alırız o yuzden kaldırıyoruz
        System.out.println(isim[1]);//Hamza
        System.out.println(isim[1].concat(isim[2]));//HamzaBüşra

        String isim2[]={"Hasan","Hamza","Büşra"};//ilk atamayı yapıyor
        isim2[0]="Nagehan";//değiştirebiliriz böyle
        System.out.println(isim2[0]);//Hasan
        //String[] isim2=new String[2];
        //isim2[0]="Hasan";
        //isim2[1]="Hamza";
        //isim2[2]="Büşra";


        //2 değer alan int türünde bir array oluşturun değer atayın ve toplayın ve ekrana yazdırın

        int sayilar[]=new int[2];
        sayilar[0]=89;
        sayilar[1]=105;
        int toplam=sayilar[0]+sayilar[1];
        System.out.println("Toplam= "+toplam);//194

        int[] sayilar2={89,105};//Aynı satırda olmak zorunda
        //sayilar2=new int[2];//bu da olur

        //int[] sayilar2;
        //sayilar2={89,105};bu olmaz süslü parantez de olmuyor

        int toplam2=sayilar2[0]+sayilar2[1];
        System.out.println("Toplam2= "+toplam2);//194





    }

}
