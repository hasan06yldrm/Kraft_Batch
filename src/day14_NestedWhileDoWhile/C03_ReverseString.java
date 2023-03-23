package day14_NestedWhileDoWhile;

public class C03_ReverseString {
    public static void main(String[] args) {

       /* String name="Ali";
                   //012
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));*/

        String str="teneke";
        //          012345
        String reversed="";
        System.out.println("Str.length() : "+str.length());
       // System.out.println(str.charAt(0));
        //System.out.println(str.charAt(5));

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }

        reversed+=str.charAt(5);
        reversed+=str.charAt(4);
        reversed+=str.charAt(3);
        reversed+=str.charAt(2);
        reversed+=str.charAt(1);
        reversed+=str.charAt(0);
        System.out.println(reversed);

        reversed="";

        for(int i=str.length()-1;0<=i;i--){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);




    }
}
