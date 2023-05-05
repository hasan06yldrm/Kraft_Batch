package Mentoring.staticVariables_StaticBlock;
class Mobile{

    String brand;
    int price;
    static String name;

    static{
        System.out.println("in static block");
        name="Phone";
    }
    public Mobile()
    {
        brand="";
        price=200;
        System.out.println("in constractor");
        //name="Phone";yukarıda atadık her obje de çalışacağı için static blokta 1 kere çalışacak
    }

    //static ve non static değişkenler Non static metodlarda kullanılabilir
    public void show()
    {
        System.out.println((brand + " : " + price + " : " + name));
    }
    public static void show1(Mobile obj)
    {
        //static bir metodda non static variablelar kullanılamaz Mobile obj ile çözdük
        System.out.println((obj.brand + " : " + obj.price + " : " + name));
        System.out.println("in static method");
    }
}
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {

       Class.forName("Mobile");//sadece class load edilir ve sadece static block çalışır ama constractor çalışmaz

        Mobile obj1=new Mobile();//önce class load edilir sonra obje
        obj1.brand="Apple";
        obj1.price=1500;
        obj1.name="Smart Phone";

        Mobile obj2=new Mobile();//daha önce class yüklendiği için obje oluştu
        obj2.brand="Samsung";
        obj2.price=1700;
        obj2.name="Phone";

        Mobile.name="Phone";//static yaparak classın oldu objenin değil staticle ikisi de değişti name yani
        //Mobile.show1();//class a ait method class adı ile çağrılabilir  .show();çağrılmaz ama static olmadığı için
        Mobile.show1(obj1);
        obj1.show();
        obj2.show();

    }
}
