package day44_FinalAndHiding;

public class B extends A{
    int b=10;
    {
        System.out.println("B instance bloğu çalıştı");
    }
   static {
        System.out.println("B instance bloğu çalıştı");
    }


    public B(){
        //super();Gizli
        System.out.println("B constructor ı çalıştı");
    }
    void metodB() {
        System.out.println(a);
    }
}
