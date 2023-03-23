package day15_If_Else_Switch_Loops_Summary;

public class C03_Nested_If {
    public static void main(String[] args) {

        //alinin cebinde 100tl varsa ve zamanı varsa sinemaya gitsin.100tl yok ise evde kalsın
        /*int aliParasi=120;
        boolean zaman=true;
        if(aliParasi>=100){
            if(zaman){
                System.out.println("sinemaya gidebilir");
            }else{
                System.out.println("parası var ama zamanı yok gidemez");
            }
        }else{
            System.out.println("parası yok gidemez");
        }*/
        int aliParasi=120;
        boolean zaman=false;

        if(aliParasi>=100&&zaman){
            System.out.println("sinemaya gidebilir");
        }else{
            System.out.println("sinemaya gidemez");
        }






    }
}
