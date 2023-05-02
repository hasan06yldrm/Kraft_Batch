package day44_FinalAndHiding;

public class C extends B {
    int a=5;
    {
        System.out.println("C instance bloğu çalıştı");
    }
    {
        System.out.println("C instance bloğu çalıştı");
    }

    public C(){
        //super();Gizli var
        System.out.println("C constructor ı çalıştı");
    }
    void metodC(){
        System.out.println(this.a);//5
        System.out.println(a);//5
        System.out.println(super.a);//10
        super.metodA();
        metodB();


    }
    void metodA(){
        System.out.println(this.a);//5
        System.out.println(a);//5
        System.out.println(super.a);//10
        super.metodA();
        metodB();


    }
}
