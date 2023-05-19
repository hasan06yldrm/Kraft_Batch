package day56_JavaReview;

public class C03_StringClasses {
    public static void main(String[] args) {


        //String Literals are shared in String Pool  str,str1
        //String literal is faster than new keyword new ile olana göre daha hızlı poollar
        String str = "school";
        String str1 = "school";
        String str2 = new String("school");
        String str3 = new String("school");

//        StringBuffer stringBuffer = "school";   //String literal string pool, cannot be used in StringBuffer and String Builder
//        StringBuilder stringBuilder = "school";

        str.toUpperCase(); // "SCHOOL" new string object, have no reference after this line aligible for garbage collection
        System.out.println(str);  // strings are immutable "school"; Tekrar küçük yazar değişmez old. için

        String str4 = str1.toUpperCase();
        System.out.println(str4);

        StringBuffer stringBuffer = new StringBuffer("school");
        System.out.println("stringBuffer = " + stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("school");
        System.out.println("stringBuilder = " + stringBuilder);

        str1.concat(" garden");    //"school garden" yazdırdı
        System.out.println("str1 = " + str1);//str=school

        // StringBuilder and StringBuffer are mutable. Degisirler append concatla aynı görevi yapar
        stringBuilder.append(" garden");
        System.out.println("stringBuilder = " + stringBuilder);//stringBuilder=school garden

        stringBuffer.append(" garden");
        System.out.println("stringBuffer = " + stringBuffer);//stringBuffer=school garden

        System.out.println("stringBuilder.reverse() = " + stringBuilder.reverse());//nedrag loohcs
        System.out.println("stringBuffer.reverse() = " + stringBuffer.reverse());//  nedrag loohcs


    }
}
