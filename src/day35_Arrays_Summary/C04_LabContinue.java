package day35_Arrays_Summary;

import java.util.Arrays;

public class C04_LabContinue {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(15, 8)));
        int[] array1={5,4,3,2,1};
        int[] array2={1,2,3,4,5,7,9};
        System.out.println(ikinciArraydeVarMi(array1, array2));//true


    }
    public static int[] createArray(int x,int y){
        int min=Math.min(x,y);
        int max=Math.max(x,y);
        int[] resultArray=new int[max-min+1];
        for (int i = min,j=0; i <max ; i++,j++) {
            resultArray[j]=i;
        }
        return resultArray;
    }
    public static boolean ikinciArraydeVarMi(int[] arr1,int[] arr2) {
        firstLoop:
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    continue firstLoop;
                }
            }
            return false;
        }
        return true;
    }
}
