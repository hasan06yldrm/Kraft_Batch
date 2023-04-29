package Mentoring;
class Human{
   private int age;
    private String name;
//ulaşmak için get+variable name
    public int getAge(){
        return age;
    }
    //set etmek için de set+variable name
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class ArrayListDemo {
    public static void main(String[] args) {
        Human obj=new Human();
//        System.out.println("obj.age = " + obj.age);//0
//        System.out.println("obj.name = " + obj.name);//null
        System.out.println("obj.getAge() = " + obj.getAge());//11
        System.out.println("obj.getName() = " + obj.getName());//Ahmet
        System.out.println(obj.getName() + " : " + obj.getAge());//Ahmet:11
        obj.setAge(30);
        obj.setName("Abdullah");
        System.out.println(obj.getName() + " : " + obj.getAge());//Abdullah:30


    }
}
