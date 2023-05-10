package day50_Exception_Collection;

public class C05_Exception_9 {
    public static void main(String[] args) {
        try {
           throw new Exception("Harun hata fırlatıyor");
        }catch (Exception e){
           // System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            throw new HarunException("Hata");
        }catch (HarunException har){
            System.out.println(har.message);
        }
    }
    static void d(){
        c();
    }
    static void c(){
        try {
            b();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void b() throws Exception {

        a();
    }
    static void a() throws Exception {
        throw new Exception("Harun hata fırlattı");
        //***throws declare etmek throw hata fırlatmak***

    }
}
