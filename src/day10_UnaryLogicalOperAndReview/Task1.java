package day10_UnaryLogicalOperAndReview;

public class Task1 {
    public static void main(String[] args){
        int age=20;
        String healt="healty";

        boolean toBeSoldier=age>=20 && healt=="healty";
                            //true  &&  "healty"=="healty"
                            // true &&  true
                            //      true
       // System.out.println("To be soldier : "+toBeSoldier);

        toBeSoldier=age==22 && healt=="healty" || age>19 && healt=="poorly";
                    //false && true            ||   true && false
                    //     false               ||       false
                    //                        false
        System.out.println("toBeSoldier = " + toBeSoldier);

        System.out.println("---------------------------------------");


        boolean x=false , y=false , z=true;
        x=!y;//false
        z=!x && x==z;
        //t && false = false

        System.out.println("------------------------------------------");

        int i=2;
        boolean ln;

        ln=--i==i || i<1;
        //  1 ==2 || false
        //   false|| false =false
        ln=i++==i || i<1;
        //  true  || false =true
        System.out.println("ln = " + ln);


    }
}
