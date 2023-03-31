package day24_StringClass_Cont;

public class C05_Substring {
    public static void main(String[] args) {
        String str="Java Programming Language";
                  //0123456789012345678901234
        //substring metodu iki şekilde kullanılabilir
        //Tek parametreli,o indexten başlar sonuna kadar kısmı alır

        System.out.println(str.substring(5));//Programming Language
        System.out.println(str.substring(0));//Java Programming Language
        System.out.println(str.substring(17));//Language
        System.out.println(str.substring(str.length()));//emptyIndex,hiçlik "" length 1 den başlıyor çünkü
        System.out.println(str.substring(str.length()-3));//age
        System.out.println(str.substring(str.length()-8));//Language

        //Substring(beginningIndex,endingIndex)endingIndex dahil değil oraya kadar
        System.out.println(str.substring(2, 4));//va 4 boşluk dahil değil
        System.out.println(str.substring(5, 16));//Programming
        System.out.println(str.substring(0, 1));//J
        System.out.println(str.substring(str.length() - 1, str.length()));//e
        System.out.println(str.substring(5, 5));//"" hiçlik
        System.out.println(str.substring(4, 5));//" " boşluk
        //System.out.println(str.substring(5, 3));//hata verir Runtime Error:StringIndexOutOfBoundException


    }
}
