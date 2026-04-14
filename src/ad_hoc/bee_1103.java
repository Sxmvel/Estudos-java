package ad_hoc;

import java.util.Scanner;

public class bee_1103 {

    static void main() {

        Scanner t = new Scanner(System.in);

        while (t.hasNextInt()) {

            int hora_inicio = t.nextInt(); // Hora do sono
            int min_inicio = t.nextInt(); // Minuto do Sono
            int hora_fim = t.nextInt(); // Hora que acorda
            int minuto_fim = t.nextInt(); // Minuto que dorme

            int inicio_minutos = (hora_inicio * 60) + min_inicio;
            int fim_minutos = (hora_fim * 60) + minuto_fim;

            int duracao = (fim_minutos - inicio_minutos + 1440) % 1440;

            if (duracao != 0) {
                System.out.println(duracao);
            }
        }

    }
}
