package Mentoring;

public class C08_2_While_Loop {
    public static void main(String[] args) {

       /* int i=1;
        if(i<=4){ // 4 defa kendimiz yazdırdık
            System.out.println("Hi");
            System.out.println("Hi");
            System.out.println("Hi");
            System.out.println("Hi");
        }*/

    /* int i=1;//initialization
        while(i<=4){//false oluca duruyor
          System.out.println("Hi"+i);
          i++;//hi1,2,3,4
      }
        System.out.println("bye"+i);//bye5 */

        System.out.println("--------------------------------------------");

        int i=1;//initialization
        while(i<=4){//false oluca duruyor
            System.out.println("Hi"+i);
            int j=1;
            while (j<=3){
                System.out.println("Hello"+j);
                i++;
            }

            i++;
        }







    }
}
