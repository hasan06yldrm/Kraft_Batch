package Mentoring.Abstracttion;
abstract class Car { //Concrete Class

    //public abstract void drive;//decleration
    public abstract void charge();
    public void playMusic() {
        System.out.println("Playing Music");
    }
}



                                        //Concrete ---İnşaa etmek obje oluşturduğumuz classlar
    abstract class Honda extends Car{ //Concrete Class to Abstract Class yani child classda parent den aldıklarını tamamlaması gerekiyor
        public void drive(){
            System.out.println("Honda is driving");
        }
    }
    class HondaE extends Honda{
        public void charge(){
            System.out.println("HondaE is charging");
        }
    }
public class Demo {
        public static void main(String[] args) {
        //Honda obj=new Honda();abstract obje olmaz
        HondaE obj = new HondaE();
        obj.drive();
        obj.playMusic();
        obj.charge();
    }


}
/*
  Abstract Method ---Only decleration but not definition

  Abstract Class:
    Object cannot be created
    Inheritance olması gerekli--implementation of abstract method will be written in sub class
    Normal Methods and Abstract Methods

    Concrete Class:
    Object can be instantiated
    Class that contains complete definition for all methods
 */
