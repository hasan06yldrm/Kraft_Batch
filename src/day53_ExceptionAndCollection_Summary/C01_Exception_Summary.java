package day53_ExceptionAndCollection_Summary;

public class C01_Exception_Summary {
    public static void main(String[] args) {
        System.out.println("program çalıstı");
        try {
            System.out.println(5/0);
        }catch (ArithmeticException  | ArrayIndexOutOfBoundsException ae){//İs a ilişkisi olmayacak kardeş olacaklar tek | veya 2.ye de sağa sola mutlaka bakıyor || bunda tek yetiyor
            ae.printStackTrace();
            System.out.println("Hata var kontrol ediniz");
            System.out.println("Bu hata aritmetik exception hatasıdır");
        }catch (Exception e){
            e.printStackTrace();
        }catch (Throwable t){ //hiç çalışmayacak yazmaya gerek yok aslında exception ın üst sınıfı
            t.printStackTrace();
        }finally {
            System.out.println("Mutlaka çalısacak");
        }

        System.out.println("program çalışmaya devam ediyor");


       try {

       }catch (NullPointerException n){//Aynı seviyedekiler altlı üstlü yazılır ama parentler alta yazılmalı

       }catch (SecurityException s){//bu ve null kardeş

       }catch (RuntimeException r){

       }catch (Exception e){

       }finally {

       }

       try {

       }finally {
           //chrome.exit;hata alırsam çık diye böyle yazıyoruz
       }

       int x=5;
       int y=10;
       if (y-x==5){
           throw new IndexOutOfBoundsException("Sonuç 5 olamaz hata var kardeşim düzelt onu");
       }//***  THROW FIRLATMA THROWS DECLARE ETME***

        c(5,10);//sonuç 5 olamaz hata var kardeşim düzet onu hatası verir

    }
    public static void a() throws InterruptedException {
        Thread.sleep(3000);
    }
    public static void b() throws InterruptedException  {
        a();
    }
    public static void d()  {
       try {
           b();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    public static void c(int x,int y) {
        //d();
        //int x=5;
       // int y=10;
        if (y-x==5){
            throw new IndexOutOfBoundsException("Sonuç 5 olamaz hata var kardeşim düzelt onu");
        }//THROW FIRLATMA THROWS DECLARE ETME
    }//error ve exceptionlardan 3 tane ezberle
}
