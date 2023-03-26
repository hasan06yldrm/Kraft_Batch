package day19_CustomMethods_Return;

public class Task {
    public static void main(String[] args) {
        System.out.println("nameOfTheDay(7) = " + nameOfTheDay(7));
        System.out.println(lastDigit(15, 15));
        System.out.println(primeNumber(5));
        System.out.println(negativeToPositive(-5));
        System.out.println(averageToNote(75,75,75));

    }
    //1.  Create a method that returns the name of the day based on the given number to the method

    public static String nameOfTheDay(int number) {
        String name = "";
        switch (number) {
            case 1:
                name = "Mon";
                break;
            case 2:
                name = "Tue";
                break;
            case 3:
                name = "Wed";
                break;
            case 4:
                name = "Thu";
                break;
            case 5:
                name = "Fri";
                break;
            case 6:
                name = "Sat";
                break;
            case 7:
                name = "Sun";
                break;
            default:
                name = "Invalid";


        }
        return name;


    }
    //Bir method yazın boolean değer dondursun ve 2 sayı
    //kabul etsin sayıların son rakamı aynı ise true farklı ise
    //false döndürsün.

    /**
     * Bir method yazın boolean değer dondursun ve 2 sayı
     * kabul etsin sayıların son rakamı aynı ise true farklı ise
     * false döndürsün.
     *
     * @param number1
     * @param number2
     * @return
     */
    public static boolean lastDigit(int number1, int number2) {
        boolean result;
        if (number1 % 10 == number2 % 10) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //Bir method yazın boolean değer döndürsün 1 sayı kabul
    //etsin asal sayı ise true versin

    /**
     * Bir method yazın boolean değer döndürsün 1 sayı kabul
     * etsin asal sayı ise true versin
     * @param number
     * @return
     */
    public static boolean primeNumber(int number) {
        boolean result=true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }

        }
        return result;
    }


    //Bir method yazın ve verdiğiniz sayıyı negatifse pozitif e
    //pozitifse pozitif  olarak versin.

    public static int negativeToPositive(int num){
        int result;
        if(num<0){
            result=-(num);
        }else{
            result=num;
        }
        return result;
    }

    //Bir method yazın dönüş tipi char olsun. 3 ders notu kabul
    //etsin ve ortalamayı harf cinsinden döndürsün .
    //Not aralığı Harf karşılığı
    //76-100 A
    //51-75  B
    //0- 50  C

    public static char averageToNote(int score1,int score2,int score3){

       int ortalama=(score1+score2+score3)/3;
       char note;
        if(ortalama>=76){
            note='A';
        }else if(ortalama>=51){
            note='B';
        }else{
            note='C';
        }
        return note;
    }


}
