package day13_ForLoops;

public class Task3 {
    public static void main(String[] args){
       // Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları ekrana yazdırın.
        for(int i=10;i<=1000;i++){
            if(i%10==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
       // Örnek: 6 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1)
        int sayi=6;
        int faktoriyel=1;
        for(int i=1;i<=sayi;i++){
            faktoriyel*=i;
        }
        System.out.print(sayi+"! : "+faktoriyel);



    }
}
