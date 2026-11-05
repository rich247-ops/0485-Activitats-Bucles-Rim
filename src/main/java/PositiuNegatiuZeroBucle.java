// Activitat 03 — Positiu, negatiu o zero (en bucle)

import java.util.Scanner;

public class PositiuNegatiuZeroBucle {
    public static void main(String[] args) {
        // TODO: llegeix 8 números per teclat (amb un bucle) i, per cadascun, mostra:
        //   "Entra el número <i>: " (amb print, sense salt de línia)
        //   i a la línia següent: "és positiu" / "és negatiu" / "és un
        // zero"

        
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 8; i++) {

            System.out.print("Entra el número " + i + ": ");

            int numero = sc.nextInt();

            if (numero > 0) {
                System.out.println("és positiu");
            } else if (numero < 0) {
                System.out.println("és negatiu");
            } else {
                System.out.println("és un zero");
            }
        }

    
    }
}


    


