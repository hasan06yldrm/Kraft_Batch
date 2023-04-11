package day29_FullReview;

public class C03_RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AABBCCBC"));

    }
    /*Write a method that can remove the duplicated characters from a String
    Ex:
    input:
    AABBCCBC

    Output:
    ABC

    Hint: You can add each characters of the string into another String
    Condition: the character is not contained in the other String yet before you are adding*/
    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            String ch=""+str.charAt(i);//char ch string olarak ifade edilmiş oldu
            if(!result.contains(ch)){//eğer result stringinin içinde ch karakteri yoksa
                result+=ch;//char Stringe eklendi
            }
        }
        return result;
    }
}
