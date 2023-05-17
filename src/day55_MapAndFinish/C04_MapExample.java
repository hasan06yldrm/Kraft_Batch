package day55_MapAndFinish;

import Tasks.Oop_Ornek.Person;

import java.util.*;

public class C04_MapExample {
    public static void main(String[] args) {

        Ogrenci ogrenci1=new Ogrenci("Harun","Koc",15);
        Ogrenci ogrenci2=new Ogrenci("Ayse","Calıskan",17);
        Ogrenci ogrenci3=new Ogrenci("Hatice","Akıllı",18);

        Map<Integer,Ogrenci> map=new HashMap<>();

        map.put(ogrenci1.getNo(),ogrenci1);
        map.put(ogrenci2.getNo(),ogrenci2);
        map.put(ogrenci3.getNo(),ogrenci3);

        map.get(18).ekleDers("Almanca");
        map.get(17).ekleDers("İngilizce");

        System.out.println(map.get(17).getIsim());//Ayse
        System.out.println(map.get(17).getDersler());//[İngilizce]

        System.out.println(map.get(17));//tüm bilgileri geldi Ogrenci{isim='Ayse', soyIsim='Calıskan', no=17, dersler=[İngilizce]}


        List<Ogrenci> list=new ArrayList<>();
        list.add(ogrenci1);
        list.add(ogrenci2);
        list.add(ogrenci3);

        for (int i = 0; i < list.size(); i++) { //bütün her yeri gezip de bulduk 18 no yu
            if(list.get(i).getNo()==18){
                list.get(i).ekleDers("Almanca");
                break;
            }
        }
        System.out.println(ogrenci3.getDersler());//[Almanca]


        Ogrenci ogrenci4=new Ogrenci("Harun","Koc",15);
        Ogrenci ogrenci5=new Ogrenci("Ayse","Calıskan",17);
        Ogrenci ogrenci6=new Ogrenci("Hatice","Akıllı",18);

        Map<Integer,Ogrenci> ogrenciler=new HashMap<>();

        ogrenciler.put(ogrenci1.getNo(),ogrenci1);
        ogrenciler.put(ogrenci2.getNo(),ogrenci2);
        ogrenciler.put(ogrenci3.getNo(),ogrenci3);

        Map<Integer, Person> personeller=new HashMap<>();
        Person person1=new Person();
        personeller.put(12,person1);


        List<Map> list1=new ArrayList<>();
        list1.add(ogrenciler);
        list1.add(personeller);

        Map<Integer, String> yeniMap=new HashMap<>();
        yeniMap.put(12,"Harun");
        yeniMap.put(3,"Çiçek");

        Map<String,Map<Integer,String>> map1=new TreeMap<>();

        map1.put("1234565",yeniMap);

        System.out.println(map1.get("1234565").get(12).equals("Harun"));//true


    }
}
