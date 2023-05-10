package day50_Exception_Collection;

public class C02_Exception_6 {
    public static void main(String[] args) {


        System.out.println("0");
        try {
            try {
                System.out.println("1");
                System.out.println(5 / 0);//runtime error uncheck
                System.out.println("2");
            }catch (Exception e){
                System.out.println("3");
            }

            //Exception e=fırlatılan exception objesini

        } catch (Exception e) {
            System.out.println(e.toString());
            e.getMessage().contains("/ by zero");//true
            System.out.println("3");
            try {
                System.out.println("4");
            } catch (Exception f) {
                System.out.println("5");
                System.out.println(5 / 0);
            }
        }
//        finally {
//            System.out.println("6"); //01346 4den sonra hata olmadığı için catch e girmedi ve finally atladı
//        }
        finally{   //BU FİNALLY DE İSE TRY OLMASA KOD DEVAM EDİYOR YAZMAYACAKTI
            try {
                System.out.println(5/0);
                System.out.println("6");
            }catch(Exception e){
                System.out.println("ben kıl bir öğretmenim");
            }
        }
        System.out.println("kod devam ediyor");
    }
}