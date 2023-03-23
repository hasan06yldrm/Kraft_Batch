package day17_Medhods;

import java.util.Scanner;

public class C01_Bank_Question {
    public static void main(String[] args) {
        //   Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış  (money=2000)
        //  while işleme devam etmek için 1 e basın bir üst menü için 2 basın kart iade 3

        Scanner scan = new Scanner(System.in);
        double money = 2000;

      outerLoop:  while(true){
            System.out.println("1-Para ekle,2-Para çek,3-Bakiye,4-Çıkış");
            System.out.println("İşlemi seçiniz : ");
            int tercih=scan.nextInt();
            switch (tercih){
                case 1:
                    while(true){

                        System.out.println("Eklemek istediğiniz tutarı girin: ");
                        double para=scan.nextDouble();
                        money+=para;
                        System.out.println("Bir üst menü için 1, işleme devam 2");
                        int tercih2=scan.nextInt();
                        if(tercih2==1){
                            break;//continue outerLoop;
                        }else if(tercih2==2){
                            continue;
                        }else{
                            System.out.println("Hatalı işlem yapıldığı için kart iade ediliyor");
                            break outerLoop;
                        }
                    }
                    break;
                case 2:
                    while(true){

                        System.out.println("Çekmek istediğiniz tutarı girin: ");
                        double para=scan.nextDouble();
                        if(para>money){
                            System.out.println("Hesabınızda yeterli bakiye yoktur");
                            continue outerLoop;
                        }
                       money-=para;
                        System.out.println("Bir üst menü için 1, işleme devam 2");
                        int tercih2=scan.nextInt();
                        if(tercih2==1){
                            break;//continue outerLoop;
                        }else if(tercih2==2){
                            continue;
                        }else{
                            System.out.println("Hatalı işlem yapıldığı için kart iade ediliyor");
                            break outerLoop;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Bakiyeniz: "+money);
                    break;
                case 4:
                    break outerLoop;
                default:
                    System.out.println("Hatalı işlem tekrar deneyin");





            }
        }



















    }
}
