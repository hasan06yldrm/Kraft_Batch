package day53_ExceptionAndCollection_Summary;

import java.util.*;

public class C03_List_Summary_2 {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();
        arrayList.add("harun");
        linkedList.add("harun");
        arrayList.add("Mehmet");
        linkedList.add("Mehmet");
        System.out.println(arrayList);//harun,mehmet
        System.out.println(linkedList);//harun,mehmet
        System.out.println(arrayList.get(1));//mehmet
        System.out.println(linkedList.get(1));//mehmet

        Stack<Integer> stack=new Stack<>();
        System.out.println(stack.capacity());//10 default
        stack.add(25);
        stack.add(50);
        stack.add(75);
        System.out.println(stack.firstElement());//25
        System.out.println(stack.elementAt(1));//50
        System.out.println(stack);//[25,50,75]
        System.out.println(stack.pop());//75 son geleni silip getirecek
        System.out.println(stack);//75 gitti [25,50]
        System.out.println(stack.push(80));//80 i dahil ettik
        System.out.println(stack);//[25,52,80]
        System.out.println(stack.peek());//en üsttekini atmadan döndürüyor 80 i yani
        System.out.println(stack);


    }
}
