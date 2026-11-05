// Activitat 18 — Nombre de xifres

import java.util.Scanner;

public class NombreDeXifres {
    public static void main(String[] args) {
        // TODO: llegeix un número enter positiu per teclat
        //   divideix-lo successivament entre 10 (prenent la part sencera)
        //   fins obtenir un quocient 0, comptant les divisions fetes amb un comptador
        //   Mostra: "El número <numero> té <xifres> xifres."

        Scanner sc = new Scanner(System.in);

        System.out.println("Entra un número enter positiu:");
        int numero = sc.nextInt();

        int original = numero;
        int xifres = 0;

        while (numero > 0) {

            numero = numero / 10;
            xifres++;
        }

        System.out.println("El número " + original + " té " + xifres + " xifres.");

     
    }
}
    

