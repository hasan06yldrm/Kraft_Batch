package day53_ExceptionAndCollection_Summary;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set_1 {
    public static void main(String[] args) {
        //2x+5x kafasına göre sıralar Random yapar ekleme sırasına dikkat etmez treeSet hariç tree sıralar büyük küçük diye

        Set<String> set=new TreeSet<>();

        set.add("5");
        set.add("5");//aynı olanın birini alır sadece
        set.add("6");
        set.add("3");
        set.add("9");
        //set.add("Harun");
        for (String a:set){
            System.out.println(a+" ");//3,5,6,9
        }



    }
}
