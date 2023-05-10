package day49_Exception;

public class C04_Exception_4 {

    public static void a(){
        b();//b temizledi artık hata yok
    }
    public static void b(){
        //c(); //hata almaz handle edince
        //d();//hata alır biz c() yi düzelttik
        try {
            d();
        }catch (Exception e){

        }

    }
    public static void c() throws InterruptedException {
        d();
//        try {
//            d();
//        }catch (Exception e){
//
//        }
    }
    public static void d() throws InterruptedException {
        Thread.sleep(3000);

    }


}
