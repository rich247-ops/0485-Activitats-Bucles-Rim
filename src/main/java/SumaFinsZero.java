
import java.util.Scanner;

// Activitat 21 — Suma acumulada, fins al 0
public class SumaFinsZero {
    public static void main(String[] args) {
        // TODO: llegeix una seqüència de números per teclat (amb un bucle) fins que
        //   l'usuari entri un 0. Vés acumulant la suma en una variable (suma = suma + numero)
        //   i, per cada número (que no sigui 0), mostra "La suma fins ara és <suma>"
        //   Quan s'entri el 0, mostra "La suma total dels números introduïts és: <suma>"

        Scanner teclat = new Scanner(System.in);
        int numero = -1;
        int suma = 0;

        while (numero != 0) {
            System.out.println("Entra un numero:");
            numero = teclat.nextInt();

            if (numero != 0) {
                suma = suma + numero;
                System.out.println("La suma fins ara és " + suma);
            }
        }

        System.out.println("La suma total dels números introduïts és: " + suma);
    }
}