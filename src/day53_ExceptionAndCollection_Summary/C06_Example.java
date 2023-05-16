package day53_ExceptionAndCollection_Summary;

import day26_String_Lab.String_Lab;

import java.util.*;

public class C06_Example {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("kazık","adanada","kazak","radar","ses","harun","ses","radar"));
        polindrom(list);

        List<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(2,2,5,6,9,5,8,4,6));
        uniqSayilar(list1);


    }
    public static void polindrom(List<String> list) {
        Set<String> resultSet = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(reverse(list.get(i)))) {
                resultSet.add(list.get(i));
            }

        }
        for (String str : resultSet) {
            System.out.print(str + " ");
        }
    }
    //List in içindeki eşi olmayan(çifti olmayan) uniq sayıları bulun list olarak döndürelim
    //2,2,5,6,9,5,8,4,6

    public static List<Integer> uniqSayilar(List<Integer> list){
        int count=list.size();
        List<Integer> resultList=new ArrayList<>();

        while (!list.isEmpty()){
            int deger=list.get(0);
            list.removeAll(Arrays.asList(list.get(0)));
            if(list.size()==count-1){
                resultList.add(deger);
            }
            count=list.size();
        }
        return resultList;
    }

    public static String reverse(String str) {
        try {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
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

//list içerisinde bulunan palindrom (terside kendisi ile aynı olan kelimeler)
//kelimeleri String olarak dönen metodu yaziniz.(Aynı kelimeleri ekrana yazmasın)
//kazık,adanada,kazak,radar,ses,harun
//adanada,kazak,radar,ses,aga,ada

