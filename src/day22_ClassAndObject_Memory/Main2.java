package day22_ClassAndObject_Memory;

public class Main2 {

    public static void main(String[] args) {

    Daire2 yeniDaire=new Daire2();

        System.out.println(yeniDaire.pi);
       // System.out.println(Daire2.pi);Daire2 Static olmadığı için pi kullanamayız

        System.out.println(Math.PI);//classın pi si

        System.out.println(Daire2.alanHesapla2(3));

        Daire2.alanHesapla2(5);
        System.out.println(Daire2.cevreHesapla2(7));

        Daire2 yeniDaire1=new Daire2();
        yeniDaire1.r=3;
        yeniDaire1.alanHesapla();


    }
}
