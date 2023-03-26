package day19_CustomMethods_Return;

public class C07_Initials {
    //1.Create a method that can display the initials of the person. initials(String first name,String lastName)
    public static void main(String[] args) {
        initials("ahmet","oztürk");
    }
    public static String initials(String firstName,String lastName){
        String result=";";
        result=firstName.charAt(0)+"."+lastName.charAt(0);
        result=result.toUpperCase();
        return result;
    }
}
