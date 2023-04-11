package day29_FullReview;

public class C05_FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBBC", 'A'));


    }
    /*Write a method that can return the frequency of a char from a String

    Ex:
    str = "AAABBBC" ch = 'A'

    Output:
            3   */
    public static int frequencyOfChars(String str,char ch){
        int freq=0;
        for (int i = 0; i < str.length(); i++) {
            char ch1=str.charAt(i);

            if(ch1==ch){
                freq++;
            }
        }
        return freq;

    }

}
