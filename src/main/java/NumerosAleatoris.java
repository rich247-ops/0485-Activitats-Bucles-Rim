// Activitat 02 — Números aleatoris

import java.util.Random;

public class NumerosAleatoris {
    public static void main(String[] args) {
        // TODO: genera 50 números aleatoris entre 1 i 15 (tots dos inclosos, amb Random)
        //   i mostra'ls per pantalla, un per línia (amb un bucle)
      
         

          Random random = new Random();

        for (int i = 1; i <= 50; i++) {

            int numero = random.nextInt(15) + 1;

            System.out.println(numero);
        }
    }
}