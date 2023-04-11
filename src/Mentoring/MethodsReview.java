package Mentoring;

public class MethodsReview {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
        int n=7;
        for (int i = 0; i <= n; i++) {
            System.out.println(i+" ");
        }


    }
    //fibonacci 0 1 1 2 3 5 8 13 21 34 55
    //değişken int olacak
    //dönüş tipi long olacak
    //değişkene karşılık gelen fibonacci i verecek
    public static long fibonacci(int n){
        if(n<=1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }

}
