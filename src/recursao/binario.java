package recursao;

import java.util.Scanner;

public class binario {

    public static void imprimirBinario(int n){

        if(n == 0  || n == 1 ){
            System.out.print(n);
        }else {
            imprimirBinario(n / 2);
            System.out.print(n % 2);
        }

    }


    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int casos = t.nextInt();

        for (int i = 0; i < casos; i++) {
            int numero = t.nextInt();
            imprimirBinario(numero);
            System.out.println();
        }

    }
}
