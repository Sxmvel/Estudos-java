package beecrowd;

import java.util.Scanner;

public class bee_1168 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);


        // 0,1,2,3,4,5,6,7,8,9
        int[] mapaLeds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};


        int teste = t.nextInt(); // casos de teste
        t.nextLine();

        for (int i = 0; i < teste; i++) {
            String numero = t.nextLine();
            int somaLeds = 0;
            for (int j = 0; j < numero.length(); j++) {
                int indice = numero.charAt(j) - '0';
                somaLeds += mapaLeds[indice];

            }
            System.out.println(somaLeds + " leds");
        }

    }
}
