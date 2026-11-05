
import java.util.Random;
import java.util.Scanner;

// Activitat 12 — Comptar parells i senars, aleatoris
public class ParellsISenarsAleatoris {
    public static void main(String[] args) {
        // TODO: demana quants números vol generar l'usuari (N)
        //   genera N números aleatoris (per exemple, entre 1 i 100, amb Random)
        //   compta'n quants són parells (numero % 2 == 0) amb un comptador
        //   i calcula els senars com N - parells
        //   Mostra: "Han sortit X números parells i Y senars"

       Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Quants números vols generar?");
        int n = sc.nextInt();

        int parells = 0;
        int senars = 0;

        for (int i = 1; i <= n; i++) {

            int numero = random.nextInt(100) + 1;

            if (numero % 2 == 0) {
                parells++;
            } else {
                senars++;
            }
        }

        System.out.println("Han sortit " + parells +
                " números parells i " + senars + " senars");

    
    }
}
      

       
        



