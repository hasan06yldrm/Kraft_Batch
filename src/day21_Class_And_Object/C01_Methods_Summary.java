package day21_Class_And_Object;

public class C01_Methods_Summary {
    public static void main(String[] args) {

        //int x=seven();
        //System.out.println(x);
        //int x=5,y=10;
       // System.out.println(max(x,y));
       //System.out.println(max2(x,y));
        int x=max2(5,10)*10;//100 gibi
        int y=Math.max(5,70);


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
        int max;
        if(x>y){
            return x;
        }else{
            return y;
        }

    }









}
