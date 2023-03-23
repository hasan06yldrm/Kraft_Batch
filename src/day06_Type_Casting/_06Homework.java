package day06_Type_Casting;

public class _06Homework {
    public static void main(String[] args) {
        //Bir musluğu A musluğu tek başına 12 saatte, B musluğu 30 saatte dolduruyor,
        // c musluğu ise dolu havuzu 9 saatte boşaltıyor.
        // Buna göre bu 3 musluk birlikte açıldığında boş havuz kaç saatte dolar.

        double a=12;
        double b=30;
        double c=9;
        double a1=1/a;
        double b1=1/b;
        double c1=1/c;
        double t=1/(a1+b1-c1);
        System.out.println("t = " + t);


    }
}
