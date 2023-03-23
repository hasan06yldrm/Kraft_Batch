package day14_NestedWhileDoWhile;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                System.out.print(1);//j yi yazdırsa 123456 olur i yi desek1111222223333 olur
            }

            System.out.println();//enter görevi görüyor
        }

        System.out.println("----------------------------------------------------------------");
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------");

        for(int i=6;i>=1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
