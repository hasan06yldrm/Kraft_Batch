package Mentoring;

public class ArraysTask2 {
    public static void main(String[] args) {
        String[] cars={"Totota","Honda","BMW","Mercedes","Nissan"};
        System.out.println(arraydeArama(cars, "Honda"));

        boolean bl=false;
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].equalsIgnoreCase("Honda")){
                bl=true;
            }
        }
        if(bl){
            System.out.println("Bu marka araç bulunmaktadır");
        }else{
            System.out.println("Bu marka araç bulunmamaktadır");
        }
    }
    public static boolean arraydeArama(String[] array,String arananKelime){

        boolean bl=false;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equalsIgnoreCase(arananKelime)){
                bl=true;
            }
        }

        return bl;
    }
}
