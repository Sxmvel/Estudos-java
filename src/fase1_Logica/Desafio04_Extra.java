package fase1_Logica;

import java.util.Scanner;

public class Desafio04_Extra {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);


        System.out.println("Informe o peso em kgs");
        int peso = t.nextInt();
        System.out.println("Informe a altura neste formato X.XX");
        double altura = t.nextDouble();

        double imc = peso/(altura * altura);

        String resultado =  ( imc < 18.5 ) ? "Abaixo do peso":
                            (imc < 25 ) ? "Peso Ideal" : "Sobre peso";

        System.out.println(resultado);
    }
}
