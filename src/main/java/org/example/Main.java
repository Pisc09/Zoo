package org.example;

import org.example.ZooClass.Elephant;
import org.example.ZooClass.EnclosDesElephants;
import org.example.ZooClass.EnclosDesLions;
import org.example.ZooClass.Lion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EnclosDesLions enclosDesLions = new EnclosDesLions();
        EnclosDesElephants enclosDesElephants = new EnclosDesElephants();

        Lion lion1 = new Lion("simba", 9);
        Elephant elephant1 = new Elephant("dumbo", 5, 1000.0);

        enclosDesLions.ajouterAnimal(lion1);
        enclosDesElephants.ajouterAnimal(elephant1);

        System.out.println("\n---Zoo---");
        enclosDesLions.afficherAnimaux();
        enclosDesElephants.afficherAnimaux();
    }
}