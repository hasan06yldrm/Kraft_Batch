package day32_Array_2;

import java.util.Arrays;

public class C03_ArraysToString {
    public static void main(String[] args) {
        String arr[]=new String[4];
        arr[0]="Harun";
        arr[1]="Mehmet";
        arr[2]="Celal";
        arr[3]="Emine";

        System.out.println(Arrays.toString(arr).substring(0,1));//[Harun,Mehmet ...] sub bunu [ getirir

        System.out.println(toString(arr));//[Harun,Mehmet,Celal,Emine, ]sonu olmamalıydı
        System.out.println(toString1(arr));
    }
    public static String toString(String[] array){
        String result="[";
        for (String str:array) {//duracağı yerde durmadı o yüzden for i yaptık
            result+=str+", ";
        }
        result+="]";
        return result;
    }
    public static String toString1(String[] array){
        String result="[";
        for (int i = 0; i < array.length; i++) {
            if(i== array.length-1){
                result+=array[i]+"]";
            }else{
                result+=array[i]+", ";
            }
        }

        return result;
    }
    public static String toString2(double[] array){
        String result="[";
        for (int i = 0; i < array.length; i++) {
            if(i== array.length-1){
                result+=array[i]+"]";
            }else{
                result+=array[i]+", ";
            }
        }

        return result;
    }
}
