package day25_Summary;

public class C02_Main {
    public static void main(String[] args) {

        int f=2;
        int c=5;
        Math2.max(f,c);
        System.out.println(Math.max(f, c));
        if(Math2.pow(f,c)>500){
            System.out.println("500 den büyük");
            System.out.println(Math.pow(f, c));
        }



    }
}
