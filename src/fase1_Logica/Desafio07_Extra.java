package fase1_Logica;


import java.util.Scanner;

public class Desafio07_Extra {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Escolha um número para encontrar seu fatorial");

        long numero = t.nextInt();


        for (long i = numero - 1; i >= 1 ; i--) {
            numero = numero * i;
        }
        System.out.println(numero);

    }
}
