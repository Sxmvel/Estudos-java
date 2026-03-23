package beecrowd;

import java.util.Scanner;

public class bee_2242 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String vogais = "";
        String ehpalin = "S";


        String risada = t.nextLine();
        for (int i = 0; i < risada.length(); i++) {

            char letraAtual = risada.charAt(i);

            if (risada.charAt(i) == 'a'
                    || risada.charAt(i) == 'e'
                    || risada.charAt(i) == 'i'
                    || risada.charAt(i) == 'o'
                    || risada.charAt(i) == 'u') {
                vogais += letraAtual;
            }
        }


        int esquerda = 0;
        int direita = vogais.length() - 1;

        while (esquerda < direita) {
            if (vogais.charAt(esquerda) != vogais.charAt(direita)) {
                ehpalin = "N";
            }
            esquerda++;
            direita--;
        }

        System.out.println(ehpalin);

    }
}
