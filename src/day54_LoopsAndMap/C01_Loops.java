package day54_LoopsAndMap;

import java.util.*;

public class C01_Loops {
    public static void main(String[] args) {
        //1.For each loop
        //2.Any other loop(for, while, do while) by using get(index) method
        //3. Iterator
        //4.forEach method that came with java 8 (lambda expression)

     /*   String[] arr={"Harun","Mehmet","Ahmet"};

        for (String str:arr){//tüm dataları gezer ama işlem yapamaz fori gibi
             System.out.println(str);//harun,mehmet,ahmet
         }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//harun,mehmet,ahmet
        }
        Set set1=new HashSet();
       // Set<Object> set=new HashSet<>();herşeyi alırdı eskiden object yazan kısımda sonradan değişti
        Set<Integer> set2=new HashSet<Integer>();
        Set<Integer> set3=new HashSet<>();

       /* List<Integer> list=new ArrayList<>();
        list.add(25);
        list.add(35);
        list.add(8);
        list.add(14);
        for (Integer sayi:list){
            System.out.print(sayi+" ");//25 35 8 14
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");//25 35 8 14
        }
        
        //Sen 25 küçük olan sayıları sil listi ekrana yazdırın

        //25 35 8 14

        for (Integer sayi: list) {
           if (sayi<25){
               list.remove(sayi); // size remove ile düştüğü için sonuncuya bakamadı olmadı foreach ile
           }
        }
        System.out.println(list);

//25 35 8 14
     /*  // 25 35 14
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)<25){
                list.remove(i); //[25,35]
                i--;
            }
        }
        System.out.println(list);

        */

        Set<Integer> set=new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(8);
        set.add(14);

      /*  for (Integer sayi:set) {
            System.out.println(sayi);//35 8 25 14 karışık hash tablosuna göre dizdi
        }
*/
//set içerisinden 25 den küçük olanları silin seti ekrana yazdırın
        //25 35 8 14
    /*    Set<Integer> set1=new HashSet<>();
        for (Integer sayi:set){
            if (sayi>=25){
                set1.add(sayi);
            }
        }
        System.out.println(set1);[35,25]
*/

        //set içerisinden 25 den küçük olanları silin seti ekrana yazdırın yeni bir set oluşturmadan
        //25 35 8 14
/*
    Iterator<Integer> iterator= set.iterator();//ITERATOR OBJE OBJE İLERLİYOR ARRAY VE DİĞERLERİ İNDEX İLERLİYOR

while(iterator.hasNext()){
Integer sayi=iterator.next();
System.out.print(sayi+" ");//35 8 25 14
}

while(iterator.hasNext()){
    Integer sayi= iterator.next();
    if(sayi<25){
        iterator.remove();
    }
}
        System.out.print(set);//[35,25]


List<String> list=Arrays.asList("Harun","Ahmet","Hasan");

Iterator itr=list.iterator();
System.out.println(itr.next());//harun
System.out.println(itr.next());//ahmet
System.out.println(itr.next());//hasan
        System.out.println(itr.hasNext());//false bitti sonda

        System.out.println(itr.next());//NoSuchElementsException hatası bitti sonda çünkü
*/
        //Foreach metot
        List<String> list= Arrays.asList("Harun","Ahmet","Hasan");
        for (String str:list) {
            System.out.print(str);//tek tek hesini yazdırıyor foreach hepsine mutlaka gidiyor  harun ahmet hasan
        }
        System.out.println();

        list.forEach(x-> System.out.println(x));//harun ahmet hasan
        set.forEach(y-> System.out.println(y));//8 25 14
        set.forEach(y-> System.out.println(y-2));//6 23 12
        List<Integer> list1=new ArrayList<>();
        set.forEach(y-> list1.add(y));
        System.out.println(list1);//HarunAhmetHasan[35,8,25,14] iç içe atadı ama alan kısıtlı bo forEach METODUNDA ama kısa ve hızlı işlem yapılıyor

        for (    ;    ;      ){

        }
    }
}
/*
Kısa ve hızlı işlem yapmak için forEach Metodu Tüm datayı döndürüyor foreach gibi
Obje obje gezmek için Iterator
Array gibi sayısı belli olanlarda index alabildiklerimizde fori alamadıklarımızda foreach kullanırız

 */
