package Mentoring;

public class StringImmutable {
    public static void main(String[] args) {
        int a=5;
        int b=a;
        a=7;
        System.out.println(a);
        System.out.println(b);//b geride kaldığı için değişmez

        String s1="Value1";
        String s2=s1;
        s1="Value2";
        System.out.println(s1);
        System.out.println(s2);
    }
}
