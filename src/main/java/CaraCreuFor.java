// Activitat 20 — Cara o creu, 100 llançaments, amb for

import java.util.Random;
import java.util.Scanner;

public class CaraCreuFor {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 11, però implementat fent servir un bucle for.
        //   Simula 100 llançaments d'una moneda amb Random (0 = cara, 1 = creu)
        //   comptant quantes vegades surt creu amb un comptador (comptador++)
        //   i calcula les cares com 100 - creus
        //   Mostra: "Cares: X" i "Creus: Y"
        Scanner teclat= new Scanner(System.in);

           Random random = new Random();

        int creus = 0;

        for (int i = 0; i < 100; i++) {

            int moneda = random.nextInt(2);

            if (moneda == 0) {
                // Cara
            } else {
                creus++;
            }
        }

        int cares = 100 - creus;

        System.out.println("Cares: " + cares);
        System.out.println("Creus: " + creus);
    }
}