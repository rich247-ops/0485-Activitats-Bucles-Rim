import java.util.Scanner;

public class DiagonalAmbE {
    public static void main(String[] args) {
        // TODO: amb dos bucles for encaixats (files i columnes, de l'1 al 9),
        //   mostra una graella 9x9 amb "*" a totes les posicions, excepte a la
        //   diagonal (quan fila == columna), on hi ha d'anar una "E"

        //Un programa que escriu una línia amb 100 caràcters '-'.

        //Inicialitzem un comptador
        Scanner teclat = new Scanner(System.in);
     for (int fila = 0; fila < 9; fila++) {

            for (int columna = 0; columna < 9; columna++) {

                if (fila == columna) {
                    System.out.print("E ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}