package day52_Collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListPalindrome {
    public static void main(String[] args) {
            //Object Classıyla istediğimizi koyarız
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("kazık","adanada","kazak","radar","ses","harun","ses","radar"));
        System.out.println(findPalindromeInList(list));


    }
    public static String findPalindromeInList(List<String> list){
        String result="";
        for (int i =0 ; i <list.size()-1 ; i++) {
            String str=list.get(i);
            String reverse="";
            for (int j = str.length()-1; j >=0 ; j--) {
                reverse+=str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse)){
                result+=str+" ";
                list.removeAll(Arrays.asList(str));
                i--;
            }
        }

        return result;
    }
//    public static List<String> findPalindromeInList(List<String> list){
//        String result="";
//        for (int i =0 ; i <list.size()-1 ; i++) {
//            String str=list.get(i);
//            String reverse="";
//            for (int j = str.length()-1; j >=0 ; j--) {
//                reverse+=str.charAt(j);
//            }
//            if(str.equalsIgnoreCase(reverse)){
//                result+=str+" ";
//                list.removeAll(Arrays.asList(str));
//                i--;
//            }
//        }
//
//        return result;
//    }
}
//list içerisinde bulunan palindrom (terside kendisi ile aynı olan kelimeler)
//kelimeleri String olarak dönen metodu yaziniz.(Aynı kelimeleri ekrana yazmasın)
//kazık,adanada,kazak,radar,ses,harun
//adanada,kazak,radar,ses,aga,ada


