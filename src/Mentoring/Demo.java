package Mentoring;
class Calculator{
    int a;
    public int add(int a,int b){
       // System.out.println("In add");
       int result=a+b;
        return result;
    }
}
public class Demo {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;

        Calculator      calc    =                  new Calculator();
        //type (int)  variables(num1)
        System.out.println(calc.add(num1, num2));
        //System.out.println(result);
    }
}
