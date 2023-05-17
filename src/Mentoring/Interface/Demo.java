package Mentoring.Interface;

interface A{
   //int age;hata atama yapmadık
   static final int AGE=5;//default static final değişkenlerde

    String NAME="Ali";//
    public abstract void show();//sadece decleration yapılmış
    public abstract void config();
}
/*
1.interfacelerin içinde sadece public modifier ve abstract metodlar bulunur
Gri olmasının sebebi default otomatik olarak yapar yazmaya bilirdik

Abstract classlarda hem abstract metodlar hem de normal definition i yapılmış metodlar bulunur

2.Interface class değildir

 */
interface X{
    void run();
}

class B implements A,X {//b classı concrete oldu görevlerini yaptığı için obje oluşturulabilir
    public void show(){
        System.out.println("Showing...");
    }
    public void config(){
        System.out.println("Config");
    }

    @Override
    public void run() {
        System.out.println("Running..");
    }
}



public class Demo {
    public static void main(String[] args) {
        A obj;
        obj=new B();
        obj.config();
        obj.show();
        System.out.println(B.AGE);
        X obj1=new B();
        obj1.run();
        System.out.println(A.NAME);


    }
}
/*
class to class EXTENDS
class to interface IMPLEMENT
interface to interface EXTENDS
 */
