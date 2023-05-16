package day53_ExceptionAndCollection_Summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c02_List_Summary {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.addAll(Arrays.asList("Harun","Mehmet","Ahmet"));
        list.add("Celal");
        System.out.println(list);
        System.out.println(list.size());//4
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));//Harun gitti
        System.out.println(list);
        list.addAll(Arrays.asList("Harun","Mehmet","Ahmet"));
       // list.removeAll(Arrays.asList("Mehmet","Ahmet"));
        System.out.println(list);//harun ve celal kaldı
        list.retainAll(Arrays.asList("Mehmet","Ahmet"));//diğerlerini siler bunları silmez
        System.out.println(list);//mehmet ahmet mehmet ahmet
        System.out.println(list.contains("Harun"));
        list.containsAll(Arrays.asList("Mehmet","Ahmet","Mahmut"));
        System.out.println(list);//false mahmut olmadığı için
        list.clear();
        System.out.println(list);


    }
}
