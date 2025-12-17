package fase1_Logica;

import java.util.Scanner;

public class Desafio_FOR_01 {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("INFORME UM NUMERO: ");
        int num = t.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + num + " = " + i*num);
        }

    }
}
