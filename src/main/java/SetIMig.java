// Activitat 29 — El set i mig

import java.util.Random;
import java.util.Scanner;

public class SetIMig {
    public static void main(String[] args) {
        // TODO: demana l'aposta per teclat
        //   amb un bucle while, la condició del qual combini "total < 7.5" I
        //   "el jugador vol seguir" (condició d'acabament complexa, sense break):
        //     genera una carta aleatòria de l'1 al 10 (8=sota, 9=cavall, 10=rei,
        //     totes valen 0.5; de l'1 al 7 valen el seu número)
        //     suma el seu valor al total i mostra la carta i el total
        //     si el total encara és menor que 7.5, pregunta si vol una altra carta
        //     (si diu que no, deixa de voler seguir)
        //   Quan acabi el bucle, mostra:
        //     "Has Perdut!!!!" si el total supera 7.5
        //     "Has Guanyat <2 x aposta> euros." si el total és exactament 7.5
        //     "El jugador es planta!!!" en cas contrari

       Scanner teclat = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Quant vols apostar?");
        double aposta = teclat.nextDouble();

        double punts = 0;
        String resposta = "s";

        while (punts <= 7.5 && resposta.equals("s")) {

            int carta = random.nextInt(10) + 1;
            double valor;
            String nom;

            if (carta <= 7) {
                valor = carta;
                nom = String.valueOf(carta);
            } else {
                valor = 0.5;

                if (carta == 8) {
                    nom = "sota";
                } else if (carta == 9) {
                    nom = "cavall";
                } else {
                    nom = "rei";
                }
            }

            punts = punts + valor;

            System.out.println("Has tret un " + nom +
                    " (val " + valor + " punts). Portes " + punts + " punts.");

            if (punts <= 7.5) {
                System.out.println("Vols una altra carta? (s/n)");
                resposta = teclat.next();
            }
        }

        if (punts > 7.5) {
            System.out.println("Has Perdut!!!!");
        } else if (punts == 7.5) {
            System.out.println("Has Guanyat " + (aposta * 2) + " euros.");
        } else {
            System.out.println("El jugador es planta!!!");
        }

        
    }
}


    
