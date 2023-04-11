package day31_Arrays_1;

public class C03_Arrays_2 {
    public static void main(String[] args) {
        int array[] = new int[5];
        array[0] = 105;
        array[1] = 89;
        array[2] = 63;
        array[3] = 56;
        array[4] = 107;
        System.out.println("array.length = " + array.length);//5  köşeli parantez yok metod değil field length
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");//105 89 63 56 107 yazar
        }

        for (int x : array) {//foreach döngüsü hepsine gidiyor
            //x==array[0] 1.döngü
            //x==array[1] 2.döngü
            //x==array[2] 3.döngü
            //x==array[3] 4.döngü
            //x==array[4] 5.döngü
        }
        for (int x : array){
            System.out.print(x+" ");//105 89 63 56 107
        }
        int ciftSayi = 0;
        for (int x : array) {//foreach döngüsü
            if (x % 2 == 0) {
                ciftSayi++;
            }
        }
        System.out.println(ciftSayi);//1 çift sayi


        //for each döngüsü kullanarak arrayin tek sayilarini bul
        int tekSayi = 0;
        for (int x : array) {
            if (x % 2 != 0) {
                tekSayi++;
            }
        }
        System.out.println("tekSayi = " + tekSayi);//4
   
   //arrayin içerisindeki tüm verileri toplayan ve ekrana yazdıran bir for each loop yapın
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("for loop toplam: "+sum);

        int arrayToplam=0;
        for(int x:array){
            arrayToplam+=x;
        }
        System.out.println("arrayToplam = " + arrayToplam);


        System.out.println("arrayMethod()[1] = " + arrayMethod()[1]);//Mehmet
    }
    public static String[] arrayMethod(){
        String[] array={"harun","mehmet"};
        return array;//harunmehmet
    }
    public static String arrayMethod2(String[] arr){
        return arr[0];

    }

    

}