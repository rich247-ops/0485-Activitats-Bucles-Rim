// Activitat 01 — Temperatures en bucle

import java.util.Scanner;

public class TemperaturaBucle {
    public static void main(String[] args) {
        // TODO: demana per teclat 5 temperatures en graus Fahrenheit (una per una, amb un bucle)
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9

          Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {

            System.out.println("Introdueix la temperatura en Fahrenheit (" + i + "/5):");

            double temperatureF = sc.nextDouble();

            double temperatureC = ((temperatureF - 32) * 5) / 9;

            System.out.println(temperatureF + " °F equivalen a " + temperatureC + " °C");
        }

      
    }
}