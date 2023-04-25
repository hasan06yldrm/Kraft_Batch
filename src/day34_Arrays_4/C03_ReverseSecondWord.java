package day34_Arrays_4;

public class C03_ReverseSecondWord {
    public static void main(String[] args) {
        System.out.println(reverseSecondWord("I Love Java"));

    }
    public static String reverseSecondWord(String str){
        String result="";
        String[] words = str.split(" ");
       // words[1] String
        String reversed="";
        for (int i = words[1].length()-1; i >=0 ; i--) {
            reversed+=words[1].charAt(i);
        }
        words[1]=reversed;

        for (String word : words) {
            result+=word+" ";
        }
        return result;
    }
    /*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */

}
