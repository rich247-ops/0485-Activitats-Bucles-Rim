// Activitat 24 — Multiplicar amb sumes successives

import java.util.Scanner;

public class MultiplicarAmbSumes {
    public static void main(String[] args) {
        // TODO: llegeix dos operands enters positius per teclat
        //   multiplica'ls fent servir sumes successives (suma "operand1", "operand2" vegades)
        //   i mostra, en una sola línia, "operand1 + operand1 + ... = resultat"
        //   Per exemple, amb 5 i 4: "5 + 5 + 5 + 5 = 20"

        Scanner teclat= new Scanner(System.in);
         System.out.println("Operand 1:");
        int num1 = teclat.nextInt();

        System.out.println("Operand 2:");
        int num2 = teclat.nextInt();

        int suma = 0;

        for (int i = 1; i <= num2; i++) {
            suma = suma + num1;

            System.out.print(num1);

            if (i < num2) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + suma);


    }
}
