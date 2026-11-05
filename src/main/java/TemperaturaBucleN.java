// Activitat 04 — Temperatures en bucle (quantitat per teclat)

import java.util.Scanner;

public class TemperaturaBucleN {
    public static void main(String[] args) {
        // TODO: demana quantes temperatures (N) vol convertir l'usuari
        //   i després, amb un bucle, llegeix N temperatures en Fahrenheit
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9
          
       Scanner sc = new Scanner(System.in);

        System.out.println("Quantes temperatures vols convertir?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Entra la temperatura:");

            double temperatureF = sc.nextDouble();

            double temperatureC = ((temperatureF - 32) * 5) / 9;

            System.out.println(temperatureF + " °F equivalen a " + temperatureC + " °C");
        }

     
    }
}



    

