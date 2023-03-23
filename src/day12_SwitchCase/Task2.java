package day12_SwitchCase;

public class Task2 {
    public static void main(String[] args){

        int sayi=8;

        if((sayi>5)&&(sayi>25)){
            System.out.println(sayi+" 5 den büyüktür.");
            System.out.println(sayi+" hem 5 den hem de 25 den büyüktür.");

        }else if((sayi>5)&&(sayi<25)){
            System.out.println(sayi+" 5 den büyük ancak 25 den küçüktür.");
        }



    }
}
