package day54_LoopsAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_MapExample {

    public static void main(String[] args) {
     /*   Map<String,String> map=new HashMap<>();

        map.put("12345","Harun");
        map.put("123456","Harun2");
        map.put("1234567","Harun3");
       // map.put("12345","Harun");
        System.out.println(map.get("123456"));//Harun2
        System.out.println(map.get("123457"));//Harun3
        */

        //manav meyveler ve fiyatlar

        Map<String,Double> meyveFiyat=new HashMap<>();
        meyveFiyat.put("Elma",3.75);
        meyveFiyat.put("Elma",3.90);//elma da bu ikinci alınır üzerine yazıldı 1.nin
        meyveFiyat.put("Muz",56.90);
        meyveFiyat.put("Çilek",50.0);
        meyveFiyat.put("Armut",30.30);
        meyveFiyat.put("Muz",60.05);
        System.out.println(meyveFiyat);//hepsini yazar key ve value değerini yani
        System.out.println(meyveFiyat.get("Armut"));//30.3
        System.out.println(meyveFiyat.get("Muz"));//56.9

        //  meyveFiyat.remove("Elma");//elma silindi
       // meyveFiyat.clear();//hepsi gitti

       // System.out.println(meyveFiyat.containsKey("Elma"));//true
      //  System.out.println(meyveFiyat.containsValue(30.30));//true
       Set<String> set=meyveFiyat.keySet();//BÜTÜN KEY LERİ set İN İÇİNE ATTI BU set le İŞLEM YAPABİLİRİZ ARTIK
      // set.forEach(x-> System.out.println(x));//armut muz çilek elma keyleri aldığı için sadece keyler yazıldı

        for (String str: set) {  //BU DA TÜM VALUE LARI GETİRMEK İÇİN YAPILDI
            System.out.println(meyveFiyat.get(str));//30.3 60.05 50.0 3.9
        }

        // TreeMap {Armut=30.3, Elma=3.75, Muz=56.9, Çilek=50.0}
        //HashMap  {Armut=30.3, Muz=56.9, Çilek=50.0, Elma=3.75}

      //  System.out.println(meyveFiyat);
     //   System.out.println(meyveFiyat.get("Muz"));


    }
}
/*
* Süslü parantezler {} MAP İ TEMSİL EDER {} GÖRÜNCE BU MAP DEMEKTİR
* Köşeli parantezler [] ise ARRAY İ TEMSİL EDER
* */

//    {     KEY   VALUE
//        "count":12345
//
//    } MAP
