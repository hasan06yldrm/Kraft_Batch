package day51_Collection_List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        List<String> letters=new LinkedList<>();
        letters.add("K");
        letters.add("R");
        letters.add("A");
        letters.add("F");
        letters.add("T");
        letters.add("T");
        letters.add("E");
        letters.add("C");
        letters.add("H");
        System.out.println("letters.indexOf(\"R\") = " + letters.indexOf("R"));//1
        System.out.println("letters.indexOf(\"T\") = " + letters.indexOf("T"));//4
        System.out.println("letters.lastIndexOf(\"T\") = " + letters.lastIndexOf("T"));//5

        System.out.println(letters);//[K,R,A,F,T,T,E,C,H]
        letters.add("S");
        System.out.println(letters);//[K,R,A,F,T,T,E,C,H.S]
        letters.set(3,"L");
        System.out.println(letters);//[K,R,A,L,T,T,E,C,H.S]
        letters.add(4,"L");
        System.out.println(letters);//[K,R,A,L,L,T,T,E,C,H.S]

        List<String> target=new LinkedList<>();
        target.addAll(Arrays.asList("R","T","L","Q"));
        System.out.println(target);//[R,T,S,L]
        System.out.println("letters.containsAll(target) = " + letters.containsAll(target));//true harflerin hepsi digerinin icinde var
        System.out.println("letters.retainAll(target) = " + letters.retainAll(target));//true [R,L,L,T,T] kalsın dursun demek 2 tane A da dursun gibi
        System.out.println(letters);
        System.out.println("letters.removeAll(target) = " + letters.removeAll(target));
        System.out.println(letters);//[] cıkardı hepsini aynilari



    }
}
