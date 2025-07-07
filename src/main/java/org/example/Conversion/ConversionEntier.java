package org.example.Conversion;

import java.util.Scanner;

public class ConversionEntier {
    public static void demanderEtConvertir() {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean saisieValide = false;

        while(!saisieValide) {
            System.out.println("entrez un nombre valide : ");
            String saisie = scanner.nextLine();

            try {
                nombre = Integer.parseInt(saisie);
                saisieValide = true;
            }catch (NumberFormatException e) {
                System.out.println("ce n'est pas un nombre entier. Veuillez réessayer : ");
            }
        }

        System.out.println("vous avez saisie : " + nombre);
        scanner.close();
    }
}
