package fase1_Logica;

import java.util.Scanner;

public class Desafio06_While {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println(" 1 - CALCULAR A AREA DO QUADRADO\n 2 - CALCULAR A AREA DO CIRCULO\n 0 - SAIR ");
        int opcao = -1; // para sempre acessar o while

        while(opcao != 0){
            opcao = t.nextInt();
            if(opcao == 1){
                System.out.println("INFORME O LADO");
                int lado = t.nextInt();
                System.out.println("Area do quadrado: " + lado*lado + "M² ");
                System.out.println(" 1 - CALCULAR A AREA DO QUADRADO\n 2 - CALCULAR A AREA DO CIRCULO\n 0 - SAIR ");
            }
            if(opcao == 2){
                System.out.println("INFORME O RAIO DO CIRCULO");
                double raio = t.nextDouble();
                System.out.println("Area do circulo = " + Math.PI * raio * raio + "M² ");
                System.out.println(" 1 - CALCULAR A AREA DO QUADRADO\n 2 - CALCULAR A AREA DO CIRCULO\n 0 - SAIR ");
            }
            if(opcao == 0 ){
                System.out.println("Voce saiu da calculadora de area ");
            }
        }

    }
}
