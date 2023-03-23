package day14_NestedWhileDoWhile;

public class Task1 {
    public static void main(String[] args){

       /* Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        1
        12
        123
        1234
        12345
        123456  */

        for(int i=1;i<=6;i++){
            System.out.print(1);
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");

        /* Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        1
        22
        333
        4444
        55555
        666666   */

        for(int i=1;i<=6;i++){
            System.out.print(i);
            for(int j=2;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

         /* Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15  */

        for (int i = 0,k=1; i < 5; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");

        /* Ödev: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */
        int k;
        for(int i=1;i<=6;i++) {
            for (int j = i; j <=6; j++) {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");

         /*Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
        kulanarak)
        ******
        *****
        ****
        ***
        **
        *   */

        for(int i=1;i<=6;i++){
            for(int j=6;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");

         /* Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
        kulanarak)
        *
        **
        ***
        ****
        *****
        ******  */

        for(int i=0;i<=6;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

       /*Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        111111
        111111
        111111
        111111
        111111
        111111  */

        for(int i=0;i<=6;i++){
            for(int j=0;j<=6;j++){
                System.out.print("1");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");








    }
}
