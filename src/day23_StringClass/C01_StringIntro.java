package day23_StringClass;

public class C01_StringIntro {
    public static void main(String[] args) {
        String str1="hello"; //literal way---Heap Memory----String Pool
        String str2="hello"; //str2---String Pooldaki "hello" yu işaret eder
        String str3="Hello"; //literal way---Heap Memory----String Pool

        String str4=new String("hello");  //String object---Heap Memory
        boolean bl;
        //System.out.println(bl);  Local Değişken Initialize edilmediği için hata verir
        bl=str1==str2;  //true
        System.out.println("bl: "+bl);
        System.out.println();
        bl=str1.equals(str2);
        System.out.println();
        System.out.println("bl = " + bl);//true
        bl=str1.equals(str3);
        System.out.println("bl = " + bl);//false

        bl=str1==str4;  //true
        System.out.println("bl: "+bl);//false since different objectwith different referance variables

        bl=str1.equals(str4);
        System.out.println("bl = " + bl);//referansları karşılaştırmıyor,farklı object olması ile ilgilenmiyor
                                        //sadece string içeriğini karşılaştırıyor



    }
}
