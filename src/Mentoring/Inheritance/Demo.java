package Mentoring.Inheritance;
class Calc{  //parent-super-base
    public int add(int a,int b){
        return a+b;
    }
    public int sum(int a,int b){
        return a-b;
    }
}
class AdvCalc extends Calc{ //child-sub-derived
    public int multi(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    //single level inheritence baba oğul ilişkisi çocuk sayısı önemli değil
    //multi level inheritance dede baba torun ilişkisi
    //multiple inheritance birden fazla baba java kabul etmez
}

class SciCalc extends AdvCalc{
    public double power(int a,int b){
        return Math.pow(a,b);
    }
}

public class Demo {
    public static void main(String[] args) {
        AdvCalc obj=new AdvCalc();
        SciCalc obj1=new SciCalc();
        Calc calc=new Calc();
        int r1=calc.add(4,5);
        int r2=calc.sum(8,3);
        int r3=obj.multi(4,2);
        int r4=obj.div(15,3);
        double r5=obj1.power(4,2);
        System.out.println((r1 + " : " + r2+" : "+r3+" : "+r4+" : "+r5));//9 : 5 :8 : 5


    }
}
