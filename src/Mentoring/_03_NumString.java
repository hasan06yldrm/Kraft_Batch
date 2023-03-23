package Mentoring;

public class _03_NumString {
    public static void main(String[] args) {

        String str="65";
        int i=65;
        //int toplam=i+str;

        //kelimenin sayıya çevrilmesi
        int strToNum=Integer.parseInt(str);
        System.out.println("strToNum = " + strToNum);
        System.out.println("str = " + str);

        int toplam=i+strToNum;
        System.out.println("toplam = " + toplam);

        //sayının kelimeye çevrilmesi
        String numtoStr=Integer.toString(i);
        System.out.println("numtoStr = " + numtoStr);
        //int toplam3=i+numtoStr;

        /*
        Samsung s8 128GB aht,2500,655231,
        Samsung s8 64GB aht,30000,655531,
        Samsung s8 128GB aht,2750,654535,
        Samsung s8 256GB aht,3250,654231,

        */

    }
}
