package day22_ClassAndObject_Memory;

public class Daire2 {

    double r;
    static double pi=3.14;//Math.PI;
    //static double pi=3.14; olsaydı obje oluşturmaya gerek
    //kalmadan bu "pi"yi başka yerde kullanabilecektik

    public double alanHesapla() {

        return Math.pow(r, 2) * Math.PI;

    }
        public static double alanHesapla2(int yariCap){

        return yariCap*yariCap*3.14;
        }

        public static double cevreHesapla2(int yariCap){
        return 2*pi*yariCap;
        }




    }











