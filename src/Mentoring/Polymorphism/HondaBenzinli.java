package Mentoring.Polymorphism;

public class HondaBenzinli extends Honda{
    public void motor(){
        System.out.println("Honda benzinli motor çalışır");
    }
    public void yakit(){ //OverRiding
        System.out.println("Honda benzin aldı");
    }
    public void yakit(double maxTuketim){ //OverLoading
        System.out.println("Honda benzinli yakıt tüketimi= "+maxTuketim);

    }
}
