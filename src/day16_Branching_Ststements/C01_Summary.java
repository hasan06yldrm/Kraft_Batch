package day16_Branching_Ststements;

import java.util.Scanner;

public class C01_Summary {
    public static void main(String[] args) {
      /*  int taban=0 ;
        int kuvvet=0;

        int result=1;
        for (int i = 0; i < kuvvet; i++) {

            result*=taban;//result=result*taban
        }
        if(taban==0&&kuvvet==0){
            System.out.println("tanımsız");
        }else{
            System.out.println(result);


        System.out.println("--------------------------------------");  */

        //piramit ortadan aşagı iniyor

        for (int i = 5; i >0; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k = 6-i; k >0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------");

        Scanner scan=new Scanner(System.in);
        boolean flag=true;

        while (flag){
            System.out.print("x: ");
            int x=scan.nextInt();
            System.out.print("y: ");
            int y=scan.nextInt();
            int result=x+y;
            //if(x==0&&y==0)
            //   break; sonsuz contiune den çıkar
            if(result>=25){
                flag=false;//break de olabilir
                System.out.println("Toplam 25 eşit veya büyük olduğu için sonuç veremiyoruz tekrar deneyiniz");
                //break burada olmamalı continue dersek çıkmaz devam eder
            }
                System.out.println("toplam: "+result);

        }
        System.out.println("Porgram sonlandı");









    }
}
