package day51_Collection_List;

import java.util.*;

public class C03_List {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(5,10,15,20,25));

        list1.add(5);
        System.out.println(list1);//5,10,15,20,25,5
        System.out.println("list1.get(3) = " + list1.get(3));//20  ArrayList is better than linkedList wrt get() feature

        List<Integer> list2=new LinkedList<>();
        list2.addAll(Arrays.asList(5,10,15,20,25));
        list2.add(5);
        list2.add(9);                  // Linklist is faster than ArrayList wrt add() and remove()
        list2.remove(list2.indexOf(9));//
        System.out.println(list2);//[5,10,15,20,25,5] LinkedList aynı ArrayList gibi yazdırdı
        System.out.println("list2.get(3) = " + list2.get(3));//5

        List<Integer> list3=new Vector<>();
        list3.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println(list3.get(2));//15

        List<Integer> list4=new Stack<>();
        list4.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println(list4.get(2));//15

        System.out.println("--------------------------");
        System.out.println(list4);//[5,10,15,20,25]
        System.out.println(((Stack) list4).pop());//25 LIFO Last In First Out oldugu icin en sondaki yani yiginin en üstündekini ilk atti
        System.out.println(((Stack) list4).peek());//20 çıkacak sayıyı bildiriyor sadece
        System.out.println(list4);
        System.out.println(list4);//[5,10,15,20]
        System.out.println(((Stack) list4).push(60));//60
        System.out.println(list4);//[5,10,15,20,60]

        System.out.println(((Stack<Integer>) list4).peek());//down casting 60
    }
}
