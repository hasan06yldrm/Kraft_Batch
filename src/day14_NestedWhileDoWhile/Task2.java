package day14_NestedWhileDoWhile;

public class Task2 {
    public static void main(String[] args){

       /* //Örnek: ekrana 20 adet alt alta «merhaba dünya» yazdırın.

        int i=0;
        while(i<=20){
            System.out.println("Merhaba Dünya");
            i++;
        }
        System.out.println();

        System.out.println("--------------------------------------------");

        //Örnek: 0 dan 100 e kadar olan sayıları ekrana yazdırın.

        int i=0;
        while(i<=100){
            System.out.print(i+" ");
            i++;
        }

        System.out.println("------------------------------------------------");

        //Örnek: 15 den 100 e kadar olan sayıları ekrana yazdırın

        int i=15;
        while(i<=100){
            System.out.print(i+" ");
            i++;
        }

        System.out.println("---------------------------------------------------");

        // Örnek: 0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (99 98 97 vs)

        int i=100;
        while(i>=0){
            System.out.print(i+" ");
            i--;
        }

        System.out.println("-------------------------------------------");

       // Örnek: 0 dan 100 e kadar olan çift sayıları ekrana yazdırın

        int i=0;
        while(i<=100){
            if(i%2==0){
                System.out.print(i+" ");
                i+=2;

            }
        }

        System.out.println("------------------------------------");

        //Örnek: 0 dan 100 e kadar olan tek sayıları ekrana yazdırın.

        int i=1;
        while(i<=100){
            if(i%2==1){
                System.out.print(i+" ");
                i+=2;
            }
        }

        System.out.println("--------------------------------------------");

        //Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları ekrana yazdırın.

        int i=10;
        while(i<=1000){
            if(i%10==0){
                System.out.print(i+" ");
                i+=10;
            }
        }

        System.out.println("------------------------------------------");

        //Örnek: 8 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1)

        int sayi=8;
        int faktoriyel=1;
        int i=1;
        while(i<=sayi){
            faktoriyel*=i;

                i++;


        }

        System.out.print(sayi + "! = " + faktoriyel); */

        System.out.println("-------------------------------------------------");

        /*Örnek: 0 ile 20 arasındaki 3 ün katı olan tüm sayılarının küpleri alarak
        ekrana yazdırın.
        0 0
        3 27
        9 81
        vs  */

        int i=0;
        while(i<=20){
            if(i%3==0) {
                System.out.println(i + " " + i * i * i);

            }
            i++;
        }









    }
}
