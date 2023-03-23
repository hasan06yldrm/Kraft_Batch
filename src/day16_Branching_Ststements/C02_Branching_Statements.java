package day16_Branching_Ststements;

import java.util.Scanner;

public class C02_Branching_Statements {
    public static void main(String[] args) {

        //break  continue  return:metodu sonlandırır
       /* System.out.println("Program basladı");

        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0) {
                continue;
            }
            if (i > 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("Program sonlandı");

        //0 ve 20 dahil aradaki çift sayıların toplamını ekrana yazdıran programı yazdırın

        int sum=0;

        for (int i = 0; i <=20 ; i+=2) {
            sum+=i;
        }

        System.out.print(sum+" ");

        int sum=0;

        for (int i = 0; i <=20 ; i++) {
            if(i%2==0)
            sum+=i;
        }

        System.out.print(sum);

    int sum=0;
        for (int i = 0; i <=20 ; i++) {
            if(i%2==1){
                continue;//tek sayıları atlayıp çiftleri yazdırıyor
            }
            sum+=i;

        }
        System.out.println(sum);

        //1 den 100 kadar 5 in katlarını ekrana yazdıran programı continue kullanara yazınız

        for (int i = 1; i <=100 ; i++) {
            if(!(i%5==0)){
                continue;
            }
            System.out.println(i+" ");
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("B");
            for (int j = 0; j < 3; j++) {
                if(j==1){
                    break;
                }
                System.out.println("A");
            }
        }


         for(int i = 0; i < 2; i++) {
            System.out.print("B");
            for (int j = 0; j < 10; j++) {
                if(j==5){
                    System.out.println("C");
                    break;
                }
                if(j>2){
                    continue;
                }

                System.out.print("A");
            }
        }

        System.out.println("----------------------------------------");

        // Şifre tanımlayın ve kullanıcıya ekrandan
        // 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
        // Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.
        Scanner scan=new Scanner(System.in);
        String sifre="Harun123";
        int i=0;
        System.out.println("5 hakkın var");
        while(i<5){
            System.out.print(i+1+".Tahmin: ");
            String tahmin=scan.next();
            if(tahmin.equals(sifre)){
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if (i==5){
                System.out.println("hatalı tahmin hakkınız doldu");
                break;
            }
            System.out.println("Hatalı tekrar deneyiniz");

        }


        Scanner scan=new Scanner(System.in);
        boolean flag=true;
        String sifre="Harun123";
        int i=0;
        System.out.println("5 hakkın var");
        while(i<5){
            System.out.print(i+1+".Tahmin: ");
            String tahmin=scan.next();
            if(tahmin.equals(sifre)){
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if (i==5){
                System.out.println("hatalı tahmin hakkınız doldu");
                flag=false;
                continue;
            }
            System.out.println("Hatalı tekrar deneyiniz");

        }
         String sifre="Hasan";
      int hak=5;
      boolean result=true;
        int i=0;
      while(true){
          System.out.print("Şifreyi giriniz: ");
          String x=scan.next();
          if(!(x.equals("Hasan"))) {
              if(hak==0){
                  break;
              }
              System.out.println("Şifre doğru değildir.Kalan hakkınız : " + --hak);
              continue;


          }
              System.out.println("Tebrikler");
              break;

      }
        System.out.println();  */


        //Nested loop kullanarak kullanıcıdan hangi işlemi yapmak
// istediğini sorun. "1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış"
// kullanıcının isteğine göre işlem yapın. Kullanıcının seçimine göre Girilen ekrandan
// 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç 0  devam etmek için 1 girmesini isteyin.


        // 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
        // çıkarma menüsüne hoş geldiniz
        // x:
        // y:
        // result;
        // menüden çıkmak için 0 işlemlere devam etmek için 1 giriniz
        Scanner scan = new Scanner(System.in);
     outerLoop:   while (true) {
            System.out.print("(1)toplama,(2)Çıkarma ,(3)çarpma, (4)bölme, (5)çıkış");
            int tercih = scan.nextInt();
            if (tercih == 1) {
                while (true) {
                    System.out.println("1.sayı:");
                    int x = scan.nextInt();
                    System.out.println("2.sayı: ");
                    int y = scan.nextInt();
                    System.out.println("İşlem sonucu: " + (x + y));
                    System.out.println("Bir üst menü için 0 işleme devam etmek için 1 basınız");
                    int tercih2 = scan.nextInt();
                    if (tercih2 == 0) {
                        break;
                    } else if (tercih2 == 1) {
                        continue;
                    } else {
                        System.out.println("hatalı işlem nedeniyle çıkış yapılıyor");
                        break outerLoop;
                    }
                }

            }else if(tercih == 2) {
                while (true) {
                    System.out.println("1.sayı:");
                    int x = scan.nextInt();
                    System.out.println("2.sayı: ");
                    int y = scan.nextInt();
                    System.out.println("İşlem sonucu: " + (x - y));
                    System.out.println("Bir üst menü için 0 işleme devam etmek için 1 basınız");
                    int tercih2 = scan.nextInt();
                    if (tercih2 == 0) {
                        break;
                    } else if (tercih2 == 1) {
                        continue;
                    } else {
                        System.out.println("hatalı işlem nedeniyle çıkış yapılıyor");
                        break;
                    }
                }
            }else if(tercih == 3) {
                while (true) {
                    System.out.println("1.sayı:");
                    int x = scan.nextInt();
                    System.out.println("2.sayı: ");
                    int y = scan.nextInt();
                    System.out.println("İşlem sonucu: " + (x * y));
                    System.out.println("Bir üst menü için 0 işleme devam etmek için 1 basınız");
                    int tercih2 = scan.nextInt();
                    if (tercih2 == 0) {
                        break;
                    } else if (tercih2 == 1) {
                        continue;
                    } else {
                        System.out.println("hatalı işlem nedeniyle çıkış yapılıyor");
                        break;
                    }
                }
            }else if(tercih==4){
                break;
            }else{
                System.out.println("Hatalı işlem tekrar deneyin");
            }














        }
    }
}