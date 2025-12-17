package fase1_Logica;


import java.util.Scanner;

public class Desafio07_Extra {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Escolha um número para encontrar seu fatorial");

        int numero = t.nextInt();
        int aux = numero;

        for (int i = numero - 1; i >= 1 ; i--) {
            numero = aux * i;
            aux = numero;
        }
        System.out.println(numero);

    }
}
