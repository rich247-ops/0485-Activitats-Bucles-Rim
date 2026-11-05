// Activitat 19 — Taula de multiplicar amb comptador d'errors, amb for

import java.util.Scanner;

public class TaulaMultiplicarErrorsFor {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 13, però implementat fent servir un bucle for.
        //   Llegeix un número per teclat i, amb un for (de l'1 al 10), pregunta la
        //   seva taula de multiplicar: mostra "numero × i = " (amb print, sense
        //   salt de línia), llegeix la resposta i digues "correcte!" o "incorrecte!"
        //   (comptant els errors). Al final: "Has comès X errors!"

        Scanner sc = new Scanner(System.in);

        System.out.println("Entra un número:");
        int numero = sc.nextInt();

        int errores = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print(numero + " * " + i + " = ");

            int respuesta = sc.nextInt();

            if (respuesta == numero * i) {
                System.out.println("correcte!");
            } else {
                System.out.println("incorrecte!");
                errores++;
            }
        }

        System.out.println("Has comès " + errores + " errors!");

      
    }
}
        
        
        
      
