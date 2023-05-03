package day45_FinalAndHiding_2;

public class Daire extends Sekiller{
    double yariCap;


    @Override
    public double alanHesapla() {
        return Math.PI*yariCap*yariCap;
    }
}
