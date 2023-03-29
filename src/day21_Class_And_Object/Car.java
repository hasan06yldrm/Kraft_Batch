package day21_Class_And_Object;

public class Car {

    String marka;
    int modelYil;
    int begir;
    String saseNo;
    boolean isSuv;
    boolean isManual;

    public void hizlan(){

        System.out.println("Arac hızlanıyor");
    }
    public String begirKarsilastir(){
        if(begir>100){
            return "Güclü Arac";
        }
        return "Zayif Arac";
    }
}
