package day10_UnaryLogicalOperAndReview;

public class _04_UnaryOperators {
    public static void main(String[] args){
        //+ - ++ --
        int num1=+3;
        int num2=-2;

        System.out.println(num1>0);//true
        System.out.println(num2>0);//false

        System.out.println("--------------------------------");

        int a=10;
        ++a;//a=a+1;pre increment:sayinin değerini hemen bir artırıyor a=11
        System.out.println(a);//11
        --a;//a=a-1 ;pre decrement:sayinin değerini hemen bir azaltır a=10
        System.out.println(a);//10

        System.out.println("------------------------------------------");

        int b=99;
        System.out.println(++b);//pre incement :100

        int c=99;
        System.out.println(c++);//c yi konsola yazacak 99 u. sonra bir sonraki satırda c=100 yazdıracak
        System.out.println(c);//100

        System.out.println("-------------------------------------------");

        int x=201;
        System.out.println(--x);//200 pre decrement

        int y=201;
        System.out.println();//post decrement 201 yaziyor sonra consola
        System.out.println(y);//200 yazacak

        System.out.println("---------------------------------------------");

        int z=44;
        System.out.println(++z);//45 z=45
        System.out.println(z++);//45 z=46
        System.out.println(z++);//46 z=47

        int i=42;
        System.out.println(--i);//41 i=41
        System.out.println(i--);//41 i=40
        System.out.println(i);//40





    }



}
