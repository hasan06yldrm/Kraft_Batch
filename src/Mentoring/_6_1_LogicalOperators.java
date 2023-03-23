package Mentoring;

public class _6_1_LogicalOperators {
    public static void main(String[] args) {
     /*
        //&& and
        //|| or

                        &-And               |-Or                  !-Not

       T----T            T                    T                    t-f
       T----F            F                    T                    f-t
       F----T            F                    T
       F----F            F                    F

       r=x<y & a<b


      */

        int x=9;
        int y=7;
        int a=7;
        int b=11;

       // boolean result=x>y;
       // System.out.println("result = " + result);

        boolean result=x<y & a<b;//x>y | a>b;
        System.out.println("result = " + result);


    }
}
