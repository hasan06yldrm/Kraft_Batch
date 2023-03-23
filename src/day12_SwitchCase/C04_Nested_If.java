//package day12_SwitchCase;
//
//import java.util.Scanner;
//
//public class C04_Nested_If {
//    public static void main(String[] args) {
//       /* //Bir restorana girişte kullanıcıya 18 yaşında olup olmadığını
//        //sorun 18 yaşın altında is giremezsiniz şeklinde ikaz verip programı
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Yaşınız");
//        int yas=scan.nextInt();
//        int yas=18;
//
//        if (yas>18){
//            System.out.println("Hoş geldiniz");
//        }else{
//            System.out.println("Giremezsiniz");
//        } */
//
//        //Bir havuza girişte kullanıcıya 18 yaşında olup olmadığını
//        //sorun 18 yaşın altında is giremezsiniz şeklinde ikaz verip
//        //18 ve üzerinde ise yanında bayan olup olmadığını sorun
//        //bayan yok ise giremezsin
//        //bayan var ise yüzme bilip bilmediğini sorun
//        //yüzme bilmiyor ise almıyoruz
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Yaşınız");
//        int yas = scan.nextInt();
//        //int yas=18;
//
//        if (yas > 18) {
//            System.out.print("Yanınızda bayan var mı Evet/Hayır : ");
//            String yanit = scan.next();
//            if (yanit.equals("Evet")) {
//                System.out.println("Yüzme biliyor musunuz Evet/Hayır : ");
//                String yanit2=scan.next();
//                if(yanit2.equals("Evet")){
//                    System.out.println("Hoş geldiniz");
//                }else{
//                      System.out.println("Yüzme bilmeyenler giriş yapamaz");
//                }
//            } else {
//            System.out.println("Yanınızda bayan olmadığı için giremezsiniz");
//            }
//
//        }else {
//             System.out.println("Giremezsiniz");
//        }
//
//
//
//
//    }
//}
