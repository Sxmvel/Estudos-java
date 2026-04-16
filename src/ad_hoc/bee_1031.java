package ad_hoc;

import java.util.Scanner;

public class bee_1031 {

    public static int desligar(int regioes, int pulos) {

        if (regioes == 1) {
            return 0;
        }

        return (desligar(regioes - 1, pulos) + pulos) % regioes;
    }


    static void main() {

        Scanner t = new Scanner(System.in);

        while (t.hasNextInt()) {

            int n = t.nextInt(); // numero de regioes

            if (n == 0) {
                System.exit(0);
            }

            int m = 1; // Testar os pulos

            while (true) {

                int resultadoCaixaPreta = desligar(n - 1, m);
                int regiaoSobrevivente = resultadoCaixaPreta + 2;

                if (regiaoSobrevivente == 13) {
                    System.out.println(m);
                    break;
                }
                m++;
            }
        }
        t.close();
    }
}
