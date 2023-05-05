package day46_AbstractClassAndInterface.animal;

public interface Playable {
    boolean isFirendly=true;//static final by default

//    public static void method1(){
//        System.out.println(isFirendly); //Yapabiliriz ama gerek yok
//    }

    void play();//abstract method by default
}
