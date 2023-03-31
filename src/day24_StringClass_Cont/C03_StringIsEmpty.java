package day24_StringClass_Cont;

public class C03_StringIsEmpty {
    public static void main(String[] args) {
        //isEmpty Stringin boş olup olmadığını kontrol ediyor

        String s1="Merhaba";
        System.out.println(s1.isEmpty());//false
        System.out.println(s1.isBlank());//false

        String s2="";
        System.out.println(s2.isEmpty());//true
        System.out.println(s2.isBlank());//true

        String s3=" ";
        System.out.println(s3.isEmpty());//false

        System.out.println(s3.isBlank());// blank boşluk var mı space demek//true


    }
}
