// Activitat 13 — Taula de multiplicar, amb comptador d'errors

import java.util.Scanner;

public class TaulaMultiplicarErrors {
    public static void main(String[] args) {
        // TODO: llegeix un número per teclat i, amb un bucle, pregunta la seva taula
        //   de multiplicar (de l'1 al 10): mostra "numero × i = " (amb print, sense
        //   salt de línia), llegeix la resposta de l'usuari i digues si és "correcte!"
        //   o "incorrecte!" (comptant els errors amb un comptador que s'incrementi
        //   ell mateix d'un en un)
        //   Al final, mostra: "Has comès X errors!"

        Scanner sc = new Scanner(System.in);

        System.out.println("Entra un número:");
        int numero = sc.nextInt();

        int errors = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print(numero + " * " + i + " = ");

            int resposta = sc.nextInt();

            int resultat = numero * i;

            if (resposta == resultat) {
                System.out.println("correcte!");
            } else {
                System.out.println("incorrecte!");
                errors++;
            }
        }

        System.out.println("Has comès " + errors + " errors!");

    
    }
}
    

