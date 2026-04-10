package ad_hoc;

import java.util.Scanner;

public class jogo_Dos_Copos {


    static void main() {
        Scanner t = new Scanner(System.in);

        if (!t.hasNextInt()) return;
        int n = t.nextInt();

        int bola = 2;

        for (int i = 0; i < n; i++) {
            // Lendo quais posições estão sendo trocadas
            int copo_a = t.nextInt();
            int copo_b = t.nextInt();

            // Se a bola estava em uma das posições trocadas, ela muda de lugar
            if (bola == copo_a) {
                bola = copo_b;
            } else if (bola == copo_b) {
                bola = copo_a;
            }

        }



    }
}
