package Mentoring;

public class C6_2_IfStatements {
    public static void main(String[] args) {
        /*
        if(condition){
        //code
        //
        }
        else{
        // code
        }
         */

       /* int x=18;
        if (x>10 && x<=20)//(true) olsa da yazdırırdı
        System.out.println("hello");
        else
        System.out.println("Bye");*/

        int x=8;
        int y=11;
        int z=9;

        if(x>y&&x>z) {
            System.out.println(x);

        } else if(y>z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }




    }
}
