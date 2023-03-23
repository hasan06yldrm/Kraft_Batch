package day09_OperatorsCont;

public class _04_ShortHandOperators {
    public static void main(String[] args) {
        //assingment atama
        int number=12;
        number=20;
        System.out.println("number = " + number);

        String word="Java Programming Language";
        System.out.println("word = " + word);

        word="Phyton Programming Language";
        System.out.println("word = " + word);

        word="Golden Globe";

        System.out.println("-----------------------------");

        int x=100;
        System.out.println("x = " + x);
        x+=100;//x=x+100
        System.out.println("x = " + x);

        String str="Golden";
        str=str+" Globe"; //str+=Globe
        System.out.println(str);
        double num1= 3.5;
        System.out.println("num1 = " + num1);

        num1+=6.5;
        System.out.println("num1 = " + num1);

        double bakiye=3520.50;
        System.out.println("bakiye = " + bakiye);
        //1500tl
        bakiye+=1500;
        System.out.println("bakiye = " + bakiye);

        //2200tl
        bakiye-=2200;//println("bakiye = " + bakiye);
        System.out.println("bakiye = " + bakiye);

        System.out.println("--------------------------------");

        double maas=42500.50;
        System.out.println("maas = " + maas);

        maas*=2;
        System.out.println("maas = " + maas);

        double gramAltin=0.001;
        gramAltin*=120;
        System.out.println("gramAltin = " + gramAltin);

        System.out.println("------------------------------");

        double num2=50000.0;
        num2/=2;
        System.out.println("num2 = " + num2);

        System.out.println("---------------------------------");

        double num3=100;
        num3%=3;
        System.out.println("num3 = " + num3);

        System.out.println("--------------------------------");

        int odeceneceTutar=1130;

        int ikiYuzluk=1130/200;
        odeceneceTutar%=200;
        System.out.println("odeceneceTutar = " + odeceneceTutar);
        int yuzluk=odeceneceTutar/100;
        odeceneceTutar%=100;
        int yirmilik=odeceneceTutar/20;
        odeceneceTutar%=20;
        int onluk=odeceneceTutar/10;
        odeceneceTutar%=10;
        System.out.println("1130 TL için : "+ikiYuzluk+" tane ikiyüzlük banknot"+yuzluk+" yüzlük banknot "+
                yirmilik+" tane yirmilik banknot "+onluk+" tane onluk banknot ödemeniz gerekmektedir.");


    }
}
