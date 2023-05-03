package day45_FinalAndHiding_2;

public abstract class Animal extends Canlilar {
    int x=5;

    //public abstract void nefesAl();//Gizli olarak varCanlılardan aldı zaten inharite etti.

    public void nefesAl(){
        System.out.println("Nefes alıyor");//abstaract olan zorunluluk burda abstract class da yazdığım için bitti borç bitti yani alt sınıflarda yazmaya gerek kalmadı
    }

   // private Animal(){}obje üretilmez ve alt sınıfa kalıtım veremez.Ama obje üretilmesin ama kalıtım versin istiyorsak
    // o zaman abstract kullanırız

    public Animal(int x){
        this.x=x;
    }//alt sınıflara zorunluluk verdim 1parametreli

    public abstract void konus();//abstract metodlar altsınıflarda zorunlu ve body yok
    public  void hareketEt(){
        System.out.println("Hayvan hareket ediyor");
    }
    public void konus1(){
        System.out.println("Hayvan konuşuyor");
    }
}
//Hem alt sınıflara kalıtım versin hem de obje oluşturulmasın soyut oldu
//abstract metodlar abstract classlarda oluyor
//abstract class başka bir abstract classa extends edildiğinde zorunluluk olmuyor ikisi de soyut çünkü gerek yok
//çocukların hepsi borcu tamamlamak zorundadır