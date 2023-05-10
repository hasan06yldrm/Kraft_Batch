package day50_Exception_Collection;

import day21_Class_And_Object.Person;
import day43_InheritanceAndAccesKeywords.Vehicle;

import java.util.ArrayList;

public class C06_Collection {
    public static void main(String[] args) {
        ArrayList<Person> arrayList=new ArrayList<>();
        ArrayList<Integer> arrayList6=new ArrayList<>();
        ArrayList<String> arrayList1=new ArrayList<>();
        ArrayList<Person> arrayList2=new ArrayList<>();
        ArrayList<Vehicle> arrayList3=new ArrayList<>();
        ArrayList<Boolean> arrayList4=new ArrayList<>();
        ArrayList<Object> arrayList5=new ArrayList<>();

        Person person1=new Person();
        Person person2=new Person();
        Person person3=new Person();

        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);


        ArrayList<Integer> arrayList8=new ArrayList<>();
        arrayList8.add(25);
        arrayList8.add(25);
        arrayList8.add(35);

        ArrayList<Integer> arrayList9=new ArrayList<>();
        arrayList8.add(25);
        arrayList8.add(45);
        arrayList8.add(55);

        System.out.println(arrayList8.size());//2
        System.out.println(arrayList8.contains(25));//true
        arrayList8.addAll(arrayList9);//true
        //25,25,35,25,45,55
        //25,45,55  ,55
        System.out.println(arrayList8.isEmpty());
       //arrayList8.clear();
        //arrayList8.remove(0);//sola kayacak veriler 35 yazar
       // arrayList8.removeAll(arrayList9);//arr9 dakilerin aynısını arr8 in içinden bulup sildi ve sadece 35 kaldı arr9 aynı kaldı ama
       // System.out.println(arrayList8.get(0));//hata çünkü clear hepsini silmiştik
        //System.out.println(arrayList8);//35
       // System.out.println(arrayList8.contains(25));
        arrayList9.add(55);
        System.out.println(arrayList8.contains(arrayList9));//true hepsine tek tek bakar kaç tane olduğuna bakmaz


    }
}
