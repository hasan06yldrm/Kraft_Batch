package day43_InheritanceAndAccesKeywords;

public class Motorcycle extends Vehicle{

    private int cc;


    public Motorcycle(){}
    public Motorcycle(int cc){
        this.cc=cc;
    }
    public void start(){
        System.out.println("Motor çalıştı");
    }

    public static Motorcycle motorsikletOlustur(){
      // Motorcycle motorcycle=new Motorcycle();
      // return motorcycle;
        return new Motorcycle();
    }

    public void changeCc(int yeniCc){
        cc=yeniCc;
    }
    public int getCc(){
        return cc;
    }
}
