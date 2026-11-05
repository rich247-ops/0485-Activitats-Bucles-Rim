// Activitat 26 — Mitjana, nota més gran i nota més petita

import java.util.Scanner;

public class NotesMitjanaMaxMin {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) llegeix la primera nota i inicialitza amb ella suma, notaMajor i notaMenor
        //   3) amb un bucle, per a la resta d'alumnes: llegeix la nota, acumula-la a
        //      suma, i actualitza notaMajor/notaMenor si cal (comparant-la)
        //   4) calcula la mitjana (suma / N)
        //   5) mostra la mitjana, la nota més gran i la nota més petita

             Scanner teclat= new Scanner(System.in);
             System.out.println("Quants alumnes hi ha al grup?");
        int n = teclat.nextInt();

        double suma = 0;
        double max = 0;
        double min = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Entra la nota de l'alumne " + i + ":");
            double nota = teclat.nextDouble();

            suma = suma + nota;

            if (i == 1) {
                max = nota;
                min = nota;
            } else {
                if (nota > max) {
                    max = nota;
                }

                if (nota < min) {
                    min = nota;
                }
            }
        }

        double mitjana = suma / n;

        System.out.println("La mitjana de les notes és: " + mitjana);
        System.out.println("La nota més gran és: " + max);
        System.out.println("La nota més petita és: " + min);

       
    }
}