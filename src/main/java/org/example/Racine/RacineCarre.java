package org.example.Racine;

import java.util.Scanner;

public class RacineCarre {
    public static void demanderEtCalculer() {
        Scanner scanner = new Scanner(System.in);
        boolean saisieValide = false;
        double nombre = 0;

        while (!saisieValide) {
            System.out.println("entrez un nombre entier positif : ");
            String saisie = scanner.nextLine();

            try {
                nombre = Double.parseDouble(saisie);
                if (nombre < 0) {
                    throw new IllegalArgumentException("le nombre doit être positif");
                }
                saisieValide = true;
            } catch (NumberFormatException e) {
                System.out.println("erreur rentrer une valeur numérique");
            } catch (IllegalArgumentException e) {
                System.out.println("erreur : " + e.getMessage());
            }
        }
        double racine = Math.sqrt(nombre);
        System.out.println("la racine carré de " + nombre + " est : " + racine);
        scanner.close();
    }
}
