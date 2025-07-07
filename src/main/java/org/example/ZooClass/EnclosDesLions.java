package org.example.ZooClass;

import java.util.ArrayList;
import java.util.List;

public class EnclosDesLions implements Enclos {
    private List<Animal> animals;

    public EnclosDesLions() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void ajouterAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("lion ajouté à l'enclos.");
    }

    @Override
    public void afficherAnimaux() {
        System.out.println("animaux dans l'enclos des lions :");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
