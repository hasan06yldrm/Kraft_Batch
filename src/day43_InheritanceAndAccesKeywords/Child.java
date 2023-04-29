package day43_InheritanceAndAccesKeywords;

public class Child extends Parent{
    int y;

    public Child(String parentName){
        super(parentName);
    }

    public void childMethod(int x){
        System.out.println(x);//Parent x aldı superle
    }
}
