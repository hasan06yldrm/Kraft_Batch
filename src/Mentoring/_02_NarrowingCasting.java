package Mentoring;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
       /* double deger=5.8;
        int num=6;
        num=(int)deger;//veri kaybına sebep olur manuel değişim yapılır
        System.out.println("num = " + num);

        double d=3.4;
        short s=2;
        s=(short)d;
        System.out.println("s = " + s);*/

        int a=265;//265-257=9 byte -128 den +127 ye kadar toplam 257
        byte b=18;
        b=(byte)a;
        System.out.println("b = " + b);

    }
}
