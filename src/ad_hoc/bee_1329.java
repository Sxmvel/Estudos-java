package ad_hoc;

import java.util.Scanner;

public class bee_1329 {

    static void main() {
        Scanner t = new Scanner(System.in);

        while(t.hasNextInt()) {

            int numero_jogadas = t.nextInt(); // Numero de jogadas
            if(numero_jogadas == 0){
                System.exit(0);
            }
            int [] rodadas = new int[numero_jogadas];

            int joao = 0;
            int maria = 0;

            for (int i = 0; i < numero_jogadas; i++) {

                rodadas[i] = t.nextInt(); // 0 ou 1
                if(rodadas[i] == 1){
                    joao += 1;
                }else{
                    maria += 1;
                }
            }
                System.out.println("Mary won " + maria + " times and John won " + joao + " times");
        }

    }
}
