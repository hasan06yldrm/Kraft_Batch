package day46_AbstractClassAndInterface.animal;

public class MyZoo {
    public static void main(String[] args) {

        //Animal animal = new Animal("asd","assss",'f',25,"medium","black");//Abstract class obje oluşmaz
        Cat cat=new Cat("Cesur","Scottish",'M',9,"Medium","Gray");
        cat.eat();
        cat.meow();
        cat.play();
        cat.setAge(-5);
        System.out.println(cat);//Invalid -5
        cat.setSize("Large");
        cat.setName("Tufan");
        System.out.println(cat);


    }
}
