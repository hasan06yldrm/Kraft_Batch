package day06_Type_Casting;

public class _01TypeCasting {
    public static void main(String[] args){

        //byte,short,int,long,float,double
        //char
        //boolean

       /* byte b=5;
        short s=129;
        b=(byte)s;
        System.out.println(b);

        int i=10;
        double d=20;
        d=i;
        i=(int)d;     //4byte=8byte sıkıntı oluyor.

        float f=2.5f;
        i=(int)f; //0.5 lik veri kaybı oluyor.
        System.out.println(f);

        //(null)

        String pencil;null    ya da "" arada boluk bile yok. //int ler null olmaz 0 olur.String ler null olur.
        System.out.print(pencil);

        */
        /*byte x=10;
        byte y=20;
        byte z=(byte)(x+y);

        short a=5;
        short b=10;
        short c=(short)(a+b);
        int d=a+b;    */

        double x=5.2;
        //double y=5.6;
        //int z=(int)(x+y);
        int y=5;

        int z=(int)x+y;//Birisi zaten doble olduğu için ikisini de almamıza gerek yok.

        //String a ="Hasan"; //Altgr ve mouse la String etıklayınca bilgilerine giriyor.



    }
}
