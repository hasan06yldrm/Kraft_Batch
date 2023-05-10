package Mentoring.Inheritance;
class A{

}
class B extends A{

}
class C extends B{//MULTİ LEVEL AMA A DESEYDİK SİNGLE OLURDU TEK BABA ÇÜNKÜ
    //class C extends A,B{} //Ambiguity Problem

}
public class Demo1 {
    public static void main(String[] args) {

    }
}
/*
1.değişken final ise ---DEĞİŞTİRİLEMEZ PI GIBI
2.class final ise-------Inheritance edilemez KISIRDIR yas 70 iş bitmiş
3.metod final ise-------Override edilemez

   PUBLİC          PRİVATE     Protected           Default

1. same class                 Yes              Yes          Yes             Yes

2. same package               Yes             No
    subclass                  Yes             No            Yes             yes
    non subclass              Yes             No            Yes             yes

 3. different package          Yes             No
     subclass                  Yes             No           Yes             No
     non subclass              Yes             No           No              No
 */
