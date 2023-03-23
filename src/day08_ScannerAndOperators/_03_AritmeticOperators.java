package day08_ScannerAndOperators;

public class _03_AritmeticOperators {
    public static void main(String[] args){
        System.out.println("90"+10);//9010 concatenation
        System.out.println(10+"20");//1020 con.
        System.out.println("90"+10+10);//901010
        System.out.println(10+"90"+30);//109030
        System.out.println("90"+(10+10));//9020
        System.out.println(10+30+"90");//4090
        System.out.println(""+10+30+"90");//103090 ***
        System.out.println("-------------------------------");
        System.out.println(10+20);//Addition
        System.out.println(100-20);//subtraction
        System.out.println(10*6);//multiplication
        System.out.println("-------------------------------");
        System.out.println(100/3);//33 int oldğu için
        System.out.println(10/4);//2 int old.için
        System.out.println(10/4.0);
        System.out.println(10.0/4);
        System.out.println(10d/4);
        System.out.println("-------------------------------");
        int a=100;
        double b=a/6; //16,0
        double c=16;
        System.out.println(b);
        System.out.println(c);

        double d=(double)a/6;
        System.out.println(d);

        System.out.println(100);//100
        System.out.println(100d);//100.0

        System.out.println("-------------------------------");
        System.out.println(10%2);
        System.out.println(10%3);
        System.out.println(10%4);







    }
}
