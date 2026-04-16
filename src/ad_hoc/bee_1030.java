package ad_hoc;

import java.util.Scanner;

public class bee_1030 {

    // A nossa função matemática recursiva!
    public static int josephus(int numeroSoldados, int saltos) {

        // sobrou 1 pessoa. Retornamos a posição dela
        if (numeroSoldados == 1) {
            return 0;
        }

        return (josephus(numeroSoldados - 1, saltos) + saltos) % numeroSoldados;
    }


    static void main() {
        Scanner t = new Scanner(System.in);

        if (!t.hasNextInt()) return;

        int nc = t.nextInt(); // Número de casos de teste

        for (int i = 1; i <= nc; i++) {

            int n = t.nextInt(); // Numero de pessoas
            int k = t.nextInt(); // Numero de saltos


            int sobrevivente = josephus(n, k) + 1;
            System.out.println("Case " + i + ": " + sobrevivente);

        }
        t.close();

    }
}

