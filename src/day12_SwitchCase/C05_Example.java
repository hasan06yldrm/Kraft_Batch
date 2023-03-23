package day12_SwitchCase;

public class C05_Example {
    public static void main(String[] args) {

        //öğrencinin ortalamasını alın
        //ortalama 50 altında ise zayıf
        //50 dahil 70 arası orta
        //70 dahil 85 arası iyi
        //85 ve üzeri pekiyi ekrana yazdırın
        //95 ve üzeri mi diye kontrol edin 95 ve üzerinde ise
        //onur belgesi almaya hak kazandınız

       /* double ort=75;

        if(ort>50){
            System.out.println("Zayıf");
        }else if(ort<=50&&ort<70){
            System.out.println("Orta");
        }else if(ort>=70&&ort<85){
            System.out.println("İyi");
        }else{
            System.out.println("Pekiyi");
        } */

        double ort=95;

        if(ort<50){
            System.out.println("Zayıf");
        }else if(ort<70){
            System.out.println("Orta");
        }else if(ort<85){
            System.out.println("İyi");
        }else{
            System.out.println("Pekiyi");
            if(ort>=95){
                System.out.println("Başarı belgesi almaya hak kazandınız");
            }
        }




    }
}
