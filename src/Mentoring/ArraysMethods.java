package Mentoring;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int plakalar[]={1,4,34,56,47,6,35};
        //elemanları başlangıçta atadık
       int[] sayilar={12,44,32,10,56,24,76,12};
        ilkVeSonElementKontrol(plakalar);
        ilkVeSonElementKontrol(sayilar);

        System.out.println("--------------------------------");
        String[] klubler={"Galatasaray","Beşiktaş","Fenerbahçe","Trabzon","Ankaragücü"};
        ilkElementKontrol(klubler,new String[]{"Galatasaray","Barcelona","Milan","Real Madrid"});

        int plakalar1[]={1,4,34,56,47,6,35};
        System.out.println("Reverse arrayden dönen değerler");
        for(int i:reverseArray(plakalar1)){
            System.out.print(i+", ");
        }
        //2.yol
        System.out.println(Arrays.toString(reverseArray(plakalar1)));


    }
    public static void ilkVeSonElementKontrol(int[] abc){
        if(abc[0]== abc[abc.length-1]){
            System.out.println("Dizinin ilk ve son elemanı birbirine eşittir");
        }else{
            System.out.println("Dizinin ilk ve son elemanı birbirine eşit DEGİL");
        }
    }
    public static void ilkElementKontrol(String[] str1,String[] str2){
        if(str1[0].equalsIgnoreCase(str2[0])){
            System.out.println("String Dizinin ilk elemanları birbirine eşittir");
        }else{
            System.out.println("String Dizinin ilk elemanları birbirine eşit DEGİL");
        }
    }
    public static int[] reverseArray(int[] arr){
        int[] newArray=new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            newArray[i]=arr[arr.length-(i+1)];//i  7yi elde ederiz ama ist. 6 olmalı hata index out of bound
        }
        return newArray;
    }

}
