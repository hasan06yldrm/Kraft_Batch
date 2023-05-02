package day44_FinalAndHiding;

import java.util.ArrayList;

public class Main {
    //public static String[] arr=new String[10];Burda public yazabiliriz ama altta public içinde public olmaz
    public static void main(String[] args) {

        C c=new C();
        C c1=new C();
        C c2=new C();
        A a=new A();//sadece Anın içindekileri çalıştırır
        A a1=new A();//sadece Anın içindekileri çalıştırır Static e ikinci kez girmez
        B b=new B();//a static b static bloklar ve conslar en son
        B b1=new B();

       final String[] strArr={"Harun","Mehmet","Ahmet"};//referans adres final oldu içi değişebilir
        String[] strAr2={"Orhan","Cansu","Naime"};
        //strArr=strAr2;olmaz referans değişmez final çünkü adres değişmez
        strAr2=strArr;//atanır strArr2 final değil
       strArr[0]="Murat";//değişir içi
        System.out.println(strArr[0]);//Murat

       final ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList.add(250);
        arrayList.add(350);
        arrayList.set(0,600);//600,350 yapılır içi değişir böyle oldu içi
       // arrayList=arrayList2;//olmaz adres değişti
        arrayList2=arrayList;
        arrayList2.get(0);//600

       final String str="Harun";
       // str="Ali";Stringler de primitive gibi içini değiştirtmiyor final

        FinalExample finalExample=new FinalExample();
        //finalExample.X=100;final olduğu için değişmez


      /*  System.out.println(finalExample.x);//5
        finalExample.method();//35 ama yazdırmadık x 7 oldu artık metodun içine girdiği için
        System.out.println(finalExample.x);//7
        finalExample.x=45;*/

    }
}
