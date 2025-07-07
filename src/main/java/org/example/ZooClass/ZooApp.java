package org.example.ZooClass;

import java.util.Scanner;

public class ZooApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EnclosDesLions enclosLions = new EnclosDesLions();
        EnclosDesElephants enclosElephants = new EnclosDesElephants();

        while (true) {
            System.out.println("\n--- Menu du Zoo ---");
            System.out.println("1. Créer un lion");
            System.out.println("2. Créer un éléphant");
            System.out.println("3. Voir enclos des lions");
            System.out.println("4. Voir enclos des éléphants");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Absorbe le retour à la ligne

            switch (choix) {
                case 1:
                    System.out.print("Nom du lion : ");
                    String nomLion = scanner.nextLine();
                    System.out.print("Âge du lion : ");
                    int ageLion = scanner.nextInt();
                    scanner.nextLine();
                    Lion lion = new Lion(nomLion, ageLion);
                    enclosLions.ajouterAnimal(lion);
                    break;
                case 2:
                    System.out.print("Nom de l'éléphant : ");
                    String nomElephant = scanner.nextLine();
                    System.out.print("Âge de l'éléphant : ");
                    int ageElephant = scanner.nextInt();
                    System.out.print("Poids de l'éléphant : ");
                    double poids = scanner.nextDouble();
                    scanner.nextLine();
                    Elephant elephant = new Elephant(nomElephant, ageElephant, poids);
                    enclosElephants.ajouterAnimal(elephant);
                    break;
                case 3:
                    enclosLions.afficherAnimaux();
                    break;
                case 4:
                    enclosElephants.afficherAnimaux();
                    break;
                case 5:
                    System.out.println("Fermeture du zoo. À bientôt !");
                    return;
                default:
                    System.out.println("Choix invalide !");
            }
        }
    }
}
