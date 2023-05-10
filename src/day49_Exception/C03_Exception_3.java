package day49_Exception;

public class C03_Exception_3 {
    //3 TANE EXCEPTİON DENİRSE IndexOutOfBoundsException-ArithmeticException-RuntimeException-NumberFormatException...
    public static void main(String[] args) {
        System.out.println(metot(null)); //NullPointerException
        String[] arr={"harun"};
        System.out.println(arr[2]);//uncheck ArrayIndexOfBoundsException

        System.out.println("1");
        try {
            System.out.println("2");
            //System.out.println(5/0);//1245 çalışır
            System.out.println(5/0);//ArithmeticException UNCHECK EXCEPTİON KIZARMIYOR COMPİLE EDİYORSA
        }catch (Exception e){
            System.out.println(5/0);//124 çalışır
        }finally{ //HER DURUM VE ŞARTTA ÇALIŞIR
            System.out.println("4");//BUNU KESİN YAZDIRMAK İSTİYORSAK FİNALLY YAPMALIYIZ
        }
        System.out.println("5");

    }
    public static void unchecked(){//hata vermiyor runtime da hata veriyor
        System.out.println(5/0);//ArithmeticException UNCHECK EXCEPTİON KIZARMIYOR COMPİLE EDİYORSA

    }
    public static void normalMetod() throws InterruptedException {
        check();//kullanacaksak hata verir handle etmedik check metodunu try ile handle edersek olur
        // ama handle etmezsek throws ile sorunu çözmeden kullanacaklara atarız sorunu

//        try {
//           check();
//        }catch (Exception e){
//            System.out.println("Handle ettim");
//       }
    }
    public static String metot(String str) {
//        String result = "";
//        for (int i = str.length() - 3; i < str.length(); i++) {  //NullPointerException
//            result += str.charAt(i);
//        }
//        return result;//DÜZELTMEK İÇİN

        try {
            String result = "";
            for (int i = str.length() - 3; i < str.length(); i++) {
                result += str.charAt(i);
            }
            return result;
        } catch (Exception e) {   //null
            return null;
        }
    }
    public static void check() throws InterruptedException { //HEMEN HATA VERİR KIZARIR VE HATANI DÜZELTMENİ BEKLER THROWS İLE
        Thread.sleep(3000);//InterruptedException

//        try {
//            Thread.sleep(3000);//InterruptedException
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }

}
