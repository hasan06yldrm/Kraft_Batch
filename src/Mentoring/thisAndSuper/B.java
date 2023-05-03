package Mentoring.thisAndSuper;

public class B extends A{

    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
       // super(n);
        this();
        System.out.println("İn B int");
    }

}
