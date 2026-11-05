
import java.util.Scanner;

// Activitat 08 — Taula de multiplicar d'un número (per teclat)
public class TaulaMultiplicar {
    public static void main(String[] args) {
        // TODO: llegeix un número enter per teclat i, amb un bucle,
        //   mostra la seva taula de multiplicar (de l'1 al 10)
        //   amb el format: "numero × 1 = ...", ..., "numero × 10 = ..."

      Scanner sc = new Scanner(System.in);

        System.out.println("Entra un número:");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            int resultat = numero * i;

            System.out.println(numero + " * " + i + " = " + resultat);
        }

      
    }
}