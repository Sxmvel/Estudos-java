package fase1_Logica;

import java.util.Random;
import java.util.Scanner;

public class Desafio08_Random {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("ADIVINHE UM NUMERO DE 0 A 100");

        Random random = new Random();

        int numero = random.nextInt(101);
        System.out.println(numero);

        int chute = -1;

        while(chute != numero){
            System.out.println("CHUTE UM NÚMERO");
            chute = t.nextInt();

            if(chute > numero){
                System.out.println("CHUTE EH MAIOR");
            }else{
                String s = (chute < numero) ? "CHUTE EH MENOR" : " PARABENS VC ACERTOU O NUMERO";
                System.out.println(s);
            }
        }
    }
}
