package day06_Type_Casting;

public class _04AritmeticOperators {
    public static void main(String[] args){

        /*int x=5;
        int y=2;
        //int z=x+y;
        //int z=x-y;
        //int z=x*y;
        //int z=x/y; //Sonuç 2.5 ama tamsayı olduğu için 2 verir.
        //double z=(double)x/y;   //Genişletme tek seferlik oluyor.
       // double z=4.0;
       //           2   /4.0=0.5
       // double t=(x/y)/z;
       //               2.5     /4.0=0.625
       // double t=((double)x/y)/z;
        int t=x%y;  //% mod için kalan önemli
        System.out.print(t);*/

        int sayi=(int)(3+(double)5/2*4%(12-9)); //işlem önceliği parantez içi ve soldan sağadır.
        //int sayi=(3+5/2*4%(12-9);
        //3+5.0/2*4%3
        //3*2.5*4%3
        //3+10.0%3
        //3+1.0
        //4.0
        //4
        System.out.print(sayi);
        //3+5./2*4%3
        //3+2*4%3
        //3+8%3
        //3+2
        //5


    }
}
