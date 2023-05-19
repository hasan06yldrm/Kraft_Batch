package Mentoring.Interface;
class  Developer{
    public void devApp(Computer comp){
       // System.out.println("Coding..");
        comp.code();
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
interface Computer{
    void code();
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code,compile,run:Faster");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Developer daghan=new Developer();
        //Laptop lap=new Laptop();
        //Desktop desk=new Desktop();
       // daghan.devApp(lap);
        //daghan.devApp(desk);
        Computer comp=new Desktop();
        daghan.devApp(comp);//Code,cömpile,run:Faster
        Computer comp1=new Laptop();
        daghan.devApp(comp);//code,compile,run
        Computer comp2=new Desktop();
        daghan.devApp(comp);//Code,compile,run:Faster







    }
}
