// Activitat 22 — Mitjana de notes

import java.util.Scanner;

public class MitjanaNotes {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) amb un bucle, demana la nota de cada alumne i vés acumulant la suma
        //      en una variable (suma = suma + nota)
        //   3) calcula la mitjana dividint la suma entre N
        //   4) mostra: "La mitjana de les notes és: <mitjana>"

      Scanner teclat = new Scanner(System.in);

        // 1. Demanar el nombre d'alumnes
        System.out.println("Quants alumnes hi ha?");
        int n = teclat.nextInt();

        // 2. Acumular les notes
        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Introdueix la nota de l'alumne " + i);
            double nota = teclat.nextDouble();

            suma = suma + nota;
        }

        // 3. Calcular la mitjana
        double mitjana = suma / n;

        // 4. Mostrar el resultat
        System.out.println("La mitjana de les notes és: " + mitjana);

    }
}

    

