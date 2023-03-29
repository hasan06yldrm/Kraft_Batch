package day21_Class_And_Object;

import java.util.Random;

public class C01_Methods_Summary {
    public static void main(String[] args) {

        //int x=seven(); // int x=7 seven()=7 yani
        //System.out.println(x);
        //int x=5,y=10;
       // System.out.println(max(x,y));
       //System.out.println(max2(x,y));
        int x=max2(5,10)*10;//100 gibi
        System.out.println(x);//100
        int y=Math.max(5,70);
        int a=menu1(5);
        System.out.println(a);
        String str=yaziTura();
        System.out.println(str);


    }
    public static String yaziTura(){
        Random random=new Random();
        int x=random.nextInt(100);
        if(x%2==0){
            return "tura";
        }
            return "yazi";
    }

    public static void menu(){
        int x=5;
        System.out.println(5);
        if(x==5){
            System.out.println(10);
            return;
        }
        System.out.println(20);
    }
    public static int menu1(int a){
        int x=5;

        if(x==5){

            return 10;
        }
        return 20;
    }
    public static int seven(){

        return 7;
    }
    public static int seven2() {
        int i = 0;
        while (true) {
            i++;
            if (i == 5) {
                continue;
            } else if (i == 7) {
                break;
            }
            System.out.println(i);
        }
        return i;
    }
    public static int seven3() {
        int i = 0;
        while (true) {
            i++;
            if (i == 5) {
                continue;
            } else if (i == 7) {
                return i;
            }
            System.out.println(i);
        }

    }
    public static int max(int x,int y){
        int max;
        if(x>y){
            max=x;
        }else{
            max=y;
        }
        return max;
    }
    public static int max2(int x,int y){

        if(x>y){
            return x;
        }else{
            return y;
        }


    }









}
