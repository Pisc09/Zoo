package org.example.ZooClass;

public class Lion extends Animal {
    private String nom;
    private int age;

    public Lion(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public String toString()  {
        return "Lion{" + "nom=" + nom + ", age=" + age + '}';
    }

    @Override
    public void manger()  {
        System.out.println(nom + " manger");
    }

    @Override
    public void dormir() {
        System.out.println(nom + " dormir");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " faire duBruit");
    }
}
