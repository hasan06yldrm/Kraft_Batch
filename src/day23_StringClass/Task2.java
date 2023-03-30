package day23_StringClass;

public class Task2 {
    public static void main(String[] args) {


        //Adınızın ve soyadınızın kaç karakterden oluştuğunu konsola yazdırın.
        //Adınızın ve soyadınızı büyük harfle yazdıran bir method yazın.
        String name = "Hasan";
        String surname = "Yıldırım";
        String result = name + " " + surname;
        System.out.println("result = " + result);
        System.out.println("result.length() = " + result.length());
        System.out.println("result.toUpperCase() = " + result.toUpperCase());

        System.out.println("--------------------------------");
        //Kullanıcıdan 3 kelime alın ve length i uzun olandan kısa
        //olana hepsini birleştirin. Concat() kullanın.
        String kelime1="Tekrar etmek";
        String kelime2="çok ama çok";
        String kelime3="önemlidir.";
        if(kelime1.length()>kelime2.length()&&kelime1.length()>kelime3.length()){
            System.out.println(kelime1.concat(" " + kelime2.concat(" " + kelime3)));
        }else if(kelime1.length()>kelime2.length()&&kelime3.length()>kelime2.length()){
            System.out.println(kelime1.concat(" " + kelime3.concat(" " + kelime2)));
        }else if(kelime2.length()>kelime1.length()&&kelime1.length()>kelime3.length()){
            System.out.println(kelime2.concat(" " + kelime1.concat(" " + kelime3)));
        }else if(kelime2.length()>kelime3.length()&&kelime3.length()>kelime1.length()){
            System.out.println(kelime2.concat(" " + kelime3.concat(kelime1)));
        }else if(kelime3.length()>kelime1.length()&&kelime1.length()>kelime2.length()){
            System.out.println(kelime3.concat(" " + kelime1.concat(kelime2)));
        }else{
            kelime3.concat(" "+kelime2.concat(kelime1));
        }

        System.out.println("-----------------------------------");
        //Bir method yazın ve verilen string in önünde ve arkasında
        //boşluk varsa boşlukları alıp geri döndürsün.

        String str="   Bjk,Gs,Fb.Ts       ";
        System.out.println("str.trim() = " + str.trim());

        System.out.println("----------------------------------------");
        //18/10/2022 20:50:55 tarih bildirimini tarih damgasına
        //döndürün 18102019145055
        String date="18/10/2022 20:50:55";
        System.out.println(date.replace("/", "").replace("22", "19").replace(" ","").replace("20:","14").replace(":",""));


        System.out.println("-----------------------------------------");
        //Kullanıcıdan 2 kelime yazmasını isteyin ilk kelimenin baş harfi
        //2. kelimede varsa index ini alın.
        String kelime4="şampiyon";
        String kelime5="beşiktaş";

        if(kelime4.contains("ş")==kelime5.contains("beşiktaş")){
            System.out.println("kelime5.indexOf(\"ş\") = " + kelime5.indexOf("ş"));
        }

    }

}
