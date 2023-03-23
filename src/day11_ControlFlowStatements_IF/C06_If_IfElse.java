package day11_ControlFlowStatements_IF;
import java.util.Scanner;
public class C06_If_IfElse {
    public static void main(String[] args) {

        //A ve B 2 adet int sayıyı karşılaştırın
        //A büyüktür B den
        //B büyüktür A dan
        //A eşittir B

       /* int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("A büyüktür B den");
        } else if (a == b) {
            System.out.println("A ve B eşittir");
        } else if(a<b){
            System.out.println("B büyüktür A dan");
        }else if(a>b){
            System.out.println("merhaba");
        }else{
            System.out.println("program sona erdi");
        }*/

       /*System.out.println("A");
        if (true){
            System.out.println("B");
        }else if(false){
            System.out.println("C");//ilk true dan sonra istediği kadar true olsun 1. den sonra atlar diğerlerini
        }else if(false){
            System.out.println("D");
        }else{
            System.out.println("E");
        }
        System.out.println("F");*/

        //Bir program yazın eger x in degeri 10 ise y ye 20 atansın
        //degil ise y ye 0 atansın

        /*int x=10,y;
        if(x==10){
            y=20;
        }else{
            y=0;
        }
        System.out.println("y = " + y);*/

      //Bir program yazın eğer x in değeri 10 ise y ye 20 atansın,.
        //x in değeri 20 ise y ye 30 atansın,
        //x in değeri 30 ise y ye 40 atansın,.
        // değil ise y ye 0 atansın

       /* int x=10,y=0;
        if(x==10){
            y=20;
        }else if(x==20){
            y=30;
        }else if(x==30){
            y=40;
        }else{
        System.out.println("x bulunamadı");
        }
        System.out.println("y = " + y);*/

        //Bir program yazın sıcaklık 20 derece ve üstü ise String message;
        //değişkenine buuterfly flies(kelebekler uçar)assign edilsin

        /*String str;
        int degree=19;
        if(degree>=20){
            str="butterfly flies";
        }else {
            str="";
        }
        System.out.println(str);*/

        //Aysenin cep harçlığı 5 liradan daha az ise
        //babası ona 10 lira daha versin

       /*int para=3;

        if(para<5){
            para=para+10;
        }
        System.out.println("para = " + para);*/

        //2 numara kabul etsin numaraların eşit olup olmadığını döndürsün

       /* int x=10;
        int y=10;
        if(x==y){
            System.out.println("sayı eşit");
        }else{
            System.out.println("sayılar eşit değil");
        }*/

        //bir program yazın 2 tane numara kabul etsin ve büyük olanı versin

       /* int x=20;
        int y=20;
        if(x>y){
            System.out.println(x);
        }else if(x==y){
            System.out.println("Sayılar esit büyük sayi yok");
        }else{
        System.out.println(y);
        }
        */

        // Write a program a,b,c olmak üzere 3 int degisken declare edelim
        //sırasıyla degerler atayalım.
        //a ve b degiskenin toplamı c den fazla ise
        //a ve b nin farkını c ye atasın

        /* int a,b,c;
        a=20;
        b=30;
        c=30;
        if((a+b)>c) {
            c = a - b;//c=Math.abs((a-b))mutlak değeri aldı
            //c=Math.max(a,b)-Math.min(a,b);
            if ((a - b) >= 0) {
                c = a - b;

            } else {
                //c=-(a-b)
                c = b - a;
            }
        }
        System.out.println(c);*/


        //3 adet iç açı alsın ve bunu üçgen olup olmadığını kontrol etsin

       /* int x,y,z;
        x=60;
        y=60;
        z=60;
        if((x+y+z)==180){
            System.out.println("Bu bir üçgendir");
        }else {
            System.out.println("Üçgen değildir");
        }*/

        //Bir program yazın 3 açı kabul etsin açılardan biri 90 ise bu bir dik üçgendir mesajı döndürsün

       /*int x,y,z;
        x=60;
        y=30;
        z=90;
        if ((x+y+z)==180){
            if (x == 90 || y == 90 || z == 90) {

                System.out.println("bu bir dik üçgendir");

        }else {
                System.out.println("bu üçgen dik üçgen değildir");
            }else {
            System.out.println("bu bir üçgen değildir");
        }

            //if((x+y+z==180) && (x == 90 || y == 90 || z == 90)){Böyle de olabilir
               // System.out.println("Bu bir üçgendir");
           // }else {

           // }*/


            ////Bir program yazın
            //// 3 tane numara kabul etsin ve büyük olanı versin.(homework)
            //// 2 veya 3 farklı yol ile çözmeye çalışın

        Scanner scan=new Scanner(System.in);
        /*System.out.println("Lütfen 3 sayı giriniz");
        System.out.print("1. sayı : ");
        int a=scan.nextInt();
        System.out.print("2.sayı : ");
        int b=scan.nextInt();
        System.out.print("3. sayı : ");
        int c=scan.nextInt();

        if ((a>b)&&(a>c)){
            System.out.print("En büyük sayı : "+a);
        }else if((b>a)&&(b>c)){
            System.out.println("En büyük sayı : "+b);
        }else if((c>a)&&(c>b)){
            System.out.println("En büyük sayı : " + c);
        }else {
            System.out.print("Büyük yok sayıların hepsi aynıdır");
        }*/















    }
}
