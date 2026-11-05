
import java.util.Scanner;

// Activitat 27 — Login amb 3 intents (condició d'acabament complexa)
public class LoginTresIntents {
    public static void main(String[] args) {
        // TODO: guarda l'usuari i la contrasenya correctes en dues variables
        //   (per exemple "cponts" / "qw34T1234")
        //   amb un bucle while, la condició del qual combini "intents < 3" I
        //   "encara no s'ha encertat" (condició d'acabament complexa):
        //     demana usuari i contrasenya, comprova si són correctes
        //     mostra "Usuari i contrasenya correctes!" o un missatge d'error
        //     incrementa el comptador d'intents
        //   ⛔ NO facis servir break (ni similar), ni alteris el comptador
        //      d'intents per forçar la sortida del bucle
        //   Si s'acaben els 3 intents sense encertar, mostra "Usuari bloquejat!"
       
       Scanner teclat = new Scanner(System.in);

        String usernameCorrecte = "cponts";
        String passwordCorrecte = "qw34T1234";

        String username = "";
        String password = "";

        int intents = 0;

        while (intents < 3 && (!username.equals(usernameCorrecte) || !password.equals(passwordCorrecte))) {

            System.out.println("Introdueix el nom d'usuari:");
            username = teclat.nextLine();

            System.out.println("Introdueix la contrasenya:");
            password = teclat.nextLine();

            intents++;

            if (username.equals(usernameCorrecte) && password.equals(passwordCorrecte)) {
                System.out.println("Usuari i contrasenya correctes!");
            } else {
                System.out.println("Usuari o contrasenya incorrectes.");
            }
        }

        if (intents == 3 && (!username.equals(usernameCorrecte) || !password.equals(passwordCorrecte))) {
            System.out.println("Usuari bloquejat!");
        }

        
    }
}


       