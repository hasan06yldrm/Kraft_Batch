package day45_FinalAndHiding_2;

public class FinalAndHiding {//final desek çocuğu olmaz artık çocuk olur ama extends ile baba olamaz
    String bankaAdi;
    public final void getBankaAdi(){
        System.out.println("Bankanızın adı: "+this.bankaAdi);
    }

   final public void metot(){
        System.out.println("ben parent classın metoduyum" +
                " değiştirilmemem gerekiyor");
    }
    public final void metot(int x){
        System.out.println("ben parent classın metoduyum" +
                " değiştirilmemem gerekiyor");
    }

    //public static final String a(){}//METOT OLDU
    //public static final String a;//VARİABLE DEĞİŞKEN OLDU
    public static final String A="Harun";
}
