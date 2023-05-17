package day54_LoopsAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_CollectionSort {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(12,43,2,4,5,1,99,67);
      //  List<String> list2= Arrays.asList("harun","Ahmet");
        System.out.println(list.get(0));//12
        //System.out.println(list2.get(0));//harun

        Collections.sort(list);
        System.out.println(list.get(0));//1 sort sıraladı listin içeriği gitti ama
        //System.out.println(list2.get(0));//ahmet sıraladı

        // System.out.println(max(list));
      //  System.out.println(Collections.max(list));

    //    Collections.reverse(list);//67 en sondaydı
        int max=max2(list);
        System.out.println(list.get(0));//1 içerik değiştiği için 12 yerine 1 geldi

    }


    public static  int max2(List<Integer> list) {  //hatalı kullanım
        Collections.sort(list);
        return list.get(list.size()-1);

    }


   public static  int max(List<Integer> list) {
        List<Integer> copyList=new ArrayList<>();
       copyList.addAll(list);
        Collections.sort(copyList);
        return copyList.get(copyList.size()-1);

   }
}
