package day45_FinalAndHiding_2;

public class Dog extends Animal{


    public Dog(int x) {
        super(x);
    }

    @Override
    public void konus() {
        System.out.println(x);
        hareketEt();
        System.out.println("Hav hav");
        nefesAl();//borç ödendiği için sadece bu şekilde çağırabilirim metoda gerek kalmadı
    }

    @Override
    public void nefesAl() {

    }
}
