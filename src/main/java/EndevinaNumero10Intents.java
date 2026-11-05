// Activitat 28 — Endevina el número, 10 intents

import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero10Intents {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 100 (Random)
        //   amb un bucle while, la condició del qual combini "intents < 10" I
        //   "encara no s'ha encertat":
        //     demana un número, i digues si el número generat és més gran o més
        //     petit que el que ha entrat l'usuari, o si l'ha encertat
        //   Si s'esgoten els 10 intents sense encertar, informa'n l'usuari
        //   (mostrant, per exemple, quin era el número)

        Scanner teclat = new Scanner ( System.in);
        Random generador = new Random();

        int numeroaleatori = generador.nextInt(100) + 1;
        int intents = 0;
        boolean encertat = false;

        System.out.println("Endevina un número que he generat entre 1 i 100");
        while(intents <10 && !encertat){
            intents++;
            System.out.println("Entra un número : " + intents);
            int numero = teclat.nextInt();

            if(numero == numeroaleatori) {
                encertat = true;
                System.out.println("Has encertat!");
            } else if (numeroaleatori > numero) {
                System.out.println("El número generat és més gran que el que has pensat");
                
            } else {
                 System.out.println("El número generat és més petit que el que has pensat");
                
            }
            if(!encertat){
                System.out.println(" Has esgotat tot els intents. El número era " + numeroaleatori);
            }
            
        }
    }
}
