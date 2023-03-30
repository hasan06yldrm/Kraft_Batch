package day22_ClassAndObject_Memory;

public class Math2 {
    //Math2 sınıfı oluşturun ve pow(taban, kuvvet) methodu yazın. Main sınıfı içerisinde
    //oluşturduğunuz sınıf içerisinden hesaplama yaptırın.
    //Math2.pow(2,3)=8

    int taban;
    int kuvvet;

    public static int pow(int taban,int kuvvet){

        int result=1;

        for(int i=0;i<kuvvet;i++){
            result=result*taban;
        }
        return result;

    }




}
