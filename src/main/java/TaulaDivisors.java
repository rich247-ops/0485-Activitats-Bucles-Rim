// Activitat 37 — Taula de divisors i dividends (bucles encaixats)

import java.util.Scanner;

public class TaulaDivisors {
    public static void main(String[] args) {
        // TODO: llegeix l'inici i el final dels dividends per teclat
        //   mostra una capçalera amb els dividends (de l'inici al final)
        //   amb dos bucles for encaixats (divisors de l'1 al 10, i dividends de
        //   l'inici al final), mostra una taula: "*" si el dividend és divisible
        //   pel divisor, "-" si no ho és
        //   (pots fer servir System.out.printf amb "%4d" / "%4s" per alinear les
        //   columnes)

        Scanner sc = new Scanner(System.in);

        System.out.println("Entra l'inici dels dividends:");
        int inici = sc.nextInt();

        System.out.println("Entra el final dels dividends:");
        int finalNum = sc.nextInt();

        // Mostrar los dividends de arriba
        System.out.print("    ");
        for (int dividend = inici; dividend <= finalNum; dividend++) {
            System.out.printf("%4d", dividend);
        }
        System.out.println();

        // Mostrar los divisores y los resultados
        for (int divisor = 1; divisor <= 10; divisor++) {

            System.out.printf("%4d", divisor);

            for (int dividend = inici; dividend <= finalNum; dividend++) {

                if (dividend % divisor == 0) {
                    System.out.printf("%4s", "*");
                } else {
                    System.out.printf("%4s", "-");
                }
            }

            System.out.println();
        }

        
    }
}

