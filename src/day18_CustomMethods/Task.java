package day18_CustomMethods;

public class Task {
    public static void main(String[] args){
    //age(1983);
    //usluKuvvet(2,4);
    //matematikGorunum(7,9);
    ucluIslem(10,2,'/');

    }
    //Bir method yazın doğum yılınızı girdiğinizde yaşınızı versin

    /**
     * Bir method yazın doğum yılınızı girdiğinizde yaşınızı versin
     * @param birthYear
     */
    public static void age(int birthYear){
        int age=(2023-birthYear);
        System.out.print("Your age is : "+age);
        System.out.println();

    }
    //Bir method yazın 2 sayı kabul etsin ve ilk sayıyı ikinci
    //sayının üslü kuvveti yapıp sonuç versin.

    /**
     * Bir method yazın 2 sayı kabul etsin ve ilk sayıyı ikinci
     * sayının üslü kuvveti yapıp sonuç versin.
     * @param num
     * @param num2
     */
    public static void usluKuvvet(int num,int num2){
        int result=(int)Math.pow(num2,num);
        System.out.print(result);
        System.out.println();
    }
    //Bir method yazın 2 sayı kabul etsin çağırdığımızda konsola
    //işlemin matematiksel görünümünü yazdırsın.
    //Exmp: 5 + 6 = 11

    /**
     * Bir method yazın 2 sayı kabul etsin çağırdığımızda konsola
     * işlemin matematiksel görünümünü yazdırsın.
     * Exmp: 5 + 6 = 11
     * @param num
     * @param num1
     */
    public static void matematikGorunum(int num,int num1){
        int result=num+num1;
        System.out.print(num+"+"+num1+"="+result);
        System.out.println();
    }
   //Bir method yazın 3 parametre li olsun ilk ikisi işleme sokulacak
    //sayıları üçüncü ise yapılacak işlemi belirlesin. Sonucu versin.

    /**
     * Bir method yazın 3 parametre li olsun ilk ikisi işleme sokulacak
     * sayıları üçüncü ise yapılacak işlemi belirlesin. Sonucu versin.
     * @param num
     * @param num1
     * @param ıslem
     */
    public static void ucluIslem(int num,int num1,char ıslem){
       int result;
        if(ıslem=='+'){
            result=num+num1;
        }else if(ıslem=='-'){
            result=num-num1;
        }else if(ıslem=='*'){
            result=num*num1;
        }else{
            result=num/num1;
            System.out.print("Sonuç : "+result);
            System.out.println();
        }

        }











    }





