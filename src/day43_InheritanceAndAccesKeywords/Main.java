package day43_InheritanceAndAccesKeywords;

public class Main {
    public static void main(String[] args) {
        Parent harun=new Parent();
        Child aslan=new Child("harun");
        System.out.println(aslan.parentName);//harun
        System.out.println(Child.x);

        Vehicle vehicle=new Vehicle();
        Automobile automobile=new Automobile();
        Motorcycle motorcycle=new Motorcycle();
        vehicle.start();//Araç çalıştı
        motorcycle.start();//Motor çalıştı

        Sekiller sekil=new Sekiller();
       // sekil.alanHesapla();//Alan hesaplanıyor
        Daire daire=new Daire();
        daire.yariCap=2;
        System.out.println(daire.alanHesapla());//12
        Kare kare=new Kare();
        kare.kenarUzunlugu=5;
        System.out.println(kare.alanHesapla());//25

        Motorcycle motorcycle1=Motorcycle.motorsikletOlustur();

    }
}
