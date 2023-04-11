package Mentoring;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    public static long fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
