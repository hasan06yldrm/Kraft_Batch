package day53_ExceptionAndCollection_Summary;

import java.util.LinkedList;
import java.util.Queue;

public class C04_List_Summary_3 {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("Harun");
        queue.add("Ayşe");
        queue.add("Ziya");
        queue.add("Ümit");
        System.out.println(queue);//[harun,ayşe,ziya,ümit]
        //System.out.println(queue.peek());//harun- peek sadece getiriyor silmez ilk sıradakini
        System.out.println(queue);//[harun,ayse,ziya,ümit]
        //System.out.println(queue.poll());//harun - poll getirdi ve sildi
        System.out.println(queue);//[ayse,ziya,ümit]
        System.out.println(queue.offer("Mehmet"));//true -en sona mehmet ekleniyor
        System.out.println(queue);//[harun,ayse,ziya,ümit,mehmet]

    }
}
