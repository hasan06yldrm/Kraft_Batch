package day24_StringClass_Cont;

public class C06_LastIndexOf {
    public static void main(String[] args) {

        //indexOf()ilk bulunanın indeksini getirir
        //lastIndexOf()son bulunanın indeksini getirir
        //          0123456
        String str="Merhaba";
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));//ilk a yani 4.sıradaki
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));//6
        System.out.println("---------------------------");
        int length=str.length();  //Merhaba 7
        System.out.println(length);
        str=str.replace("a","");//Merhb 5
        int lengthFinal=str.length();//5
        System.out.println(str+"Merhaba içerisinde a "+(length-lengthFinal)+" adet mevcuttur.");


    }
}
