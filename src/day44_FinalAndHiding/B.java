package day44_FinalAndHiding;

public class B extends A{
    int b=10;
    {
        System.out.println("B instance metodu çalıştı");
    }
   static {
        System.out.println("B static instance metodu çalıştı");
    }


    public B(){
        //super();Gizli
        System.out.println("B constructor ı çalıştı");
    }
    void metodB() {
        System.out.println(a);

    }
//    void metodA(){  KALITIM ALDIĞI İÇİN GÖRÜNMEZ A DAN ALIYOR
//        System.out.println(a);//
//
//    }
}
