package fase1_Logica;

import java.util.Scanner;

public class Desafio09_Extra {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int [] notas = new int[5];
        double soma = 0;

        System.out.println("Informe as 5 notas dos aluno: ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = t.nextInt();
           soma = soma + notas[i];

        }
        double media = soma / notas.length;
        System.out.println(media);

    }
}
