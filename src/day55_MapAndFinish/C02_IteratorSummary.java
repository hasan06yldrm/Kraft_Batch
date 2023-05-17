package day55_MapAndFinish;

import java.util.*;

public class C02_IteratorSummary {
    public static void main(String[] args) {
        //3. Iterator


        //obje obje obje obje obje Iterator böyle obje leri tek tek geziyor

        Set<Integer> set=new HashSet<>();
        set.add(12);
        set.add(8);
       //set.add(9);
        set.add(35);
        set.add(27);
        for (Integer x:set){
           // System.out.println(x+" ");//8 9 12 TreeSet old. için doğal sıralama yaptı HashSet olsa hashTablosuna göre yapar
            if(x>27){
                set.remove(x);
            }
        }
        System.out.println(set);//set.remove ile sildiği için kodumuz hata verir çalışmaz

        Set<Integer> set1=new HashSet<>();
        set.add(12);
        set.add(8);
        set.add(35);
        set.add(27);
        Iterator<Integer> iterator= set1.iterator();
        //8 12 27 35   [35,8,27,12]şeklinde sıralamış
        //System.out.println(iterator.next());//35 başta bu varmış nasıl sıraladığı belli değil SET olduğu için
        while (iterator.hasNext()){
            Integer sayi=iterator.next();
            if(sayi>25){
                //set1.remove(iterator.next());//Burada bir sonraki sayıyı sildi bulundugunu degil hata verir
                iterator.remove();//[8,12]
            }
        }
        System.out.println(set1);

        //4.forEach method that came with java 8 (lambda expression)

        set1.forEach(x-> System.out.println(x));

        List<String> list=Arrays.asList("Harrun","Ahmet","Mehmet");
        list.forEach(x-> System.out.println(x+" Hoşgeldiniz"));//Harun Hoşgeldiniz,Ahmet Hoşgeldiniz .. yazdırır

    }

}
