// Activitat 11 — Cara o creu, 100 llançaments

import java.util.Random;
import java.util.Scanner;

public class CaraCreu {
    public static void main(String[] args) {
        // TODO: simula 100 llançaments d'una moneda amb Random (0 = cara, 1 = creu)
        //   comptant quantes vegades surt creu amb una variable que
        //   s'incrementi ella mateixa d'un en un (comptador++)
        //   i calcula les cares com 100 - creus
        //   Mostra: "Cares: X" i "Creus: Y"
       
         Scanner teclat= new Scanner(System.in);

        Random random = new Random();
        int creus = 0;
        int i = 0;

        while (i < 100) {
            int moneda = random.nextInt(2);

            if (moneda == 1) {
                creus++;
            }

            i++;
        }

        int cares = 100 - creus;

        System.out.println("Cares: " + cares);
        System.out.println("Creus: " + creus);
    }
        

    }
    
 
