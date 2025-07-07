package org.example.ZooClass;

public class Elephant extends Animal {
    private String nom;
    private int age;
    private double poids;

    public Elephant(String nom, int age, double poids) {
        this.nom = nom;
        this.age = age;
        this.poids = poids;
    }

    @Override
    public String toString()  {
        return "Eléphant{" + "nom=" + nom + ", age=" + age + ", poids=" + poids + '}';
    }

    @Override
    public void manger() {
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

