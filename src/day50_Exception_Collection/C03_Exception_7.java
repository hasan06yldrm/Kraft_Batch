package day50_Exception_Collection;

public class C03_Exception_7 {
    public static void main(String[] args)  {
       // Thread.sleep(5000);//5000 5 saniye  uyut demek uyut ve aç chrome u aç mesela derken 5 sn beklet sonra aç gibi
        //for (int i = 0; i < 10; i++) {
           // Thread.sleep(3000);
           // System.out.print(i);//0123456789
    //}

        System.out.println(5/0);//uncheck runtime exception
        b();

    }
    static void b() {
        try {
            a();
        }catch (Exception e){
            e.printStackTrace();//kırmızıyla göster hatayı
        }

    }
    static void a() throws InterruptedException {
        Thread.sleep(3000);
    }
}
