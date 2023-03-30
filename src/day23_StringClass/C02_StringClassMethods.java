package day23_StringClass;

public class C02_StringClassMethods {
    public static void main(String[] args) {
        //length:Karakter sayısı javanın
        String programmingLanguage="java";//String Pool içerisinde bir obje oluşturdu
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());

        programmingLanguage="python";   //String immutable(değiştirilemez),java yı işaret ediyordu,String pool da yeni bir obje
                                        //o objenin içine python yazdı
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());
        System.out.println("------------------------------------------------------");

        //TOUPPERCASE(), tolowercase()
        System.out.println("programmingLanguage.toUpperCase() = " + programmingLanguage.toUpperCase());//PYTHON yazar büyük harfle
        System.out.println("programmingLanguage = " + programmingLanguage);//python küçük yazar

        programmingLanguage=programmingLanguage.toUpperCase();//PYTHON büyük oldu
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase());//ptyhon yazar
        System.out.println("programmingLanguage = " + programmingLanguage);//PYTHON

        System.out.println("-------------------------------------------------------");

        //charAt() programmingLanguage=PYTHON büyük hala
        //                             012345
        System.out.println("programmingLanguage.charAt(0) = " + programmingLanguage.charAt(0));//P yazar
        System.out.println("programmingLanguage.charAt(5) = " + programmingLanguage.charAt(5));//N
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());  //6
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = "
                + programmingLanguage.charAt(programmingLanguage.length() - 1));//-1 son karakteri alır -2 bi önceki
        //System.out.println("programmingLanguage.charAt(programmingLanguage.length()) = "
        //        + programmingLanguage.charAt(programmingLanguage.length()));//hata verir
        System.out.println("programmingLanguage.charAt(2) = " + programmingLanguage.charAt(2));//T
        programmingLanguage.charAt(programmingLanguage.length()-4);//T

        //programmingLanguage.charAt(programmingLanguage.length()-7);//-1 diye hata verir

        System.out.println("------------------------------------------------------------");

        //concat() ---İki şeyi ekliyor
        System.out.println("programmingLanguage = " + programmingLanguage);//PYTHON
        System.out.println("programmingLanguage.concat(\" Programlama Dili Java'dan daha kolaydır.\") = "
                + programmingLanguage.concat(" Programlama Dili Java'dan daha kolaydır."));
        programmingLanguage=programmingLanguage.concat(" Programlama Dili Java'dan daha kolaydır.");

        System.out.println("-------------------------------------------------------------");

        //contains()---İçermek demek,içine bir String alır ve boolean değer döndürür T or F
        System.out.println(programmingLanguage);
        System.out.println("programmingLanguage.contains(\"Dili\") = " + programmingLanguage.contains("Dili"));
        System.out.println("programmingLanguage.contains(\" Dili \") = " + programmingLanguage.contains(" Dili "));
        System.out.println("programmingLanguage.contains(\" Dili J\") = " + programmingLanguage.contains(" Dili J"));
        System.out.println("programmingLanguage.contains(\" DiliJ\") = " + programmingLanguage.contains(" DiliJ"));//false J birleşik değil ama burada birleşik
        System.out.println("programmingLanguage.contains(\"python\") = " + programmingLanguage.contains("python"));//false
        System.out.println("programmingLanguage.contains(\"P\") = " + programmingLanguage.contains("P"));//true
        System.out.println("programmingLanguage.contains(\"W\") = " + programmingLanguage.contains("W"));//false

        System.out.println("------------------------------------------------------------");

        //trim()---Düzenle
        String s="   Hello   World  ";
        System.out.println(s);       //  Hello  World  ;
        System.out.println(s.trim());//Hello  World;
        System.out.println(s);       //  Hello  World  ;
        String trimedS=s.trim();
        System.out.println(trimedS);//Hello  World;artık böyle kaydetti trimedS

        System.out.println("--------------------------------------------------------------");

        //replace()
        System.out.println("s.replace(\"Hello\",\"Big Big\") = " + s.replace("Hello", "Big Big"));
        System.out.println("trimedS.replace(\"Hello\",\"Developer\") = " + trimedS.replace("Hello", "Developer"));
        System.out.println("trimedS.replace(\"Hel\",\"\") = " + trimedS.replace("Hel", ""));

        System.out.println("-----------------------------------------------------------------");

        //indexOf()
        // Hello   World
        // 0123456789
        System.out.println(trimedS);
        System.out.println("trimedS.indexOf(\"H\") = " + trimedS.indexOf("H"));//0 dan başlar
        System.out.println("trimedS.indexOf(\"Hell\") = " + trimedS.indexOf("Hell"));//0
        System.out.println("trimedS.indexOf(\"World\") = " + trimedS.indexOf("World"));//8 index i


    }

}
