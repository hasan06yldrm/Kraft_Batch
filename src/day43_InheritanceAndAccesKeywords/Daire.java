package day43_InheritanceAndAccesKeywords;

public class Daire extends Sekiller{

    public int alanHesapla(){
        return (int)(yariCap*pi*yariCap);

    }
    public Motorcycle metod(){
        return new Motorcycle();
    }
}
//public-protected-default-private
