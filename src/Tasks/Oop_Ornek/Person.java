package Tasks.Oop_Ornek;

public class Person {

    String name;
    String surName;
    int id;
   private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void createld() {
        System.out.println("Oluşturuldu");

    }

}
