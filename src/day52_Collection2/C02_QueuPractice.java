package day52_Collection2;

import java.util.*;

public class C02_QueuPractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQue=new PriorityQueue<>();
        priorityQue.addAll(Arrays.asList(20,150,200,40,120));
        priorityQue.add(30);
        System.out.println(priorityQue);//[20,40,30,200,150,120] random order kafasına göre yapti

        Queue<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(20,150,200,40,120));//preserve insertion order
        arrayDeque.add(30);
        System.out.println(arrayDeque);//[20,150,200,40,120,30] sirayi korudu

        Queue<Integer> linkedList=new LinkedList<>();
        linkedList.addAll(Arrays.asList(20,150,200,40,120));
        linkedList.add(30);//30 u en sona yazar
        System.out.println(linkedList);//siralamayi korur

        System.out.println("----------------------");

        //priorityQue.get(1); index yok
       // arrayDeque.get(2); index yok
        ((List)linkedList).get(1);
        System.out.println("priorityQue.peek() = " + priorityQue.peek());//20 fifo
        System.out.println(priorityQue);
        System.out.println("priorityQue.poll() = " + priorityQue.poll());//first element will be removed
        System.out.println("priorityQue = " + priorityQue);//20 cikti gerisi yazildi
        System.out.println("priorityQue.peek() = " + priorityQue.peek());//30 peek sadece belirtiyor başka birşey yapmıyor

        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());//20 yi aldı
        System.out.println(arrayDeque);//20 çikti 150 den devam eder
        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());//150
        System.out.println(arrayDeque);//150 cıktı 200 den devam ederek yazar

        System.out.println("linkedList.poll() = " + linkedList.poll());//20 FIFO first in first out
        System.out.println(linkedList);//20 cıktı gerisi devam eder

        System.out.println("((List)priorityQue).get(1) = " + ((List) priorityQue).get(1));//runtime error da hata verir


    }
}
