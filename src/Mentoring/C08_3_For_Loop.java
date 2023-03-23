package Mentoring;

public class C08_3_For_Loop {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){//initialization-condition-increment-decrement
            System.out.println("Day"+i);

            for (int j = 1; j <=9 ; j++) {
                System.out.println(" "+(j+8)+" - "+(j+9));
            }
        }

        int i=1;
        for(;i<=5;){//böyle de olur ama ";" olmalı
            System.out.println("Day"+i);
            i++;
        }





    }
}
