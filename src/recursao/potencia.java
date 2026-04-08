package recursao;

import java.util.Scanner;

public class potencia {

    public static int calcularPotencia(int base, int expoente) {
        if(expoente == 0 ){
            return 1;
        }

        return base * (calcularPotencia(base, expoente - 1));

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base:");
        int base = scanner.nextInt();

        System.out.println("Digite o expoente:");
        int expoente = scanner.nextInt();

        int resultado = calcularPotencia(base, expoente);

        System.out.println("O resultado de " + base + " elevado a " + expoente + " eh: " + resultado);
        scanner.close();
    }
}
