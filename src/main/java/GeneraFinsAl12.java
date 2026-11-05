// Activitat 14 — Genera fins al 12

import java.util.Random;

public class GeneraFinsAl12 {
    public static void main(String[] args) {
        // TODO: amb un bucle do-while, genera números aleatoris entre 0 i 15
        //   fins que surti el 12 (compta les iteracions amb un comptador)
        //   Per cada número que NO sigui el 12, mostra:
        //   "El número generat és: <numero>, falten <distància> per assolir l'objectiu."
        //   (la distància és el valor absolut de numero - 12)
        //   Quan surti el 12, no el mostris: acaba mostrant
        //   "Objectiu assolit en: <iteracions> iteracions"

        Random random = new Random();

        int numero;
        int iteracions = 0;

        do {
            numero = random.nextInt(16);
            iteracions++;

            if (numero != 12) {
                int distancia = Math.abs(12 - numero);

                System.out.println("El número generat és: " + numero +
                        ", falten " + distancia + " per assolir l'objectiu.");
            }

        } while (numero != 12);

        System.out.println("Objectiu assolit en: " + iteracions + " iteracions");
    }
}