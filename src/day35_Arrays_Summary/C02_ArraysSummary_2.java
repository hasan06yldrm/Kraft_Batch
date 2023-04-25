package day35_Arrays_Summary;

import java.util.Arrays;

public class C02_ArraysSummary_2 {
    public static void main(String[] args) {
    /*
        String str="Merhaba";
        String[] strArray=str.split("a");
        //System.out.println(Arrays.toString(strArray));
        for (String s:strArray){
            System.out.println(s);//Merh b
        }
        System.out.println(strArray.length);//2
        String[] strArray={"harun","ayse","mehmet"};
        String[] yeniArray=Arrays.copyOfRange(strArray,0,2);//hepsi için strArray.length
        String[] yeniArray1={strArray[0],strArray[1]};
        System.out.println(yeniArray[1]);//hata
       /* String[] yeniArray=new String[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            yeniArray[i]=strArray[i];  */

        int[] arr={9,6,3,1,0,2,4,7,8,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(maxArray(arr));//9
        System.out.println(Arrays.toString(arr));//0,1,2,3,4,5,6,7,8,9 metod gitti eskisi yani
        Arrays.fill(arr,0,5,10);//sadece 0 dersek hepsine 0 atar konrollü kullanmak gerekiyor
        System.out.println(Arrays.toString(doldur(arr, 0, 3, 100)));
        System.out.println(Arrays.toString(arr));//orjinal değişti


    }

    public static int[] doldur(int[] arr,int from,int to,int value){
        int[] resultArray=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.fill(arr,from,to,value);
        return Arrays.copyOfRange(arr,0,arr.length);
    }
    public static int maxArray(int[] array){
       int[] yeniArray=Arrays.copyOfRange(array,0,array.length);
        Arrays.sort(yeniArray);
        return yeniArray.length-1;



    }

}
