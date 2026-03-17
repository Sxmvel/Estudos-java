package beecrowd;

import java.util.Arrays;
import java.util.Scanner;

public class cifraCesar_bee {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        int casos = t.nextInt(); // numero de caso de teste
        t.nextLine();

        for (int i = 0; i < casos; i++) {
            String palavra = t.nextLine(); // palavras do caso de teste
            char[] caracter = palavra.toCharArray(); // Vai transformar caso de teste em caracter

            for (int j = 0; j < palavra.length(); j++) {
                caracter[j] = (char) (caracter[j] - 1); // Volta uma posição de cada caracter
            }
            System.out.println(new String(caracter));
        }
        t.close();
    }
}
