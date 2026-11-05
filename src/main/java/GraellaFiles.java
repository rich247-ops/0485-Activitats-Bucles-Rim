// Activitat 32 — Graella de files (bucles encaixats)
public class GraellaFiles {
    public static void main(String[] args) {
        // TODO: amb dos bucles for encaixats (un extern per a les 8 files i un
        //   d'intern per a les 9 columnes), mostra la figura:
      
        //   cada fila ha de mostrar "1 2 3 4 5 6 7 8 9" (números separats per un espai)

        
             for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}


