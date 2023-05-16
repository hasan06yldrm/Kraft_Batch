package day52_Collection2;

import java.util.*;

public class C03_SetPractice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));

        System.out.println("list = " + list);//tekrar eden etmeyen hepsini yazdırır
        System.out.println("list.get(3) = " + list.get(3));//400

        System.out.println("------------------------");
        Set<Integer> hashSet=new HashSet<>();          //RANDOM
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(null,null,null));//null verir bir tane
        System.out.println("hashSet = " + hashSet);//[400,50,100,70,200,600,10,90,30,15] random ama aynıları yazdırmaz

        Set<Integer> linkedHashSet=new LinkedHashSet<>();//Insert Order Preserved geliş sırasını korur önemli
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(null,null,null,null));//null 1 tane
        System.out.println("linkedHashSet = " + linkedHashSet);

        Set<Integer> treeSet=new TreeSet<>();  //Sorted Ascending(Artan şekilde sıralı)
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        //treeSet.addAll(Arrays.asList(null,null,null));//runtime error tree set does not accept null values **null hiç almaz
        System.out.println("treeSet = " + treeSet);//sıralı bir şekilde verir

        String str=null;
        System.out.println("str.charAt(0) = " + str.charAt(0));//NullPointerException hatası


    }
}
