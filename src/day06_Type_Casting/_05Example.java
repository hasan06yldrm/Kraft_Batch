package day06_Type_Casting;

public class _05Example {
    public static void main(String[] args){
        //Ali sınıfta 7-7 halı saha maçı planlamak ve
        // oynanan maçta hakem olmak istiyor,
        // sınıfta 18 kişi var ise kaç kişi oyun dışı kalacaktır.

//        int sinifMevcudu=18;
//        int hakem=1;
//        int oyuncuSayisi=14;
//        int kalan=sinifMevcudu-oyuncuSayisi-hakem;
//        System.out.print(kalan);

        //Ali oynanan maçta 1 hakem olacak şekilde
        // okulda  7-7 halı saha maçıları planlamak istiyor
        // okul mevcudu 188 ise kaç kişi dışarıda kalır.

        int toplam=188;
        int hakem=1;
        int takimOyuncuSayisi=7;
        int kalan=toplam%(takimOyuncuSayisi*2+hakem);
        System.out.print(kalan);


    }
}
