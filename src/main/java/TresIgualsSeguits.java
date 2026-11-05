// Activitat 31 — 3 números iguals seguits

import java.util.Scanner;

public class TresIgualsSeguits {
    public static void main(String[] args) {
        // TODO: llegeix un número i guarda'l com "anterior", amb un comptador de
        //   repeticions consecutives a 1
        //   amb un bucle while (mentre les repeticions consecutives siguin < 3):
        //     llegeix un altre número
        //     si és igual a l'anterior, incrementa el comptador de repeticions
        //     si és diferent, actualitza "anterior" i posa el comptador a 1
        //   Quan surtis del bucle, mostra:
        //   "Has entrat 3 cops seguits el número <anterior>. Adeu!"


         Scanner teclat = new Scanner(System.in);

       int consecutius = 0;
       int ultimnumero = Integer.MIN_VALUE;

       while (consecutius < 3) {

        System.out.println(" Entra un número : ");

        int numero = teclat.nextInt();

        if ( consecutius == 0 || numero == ultimnumero) {
            consecutius++;
        } else {
            consecutius = 1;
        }

        ultimnumero = numero;

       }

       System.out.println( " Has entrat 3 cops seguits el número" + ultimnumero + ". Adeu! ");
       

    }
}
