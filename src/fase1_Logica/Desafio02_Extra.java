package fase1_Logica;

import java.util.Scanner;

public class Desafio02_Extra {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Informe a idade:");

        int idade = t.nextInt();

        String categoria =  (idade < 12) ? "Criança" :
                            (idade >= 12 && idade <= 17) ? "Adolescente" :
                            ( idade < 60) ? "Adulto" : "Idoso";

        System.out.println(categoria);


    }
}
