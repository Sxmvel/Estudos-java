package recursao;

import java.util.Scanner;

public class palindromo_recursivo {

    public static boolean isPalindromo(String palavra, int esquerda, int direita) {

        // caso base
        if (esquerda >= direita) {
            return true;
        }

        // caso teste
        if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
            return false;
        }

       return isPalindromo(palavra, esquerda + 1, direita - 1); // Sinal que as letras sao igual


    }


    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        String palavra = t.nextLine();

        boolean resultado = isPalindromo(palavra, 0, palavra.length() - 1);

        if (resultado) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }


    }
}
