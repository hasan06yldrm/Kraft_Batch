package day45_FinalAndHiding_2;

public class Main extends FinalAndHiding {
    public static void main(String[] args) {

        A a=new A();
        B b=new B();
        System.out.println(a.x);//5
        System.out.println(b.x);//10
        System.out.println(b.x);//5

        B.metod();
        System.out.println(B.y);//20
        //System.out.println(A.y);//10


        // Animal animal=new Animal(); abstract class dan obje oluşmaz

        F f=new F(5);
        System.out.println(f.doldurulmasiGerekenBirAlan);//5


    }

    //    public final void getBankaAdi(){
//        System.out.println("Bankanızın adı: "+this.bankaAdi);
//    } FİNAL old. için değişmez


    void metot1(){
        System.out.println("Baba sen büyüksün cahillik " +
                "ettim metot ismimi hemen " +
                "değiştiriyorum override mı tövbeler olsun");
    }
}
//FİNAL VARİABLES de ilk atamayı yapmadıysak ilk static blok ya da instance bloğun içi çalışır son olarak constructor çalışır ve çıkar
