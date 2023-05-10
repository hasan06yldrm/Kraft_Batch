package day50_Exception_Collection;

public class C04_Exception_8 {
    public static void main(String[] args) {

        int i=50;

        if(i<Integer.MAX_VALUE){
            System.out.println(1);
        } else if (i<70) {
            System.out.println(2);
        }else if (i<50) {
            System.out.println(3);
        }else  {
            System.out.println(4);
        }

        String str=null;
        if(str==null){}
        try {
            for (int j = 0; j < str.length(); j++) {
                System.out.println(j);
            }
       // }catch (ArithmeticException | NullPointerException | IllegalArgumentException b) { KARDEŞLER BÖYLE YAN YANA YAZILIR AMA ARADA | OLMALI PARENT OLMAZ AMA
        }catch (ArithmeticException a) {//Aritmetik hata olsaydı burayı yazacak ve kod devam ediyor yazıp bitecekti
            System.out.println("Aritmetik exception hatası aldın");
        }catch (NullPointerException n){  //ARİTMETİK VE NULL KARDEŞ ÜST ALT YAZILMASI FARKETMEZ
            n.printStackTrace();
            System.out.println("Null'a dikkat");
        }catch (RuntimeException r){     //RUNTİME PARENT ALTA YAZILMALI
            System.out.println("Runtime hatası aldın");
        }catch (Exception e){           //EXCEPTİON DEDE YANİ GENEL EN ALTA YAZILMALI ÖZELDEN GENELE DOĞRU
            e.printStackTrace();
            System.out.println("Exception var kontrol et");
        }finally {
            System.out.println("Her zaman çalış");//final - finally:Her zaman çalışacak
        }
        System.out.println("kod devam ediyor");


        try {
            System.out.println(5/0); //BURADAKİ HATAYI CATCH OLMADIĞI İÇİN YAKALAMA OLMADI FİNALLY MUTLAKA YAZDI VE BİTTİ  EN SONDAKİ KOD DEVAM YAZMADI
        }finally {
            System.out.println(1);//1 SADECE
        }
        System.out.println("kod devam ediyor");

    }
}
