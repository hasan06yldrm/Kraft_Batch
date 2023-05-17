package day55_MapAndFinish;

import java.util.*;

public class C03_MapMethods {
    public static void main(String[] args) {
        //put(),get(),values(),keyset(),clear(),containsKey(),remove(),entrySet(),equals(),forEach(),
        //putAll(),isEmpty(),replace()

        Map<Integer,String> map=new TreeMap<>();//KEY lere göre dogal sıralama
        map.put(12,"Harun koc");
        map.put(13,"Ziya aslan");
        System.out.println(map.get(13));//ziya aslan

        Map<Integer,String> map2=new TreeMap<>();
        map2.put(12,"Harun koc");
        map2.put(13,"Ziya aslan");
        System.out.println(map.get(13));

        System.out.println(map.values());//[harun koc, ziya aslan] map.values yaptıgı işlem aşagıdaki sonuclar da aynı
        Collection<String> collection=map.values();
        System.out.println(collection);//  [harun koc, ziya aslan]

        Set<Integer> set=map.keySet();
        List<Integer> list=new ArrayList<>();
        set.forEach(x-> list.add(x));
        Collections.sort(list);
        //System.out.println(list);//[12,13]
        //System.out.println(Collections.max(map.keySet()));//13
        Integer id=Collections.max(map.keySet())+1;
        Integer id2=list.get(list.size()-1)+1;
        map.put(id,"Ayse yilmaz");

        //map.clear();
        map.containsKey(12);//true
        map.remove(12);
        System.out.println(map);//{13=Ziya aslan}
        System.out.println(map.remove(12));//sout ile yapınca 12 deki value degeri yazdırıp siliyor
        System.out.println(map);//{13=Ziya aslan}
        map.remove(12,"Mehmet taslı");//mehmet taslıyı silmedi
        System.out.println(map.remove(12, "Mehmet taslı"));//silme yapmadığı için FALSE döndürür
        System.out.println(map.put(12, "Harun koc"));//true aynısı old. için sildi
        System.out.println(map);//{13=Ziya aslan}

        System.out.println(map.entrySet());//[12=Harun koc, 13=Ziya aslan]
        Set<Map.Entry<Integer,String>> set1=map.entrySet();//böyle de oluyor
        System.out.println(map);//{12=Harun koc, 13=Ziya aslan}

        System.out.println(map.equals(map2));//true
        System.out.println(map);//{12=Harun koc, 13=Ziya aslan}

        map.forEach((k,v)-> System.out.println("key:"+ k+" value:"+ v));//key:12 value:Harun koc...
        System.out.println(map);//{12=Harun koc, 13=Ziya aslan}

        System.out.println(map.isEmpty());//false

        map.putAll(map2);//map2 deki tüm verileri map içine atar
        System.out.println(map);

        Map<Integer,String> map1=new TreeMap<>();
        map1.put(12,"Harun koc");
        map1.put(13,"Ziya aslan");
        map1.replace(12,"Ayse yılmaz");//{12=Ayse yılmaz, 13=Ziya aslan}
        System.out.println(map1.replace(12, "Ayse yılmaz"));//öncekini yazdırır Harun koc diye aşagıda da değştirdiğini yazıdırır String döndürür eski veriyi döndürür işlemi yapar
        System.out.println(map1);//{12=Ayse yılmaz, 13=Ziya aslan}
        map1.replace(12,"Ayse yılmaz","Emine hanım");//true değiştirdim dedi
        System.out.println(map1);//{12=Emine hanım, 13=Ziya aslan}


    }
}
