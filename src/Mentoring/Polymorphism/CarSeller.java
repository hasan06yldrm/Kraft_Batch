package Mentoring.Polymorphism;

public class CarSeller {
    public static void main(String[] args) {
        CarSeller obj=new CarSeller();
        obj.motor();
        obj.yakit();

        System.out.println("-----------------------");
        Honda obj1=new Honda();
        obj1.motor();
        obj1.yakit();


        System.out.println("------------------------");
        Honda obj2=new HondaBenzinli();
        obj2.motor();
        obj2.yakit();
        //obj2.yakit(6.8);çözümü altta
        ((HondaBenzinli)obj2).yakit(6.8); //böyle yaparak çözebiliriz down casting ile

        System.out.println("-------------------------");



    }
    public void motor(){
        System.out.println("motor çalışır");
    }
    public void yakit(){
        System.out.println("yakıt aldı");
    }
}
/*
Polymorphism=OverLoading ve OverRiding(Inheritance)

Polymorphism=Aynı eylemi bir çok farklı şekilde gerçekleştirmemizi sağlayan consept

parent in özelliklerini kullanır evladınkini kullanmaz
 */
