// Activitat 15 — Seqüència de 3 en 3, amb final per teclat

import java.util.Scanner;

public class SequenciaDe3en3 {
    public static void main(String[] args) {
        // TODO: demana per teclat el final de la seqüència (un enter)
        //   i mostra, en una sola línia i separats per ", ",
        //   els valors 2, 5, 8, 11, 14... (de 3 en 3) mentre no superin aquest final



        Scanner sc = new Scanner(System.in);

        System.out.println("Quin ha de ser el final de la seqüència?");
        int finalSeq = sc.nextInt();

        int numero = 2;

        while (numero <= finalSeq) {

            System.out.print(numero);

            if (numero + 3 <= finalSeq) {
                System.out.print(", ");
            }

            numero = numero + 3;
        }

    
    }
}
    
