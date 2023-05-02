package day44_FinalAndHiding;

public class A {
    int a=20;
    static{//ilk önce static gider sonra normal işlemlere geçer static e bir daha gitmez Önce bütün static lere tek tek gider
        System.out.println("A instance bloğu çalıştı");
    } {
        System.out.println("A instance bloğu çalıştı");
    }

    public A(){
        //super();gizli
        System.out.println("A constructor ı çalıştı");
    }
    void metodA(){
        System.out.println(a);
    }
}
