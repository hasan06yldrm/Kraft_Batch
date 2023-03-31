package day24_StringClass_Cont;

public class C09_uniqueCharacters {
    public static void main(String[] args) {
        String str="aaabccd";//unique tek yani
        String result="";//bd olması lazım
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);//a geldi
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;
            }
        }

        System.out.println(result);//bd


    }
}
