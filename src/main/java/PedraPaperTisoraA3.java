// Activitat 30 — Pedra, paper o tisora, a 3 victòries

import java.util.Random;
import java.util.Scanner;

public class PedraPaperTisoraA3 {
    public static void main(String[] args) {
        // TODO: amb un bucle while, la condició del qual combini "l'ordinador té
        //   menys de 3 victòries" I "l'usuari té menys de 3 victòries" (condició
        //   d'acabament complexa, sense break):
        //     demana la jugada de l'usuari (pedra/paper/tisora)
        //     genera la jugada de l'ordinador (Random: 0=pedra, 1=paper, 2=tisora)
        //     decideix qui guanya la ronda (o si empaten) i actualitza els
        //     comptadors de victòries
        //     mostra el resultat de la ronda i el marcador
        //   Quan acabi el bucle (algú ha arribat a 3 victòries), mostra qui ha
        //   guanyat la partida
         Scanner teclat = new Scanner(System.in);
        Random aleatori = new Random();

        int victoriesUsuari = 0;
        int victoriesOrdinador = 0;

        while (victoriesUsuari < 3 && victoriesOrdinador < 3) {

            System.out.println("Entra pedra, paper o tisora:");
            String usuari = teclat.nextLine().toLowerCase();

            int numero = aleatori.nextInt(3);
            String ordinador;

            if (numero == 0) {
                ordinador = "pedra";
            } else if (numero == 1) {
                ordinador = "paper";
            } else {
                ordinador = "tisora";
            }

            System.out.println("Ordinador ha tret: " + ordinador);

            if (usuari.equals(ordinador)) {
                System.out.println("Heu empatat!!");
            } else if (
                (usuari.equals("pedra") && ordinador.equals("tisora")) ||
                (usuari.equals("paper") && ordinador.equals("pedra")) ||
                (usuari.equals("tisora") && ordinador.equals("paper"))
            ) {
                victoriesUsuari++;
                System.out.println("Has guanyat!");
            } else if (
                usuari.equals("pedra") ||
                usuari.equals("paper") ||
                usuari.equals("tisora")
            ) {
                victoriesOrdinador++;
                System.out.println("Has perdut!");
            } else {
                System.out.println("Jugada no correcta!");
            }

            System.out.println("Ordinador: " + victoriesOrdinador +
                    " , tu: " + victoriesUsuari);
        }

        if (victoriesUsuari == 3) {
            System.out.println("Has guanyat la partida!");
        } else {
            System.out.println("L'ordinador ha guanyat la partida!");
        }

    }
}
    
