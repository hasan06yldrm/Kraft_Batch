package Mentoring;

public class C10_MethodCont {
    public static void main(String[] args) {
        //System.out.println(add(5, 6));
        //add1(5,6);
        oddOrEven(5);
        System.out.println(oddOrEven1(5));
    }

    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static void add1(int num1,int num2){
        System.out.println(num1+num2);
    }

    public static void oddOrEven(int n){
        if(n%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static String oddOrEven1(int n) {
        String result = "";
        if (n % 2 == 0) {
            result = "even number";
        } else {
            result = "odd number";
        }
        return result;

    }
}
