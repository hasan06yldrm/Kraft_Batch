package day30_Review;

public class C07_FrequencyOfWord {
    public static void main(String[] args) {
        frequencyOfWord("JavaJavaJavaJavaJavaJavaPythoCc++RubyCJava","Java");
    }
    public static int frequencyOfWord(String str,String word){
        int frequency=0;
        while(str.contains(word)){
            str=str.replaceFirst(word,"");
            frequency++;
        }
        return frequency;
    }
}
//Bir method String
