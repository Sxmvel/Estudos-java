package recursao;

import java.util.Scanner;

public class collatz {

    public static int contaPassos(int n) {

        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return 1 + contaPassos(n / 2);
        } else {
            return 1 + contaPassos((n * 3) + 1);
        }

    }


    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Informe numero: ");

        int n = t.nextInt();


        int resultado = contaPassos(n);
        System.out.println(resultado);

    }

}
