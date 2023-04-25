package day34_Arrays_4;

public class C07_ArrayLab {

    public static int sumOfArrayElements(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    public static double sumOfArrayElements(double[] arr){
        double sum=0;
        for (double i : arr) {
            sum+=i;
        }
        return sum;
    }

    public static int sumOfEvenElements(int[] arr){
        int sum=0;
        for (int i : arr) {
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static int sumOfThrees(int[] arr){
        int sum=0;
        for (int i : arr) {
            if(i==3){
                sum+=i;
            }
        }
        return sum;
    }





}
