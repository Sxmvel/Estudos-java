package fase1_Logica;

import java.util.Scanner;

public class Desafio01_Verificador {

    public static void main(String[] args) {

                Scanner t = new Scanner(System.in);

                int x = t.nextInt();

                if(x % 2 == 0 && x > 0){
                    System.out.println("Número par e positivo");
                }else if(x % 2 != 0 && x > 0){
                    System.out.println("Número impar e positivo");
                } else if (x % 2 == 0 && x < 0) {
                    System.out.println("Numero par e negativo");
                } else if (x % 2 != 0 && x < 0) {
                    System.out.println("Número impar e negativo");
                }else{
                    System.out.println("Número é zero");
                }

            }
    }
